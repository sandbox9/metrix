package sample.front.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import sample.front.model.Member;
import sample.front.service.SampleFrontService;

@Controller
public class SampleFrontController {

	@Autowired
	private SampleFrontService service;
	

	@RequestMapping("/")
	@ResponseBody
	String home() {
		
		String callSample = service.callSample();
		String callSample2 = service.callSample2("sample", 2);
		
		Member member = service.getMember("TEST1");
		
		return "Hello World! " + member.getName() + " " + callSample + " " + callSample2;
	}
}
