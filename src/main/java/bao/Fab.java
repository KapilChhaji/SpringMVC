package bao;
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.servlet.ModelAndView;

	import dao.Fabnosis;

	@Controller

	public class Fab  {
	@RequestMapping("fabload")
	public ModelAndView siLoad()
	{
		return new ModelAndView("fiview","command",new Fabnosis());
	}
	@RequestMapping("ficode")
	public ModelAndView siCode(@ModelAttribute("spring-web-mvc")Fabnosis s)
	{
		int n1=0;
		int n2=1;
		int n3;
		int i; 
		String  si=" ";
		int num=s.getN();
		si=n1+" "+n2;
		for(i=2;i<=num;i++) {
			n3=n1+n2;
			si=si+n3;
			n1=n2;
			n2=n3;
		}
		
		
		ModelAndView obj = new ModelAndView("fiview","command",new Fabnosis());
		obj.addObject("key",si);
		return obj;
		
		
		//return new ModelAndView("siview","command",new Si()).addObject("key","result is "+si);
		//return new ModelAndView("sires","key","result is "+si);
	}
	}

		



