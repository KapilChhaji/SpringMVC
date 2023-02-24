package bao;
import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;

	@Controller
	public class hellocontrolar  {
		@RequestMapping("welcome")
		public String index()
		{
			return "welcome";
		}

	}



