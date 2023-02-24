package bao;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dao.Ex;

@Controller

public class Examplee  {
@RequestMapping("Exload")
public String siLoad(Model mp)
{
	Ex obj=new Ex();
	mp.addAttribute("lan",obj);
	return "Example";
	
}
@RequestMapping("Excode")
public ModelAndView siCode(@ModelAttribute("spring-web-mvc")Ex s) {
	String result="";
	String result1="";
	if(s.getCourse()!=null) {
		result=s.getCourse();
	}
	if(s.getCourse1()!=null) {
		result1=s.getCourse1();
	}
	
	

ModelAndView obj = new ModelAndView("Example","command",new Ex());
obj.addObject("key",result+""+result1);

return obj;
}

}