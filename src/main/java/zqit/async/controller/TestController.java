package zqit.async.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import zqit.async.pulgins.async.task.DemoATask;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@Autowired
    private DemoATask demoATask;
	
	@GetMapping("/a")
	public String a(){
		demoATask.startMyTreadTask();
		return "/test/a";
	}
	
}
