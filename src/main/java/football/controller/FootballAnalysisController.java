package football.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import football.svc.FootballAnalysisService;

@RestController
public class FootballAnalysisController extends BaseController {
	
	@Autowired
	private FootballAnalysisService faSvc;
	
    @RequestMapping(value = "/analysisSmallBig", method = RequestMethod.GET)
    
    public @ResponseBody String analysisSmallBig() {
    	faSvc.analysisSmallBig();
    	return "";
    }
}
