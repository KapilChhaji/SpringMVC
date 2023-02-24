package baocontroller;
import daomodel.us;
import daomodel.usermodel;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class usercontroller {
@RequestMapping("userload")
public ModelAndView userload(){
	return new ModelAndView("home");
}
@RequestMapping("usercode")
public ModelAndView usercode() {
	return new ModelAndView("userregg","command",new usermodel());

}
@RequestMapping("usereg")
public ModelAndView stucode(@ModelAttribute("xyz")us obj,HttpServletRequest req) {
	Configuration cfg=new Configuration();
	cfg.configure("hibernet.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session s=sf.openSession(); 
	Transaction tx=s.beginTransaction();
	usermodel st=new usermodel();
	st.setUserid(obj.getUserid());
	st.setUsername(obj.getUsername());
	st.setPassword(obj.getPassword());
		s.save(st);
		tx.commit();
		return new ModelAndView("hello","command",new usermodel());

	
	
}
	
	
}


	


