package bao;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dao.Operator;

@Controller

public class Opera  {
@RequestMapping("Opload")
public ModelAndView siLoad()
{
	return new ModelAndView("Operator1","command",new Operator());
}
@RequestMapping("Opcode")
public ModelAndView siCode(@ModelAttribute("spring-web-mvc")Operator s) {
	int ch=s.getL();
	int res=0;

switch(ch){
case 1:
	res=s.getN1()+s.getN2();
	break;
case 2:
	res=s.getN1()-s.getN2();
	break;
case 3:
	res=s.getN1()*s.getN2();
	break;
case 4:
	res=s.getN1()/s.getN2();
	break;
case 5:
	res=s.getN1()%s.getN2();
	break;
	
}
		
	


ModelAndView obj = new ModelAndView("Operator1","command",new Operator());
obj.addObject("key",res);

return obj;
}

}