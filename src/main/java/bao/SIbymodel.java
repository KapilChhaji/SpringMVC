package bao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dao.Si;

@Controller

public class SIbymodel {
@RequestMapping("siload")
public ModelAndView siLoad()
{
	return new ModelAndView("siview","command",new Si());
}
@RequestMapping("sicode")
public ModelAndView siCode(@ModelAttribute("spring-web-mvc")Si s)
{
	float si = (s.getP() * s.getR()* s.getT())/100;
	//ModelAndView obj = new ModelAndView("siview","command",new Si());
	//obj.addObject("key","result is "+si);
	//return obj;
	//return new ModelAndView("siview","command",new Si()).addObject("key","result is "+si);
	return new ModelAndView("sires","key","result is "+si);
}
}

	


