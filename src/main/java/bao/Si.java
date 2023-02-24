package bao;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Si {
	@RequestMapping("Si1")
  public String add(){
	  return "sii";
  }
	@RequestMapping("sia")
	  public ModelAndView addcode(HttpServletRequest request, HttpServletResponse response){
		int a = Integer.parseInt(request.getParameter("txtnum1"))* Integer.parseInt(request.getParameter("txtnum2"))*Integer.parseInt(request.getParameter("txtnum2"))/100;
		
		return new ModelAndView("sii","key","result is "+a);
	  }
}



