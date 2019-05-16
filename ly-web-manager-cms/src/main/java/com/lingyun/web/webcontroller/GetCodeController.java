package com.lingyun.web.webcontroller;

import com.alibaba.fastjson.JSONObject;
import com.lingyun.framework.utils.HttpClientUtil;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@RestController
public class GetCodeController implements Runnable {

	private StringRedisTemplate redisTemplate;

	@RequestMapping("/getCode")
	public void getCode(String phoneNumber) {
		String url = "https://api.netease.im/sms/sendcode.action";
		Map<String, String> map = new HashMap<String, String>();
		map.put("mobile", phoneNumber);
		map.put("templateid","9784462");
		HttpClientUtil clientUtil = new HttpClientUtil();
		 clientUtil.doPost(url, map, "utf-8");
		JSONObject code = JSONObject.parseObject(clientUtil.doPost(url, map, "utf-8"));
		redisTemplate.opsForValue().set(phoneNumber,code.getString("obj"),300,
				TimeUnit.SECONDS);
		System.out.println(redisTemplate.opsForValue().get("obj"));
	}

	@Override
	public void run() {
		ExecutorService executorService = Executors.newFixedThreadPool(3);  //创建线程池，中有三个线程对象
		GetCodeController GetCodeController = new GetCodeController();
		executorService.submit(GetCodeController);
		executorService.submit(GetCodeController);
		executorService.submit(GetCodeController);
		executorService.shutdown();
	}
}
