package com.lingyun.web.webcontroller;

import com.lingyun.framework.utils.HttpClientUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@RestController
public class GetCodeController implements Runnable {

	@RequestMapping("/getCode")
	public String getCode(String phoneNumber) {
		String url = "https://api.netease.im/sms/sendcode.action";
		Map<String, String> map = new HashMap<String, String>();
		map.put("mobile", phoneNumber);
		HttpClientUtil clientUtil = new HttpClientUtil();
		return clientUtil.doPost(url, map, "utf-8");
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
