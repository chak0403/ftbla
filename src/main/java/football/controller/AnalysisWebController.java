package football.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import football.svc.FootballAnalysisService;

@Controller
@RequestMapping("/web")
public class AnalysisWebController extends BaseController{
	
	private Logger logger = Logger.getLogger(AnalysisWebController.class);
	
	@Autowired
	FootballAnalysisService analysisSvc;
	
	@RequestMapping(value="/init", method=RequestMethod.GET)
	public ModelAndView init(ModelAndView mav){
		mav.addObject("datas", new Gson().toJson(analysisSvc.analysis()));
		mav.setViewName("web-init");
		return mav;
	}
}
