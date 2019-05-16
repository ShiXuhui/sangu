package com.lingyun.web.webcontroller;

/*import com.lingyun.framework.domain.PhoneUser;
import com.lingyun.framework.utils.CheckSumbulider;*/
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class WebController {



	/**
	 * 返回前台首页
	 * @return
	 */
	@RequestMapping({"/","/index"})
	public String index(){
		return "web/index";
	}

	/**
	 * 返回职位页面
	 * @return
	 */
	@RequestMapping("/job_list")
	public String job_list(){
		return "web/jobs/jobs_list";
	}

	/**
	 * 返回找人才界面
	 * @return
	 */
	@RequestMapping("/resume_list")
	public String resume_list(){
		return "web/resume/resume_list";
	}

	/**
	 * hr工具箱界面
	 * @return
	 */
	@RequestMapping("/toHrtools")
	public String toHrtools(){
		return "web/hrtools";
	}

	/**
	 * 职场资讯
	 * @return
	 */
	@RequestMapping("/toNews")
	public String toNews(){
		return "web/news";
	}

	/**
	 * 企业专访
	 * @return
	 */
	/*@RequestMapping("/toInterview")
	public String toInterview(){
		return "web/interview";
	}
	@RequestMapping("/checkout_phone")
	@ResponseBody
	public String checkout_phone(@Valid PhoneUser phoneUser, BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			return bindingResult.getFieldError().getDefaultMessage();
		}else {
			return "ok";
		}
	}*/



}
