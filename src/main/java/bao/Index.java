package bao;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Index {
	@RequestMapping ("home")
	public String homepage() {
		return "home";
	}
	@RequestMapping ("about")
	public String aboutpage() {
		return "about";
	}
	@RequestMapping ("contact")
	public String contactpage() {
		return "contact";
	}
	@RequestMapping ("service")
	public String servcepage() {
		return "service";
	}
	@RequestMapping ("gallery")
	public String gallerypage() {
		return "gallery";
	}
	

}
