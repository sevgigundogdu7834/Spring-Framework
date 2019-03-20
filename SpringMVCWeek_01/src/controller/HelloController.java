package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import service.HelloService;

@Controller
public class HelloController {

	private HelloService helloService;
	
	public void setHelloService(HelloService helloService) {
		this.helloService = helloService;
	}


	@RequestMapping(value="/message",method=RequestMethod.GET)
	public String message(ModelMap model) {
		String msgString= helloService.coolMessage();
		model.addAttribute("myMessage",msgString);
		return "helloPages";
	}
}
