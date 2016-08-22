package football.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import football.pojo.ExcelResult;
import football.svc.FootballAnalysisService;

@Controller
public class FootballAnalysisController extends BaseController {
	
	@Autowired
	private FootballAnalysisService faSvc;
	
    @RequestMapping(value = "/analysisSmallBig", method = RequestMethod.GET)
    public @ResponseBody List<ExcelResult> analysisSmallBig() {
//    	faSvc.analysisSmallBig();
    	List<ExcelResult> list = faSvc.test();
    	return list;
    }
}
