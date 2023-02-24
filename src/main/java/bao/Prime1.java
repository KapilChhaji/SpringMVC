package bao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dao.Prime;

@Controller

public class Prime1 {
@RequestMapping("piload")
public ModelAndView siLoad()
{
	return new ModelAndView("piview","command",new Prime());
}
@RequestMapping("picode")
public ModelAndView siCode(@ModelAttribute("spring-web-mvc")Prime s)
{

	int i; 
	String  si=" ";
	int num=s.getN();
	for(i=2;i<num;i++) {
		if(num%i==0) {
		si="Not Prime";
		break;
		}
	}
		if(i==num) {
			si="Prime";
			
		}
	
	
	ModelAndView obj = new ModelAndView("piview","command",new Prime());
	obj.addObject("key",num+" "+si);
	return obj;
	
	
	//return new ModelAndView("siview","command",new Si()).addObject("key","result is "+si);
	//return new ModelAndView("sires","key","result is "+si);
}
}

	


