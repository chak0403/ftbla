package football.controller;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import football.pojo.ResultPojo;
import football.svc.FootballAnalysisService;
	
@RestController
public class BaseController {

	@Autowired
	private LocalSessionFactoryBean sessionFactory;
	
	@Autowired
	private HibernateTransactionManager txnManager;
	


	
//    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
//    @ResponseBody
//    public List greeting(@RequestParam(value="gameid") Integer id) {
//    	ResultPojo result = new ResultPojo();
//    	System.out.println("isOK");
//
////    	Session session = sessionFactory.getCurrentSession();
////    	session.
//    	Session session = factory.openSession();
//    	
////    	SQLQuery qry = session.createSQLQuery("select * from excelresult");
////    	session.get(result.getClass(), 200);
//    	Query query = session.createQuery("from ResultPojo where id = " + id);
//    	List list = query.list();
//    	return list;
//    }
    
}
