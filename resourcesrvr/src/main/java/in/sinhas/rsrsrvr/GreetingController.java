package in.sinhas.rsrsrvr;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class GreetingController {

	private final GreetingService greetingService;
	
	public GreetingController(GreetingService greetingService) {
		this.greetingService = greetingService;
	
	}
	
	@GetMapping("/")
	Map<String, String> hello(){
		
		
		return this.greetingService.greet();
	}
}
