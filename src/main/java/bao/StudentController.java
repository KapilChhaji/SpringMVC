/*package bao;

import org.hibernate.Transaction;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dao.*;



@Controller
public class StudentController {
    @RequestMapping("stuload")
	public ModelAndView stuload() {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session s=sf.openSession();
    	Query q = s.createQuery("from Student s");
    	List ls = q.list();
    	ModelAndView mo=new ModelAndView("stuview","command",new Stu());
    	mo.addObject("key1",ls);
    
    
    	return mo;
		
	}
    @RequestMapping("stucode")
    public ModelAndView stucode(@ModelAttribute("xyz")Stu obj,HttpServletRequest req) {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session s=sf.openSession();
         Transaction tx=s.beginTransaction();
    	Student st=new Student();
    	st.setRno(obj.getRno());
    	st.setName(obj.getName());
    	if(req.getParameter("btnsubmit").equals("Update"))
    	{
    		s.update(st);
    		
    	}
    	else {
    		s.save(st);
    	}
    	
    	tx.commit();
    	Query q = s.createQuery("from Student s");
    	List ls = q.list();
    	s.close();
    	ModelAndView mo=new ModelAndView("stuview","command",new Student());
    	mo.addObject("key1",ls);
    	mo.addObject("key","Operation Success");
    
    	return mo;
    }
  
    @RequestMapping("select")
    
    public ModelAndView selectcode() {
    	
    Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory sf = cfg.buildSessionFactory();
	Session s = sf.openSession();
	Query q = s.createQuery("from Student s");
	List ls = q.list();
	s.close();
	return new ModelAndView("stuview","command",new Student()).addObject("key1",ls);
   

}
    @RequestMapping("edit")  
    public ModelAndView editcode(ServletRequest request) {
    	Configuration cfg = new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory sf = cfg.buildSessionFactory();
    	Session s = sf.openSession();
    	Student o=(Student) s.get(Student.class, Integer.parseInt(request.getParameter("q")));
    	Query q = s.createQuery("from Student s");
    	List ls = q.list();
    	s.close();
    	ModelAndView mo=new ModelAndView("stuview","command",o);
    	mo.addObject("key1",ls);
    	mo.addObject("btnkey","update");
    	return mo;
    }
    @RequestMapping("delete")  
    public ModelAndView deletecode(ServletRequest request) {
    	Configuration cfg = new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory sf = cfg.buildSessionFactory();
    	Session s = sf.openSession();
    	Transaction tx=s.beginTransaction();
    	Student o=(Student) s.get(Student.class, Integer.parseInt(request.getParameter("q")));
    	 s.delete(o);
	    tx.commit();
	    s.close();
	    return new ModelAndView("stuview","command",o);
    	
}
}

*/
package bao;

import org.hibernate.Transaction;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dao.*;

import Helper.HiberHelper;
@Controller
public class StudentController {
	HiberHelper db = new HiberHelper();
   @RequestMapping("stuload")
   public ModelAndView stuLoad1(HttpServletRequest request)
   {
	   HttpSession session = request.getSession();
   if(session.getAttribute("uid")==null)
   {
	  return new ModelAndView("redirect:login.html");
   }
	   db.hiberConfigure();
	   List lst = db.getData("from Student s");
	   ModelAndView mo = new ModelAndView("stuview","command",new Stu());
	   mo.addObject("key1",lst);
	   List lst1=db.getData("from Admin o where o.userid='"+session.getAttribute("uid").toString()+"'");
	   mo.addObject("key2",lst1);
	   return mo;
   }
   @RequestMapping("stucode")
   public ModelAndView stuCode(@ModelAttribute("xyz")Stu obj,HttpServletRequest req)
   {
	   db.hiberConfigure();
	   Student st = new Student();
	   st.setRno(obj.getRno());
	   st.setName(obj.getName());
	   if(req.getParameter("btnsubmit").equals("Update"))
	   {
		 db.updateData(st);
	   }
	   else
	   {
	   
	   db.insertData(st);
	   }
	   List lst = db.getData("from Student s");
	   ModelAndView mo = new ModelAndView("stuview","command",new Student());
	   mo.addObject("key1",lst);
	   mo.addObject("key", "Operation Success");
	   
	   return mo;
   }
   @RequestMapping("select")
   public ModelAndView viewstu()
   {
	  db.hiberConfigure();
	   List lst = db.getData("from Student s");
	   return new ModelAndView("stuview","command",new Student()).addObject("key1",lst);
   }
   @RequestMapping("edit")
   public ModelAndView editstu(HttpServletRequest request)
   {
	   db.hiberConfigure();
	   Student o =(Student) db.findData(Student.class,Integer.parseInt(request.getParameter("q")));
	   List lst = db.getData("from Student s");
	   ModelAndView mo = new ModelAndView("stuview","command",o);
	   mo.addObject("key1",lst);
	   mo.addObject("btnkey","update");
	   return mo;
   }
   @RequestMapping("delete")
   public ModelAndView deletestu(HttpServletRequest request)
   {
	   db.hiberConfigure();
	   db.deleteData(Student.class,Integer.parseInt(request.getParameter("q")));
	   return new ModelAndView("redirect:stuload.html");
   }
}
