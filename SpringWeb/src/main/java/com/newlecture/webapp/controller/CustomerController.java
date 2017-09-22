package com.newlecture.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/customer/*")//요즘 방식이다.
public class CustomerController {

	//notice 페이지
	@RequestMapping("notice")
	@ResponseBody//반환되는 값이 뷰를 나타내는 주소이지만, 이 것을 써주면 뷰를 찾지 말고 출력할
									//문자열이라는 것을 알려준다.
	public String notice( //@RequestParam(value="p" defaultValue="1") Integer page, 
			@RequestParam(value="p", defaultValue="1") Integer page, 
			@RequestParam(value="q", defaultValue="") String query) {

		String output = String.format("page:%s, query:%s", page,query);
		return output;
		
	}
	
	@RequestMapping("notice/{id}")//요즘 방식이다. 변수를 id라는 변수를 쓴다 pass valeable
	@ResponseBody//반환되는 값이 뷰를 나타내는 주소이지만, 이 것을 써주면 뷰를 찾지 말고 출력할
	//문자열이라는 것을 알려준다.
	public String noticeDetail(
			@PathVariable("id") String addid) {

		return addid+"st notice";
		//return "hello notice-detail";
		
	}
}
