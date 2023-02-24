package bao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import dao.Admin;
import dao.Stu;
import dao.ru;
import dao.register;
import dao.Student;
import Helper.HiberHelper;

@Controller
public class loginconroller {
	HiberHelper db = new HiberHelper();
	@RequestMapping("regg")
	public ModelAndView regg()
	{
		return new ModelAndView("index","command",new Admin());
	}
	@RequestMapping("regcode")
	   public ModelAndView regCode(@ModelAttribute("xyz")ru obj,HttpServletRequest req)
	   {
		   db.hiberConfigure();
		   register st = new register();
		   st.setUserid(obj.getUserid());
		   st.setPassword(obj.getPassword());
		   db.insertData(st);
		   return new ModelAndView("login","command",new Admin());
	   }
@RequestMapping("login")
public ModelAndView login()
{
	return new ModelAndView("login","command",new Admin());
}
@RequestMapping("logincode")
public ModelAndView logincode(@ModelAttribute("xyz")Admin obj, HttpServletRequest request)
{
	db.hiberConfigure();
	List lst = db.loginData("from Admin o where o.userid=? and o.password=?",obj.getUserid(),obj.getPassword());
	if(lst.size()>0)
	{
		HttpSession session = request.getSession();
		session.setAttribute("uid",obj.getUserid());
		return new ModelAndView("redirect:stuload.html");
	}
	return new ModelAndView("login","command",new Admin()).addObject("key","Invalid Credentials");
}
@RequestMapping("logout")
public ModelAndView logout(HttpServletRequest request)
{

	HttpSession session = request.getSession();
	session.removeAttribute("uid");
	return new ModelAndView("login","command",new Admin());
}
}