package football.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import football.pojo.ResultPojo;

@Repository
public class FootBallAnaylsisDao extends BaseDao{
	
	public List<String> getSBAllOdds(){
    	Session session = sessionFactory.openSession();
    	Query query = session.createSQLQuery("select distinct fullSBOdd from excelresult");
    	return query.list();
	}
	
	public List<ResultPojo> getSBOddsRecord(String odd){
    	Session session = sessionFactory.openSession();
    	String sql = "from ResultPojo where fullSBOdd ='"+odd+"'";
//    	sql +=" and gameDate > '2014-01-01'";
//    	sql +=" and (home = '曼聯' or away = '曼聯')";
    	Query query = session.createQuery(sql);
    	List<ResultPojo> results = new ArrayList<ResultPojo>();
    	for(Object obj : query.list()){
    		results.add((ResultPojo)obj);
    	}
    	return results;
	}
	
	public List<BigDecimal> getAllBigOddRateList(String odd){
    	Session session = sessionFactory.openSession();
    	String sql = "select distinct fullSBBig from excelresult where fullSBOdd ='"+odd+"' order by fullSBBig";
    	Query query = session.createSQLQuery(sql);
    	return query.list();
	}
	
	public List<ResultPojo> getBigOddRateResultList(BigDecimal rate){
    	Session session = sessionFactory.openSession();
    	String sql = "from ResultPojo where fullSBBig =" + rate;
    	Query query = session.createQuery(sql);
    	return query.list();
	}
}