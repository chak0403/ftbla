package football.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

@Controller
@RequestMapping("/web")
public class AnalysisWebController extends BaseController{
	
	private Logger logger = Logger.getLogger(AnalysisWebController.class);
	
	@RequestMapping(value="/init", method=RequestMethod.GET)
	public ModelAndView init(ModelAndView mav){
		logger.info("test");
		mav.addObject("datas", new Gson().toJson("test"));
		mav.setViewName("web-init");
		return mav;
	}
}
