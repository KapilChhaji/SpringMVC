package bao;


	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.servlet.ModelAndView;

	@Controller
	public class Addition1 {
		@RequestMapping("adddesign1")
	  public String add(){
		  return "addview";
	  }
		@RequestMapping("addload")
		  public ModelAndView addcode(HttpServletRequest request, HttpServletResponse response){
			int a = Integer.parseInt(request.getParameter("txtnum1"))+ Integer.parseInt(request.getParameter("txtnum2"));
			
			return new ModelAndView("addview","key","result is "+a);
		  }
	}



