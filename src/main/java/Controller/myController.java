package Controller;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import Entity.Result;
import Service.myService;

//All the APIs are here, all entries at single place, call from UI.

@Controller
public class myController {
  @Autowired	
  myService ms;
  
  public myController() {
	super();
  }


  @RequestMapping(value = "/thankyou")
	public ModelAndView thankyou(ModelAndView model) throws IOException {
	   ModelAndView mv=new ModelAndView();
		mv.setViewName("Thankyou");
		return mv;
	}
  
  
  @RequestMapping(value = "/newResult", method = RequestMethod.GET)
	public ModelAndView newResult(ModelAndView model) {
		Result r=new Result();
		model.addObject("result",r);
		model.setViewName("ResultForm");
		return model;
	}
  
   @RequestMapping(value = "/saveResult", method = RequestMethod.POST)
	public ModelAndView saveResult(@ModelAttribute Result res) {
	    Result r=ms.getResult(res.getRoll());
		if (r == null) { 
		     ms.saveResult(res);
		} else {
			 ms.updateResult(res);
		}
		return new ModelAndView("redirect:/thankyou");
    } 	
   
   @RequestMapping(value = "/getResult", method = RequestMethod.GET)
	public ModelAndView getResult(@RequestParam int roll) {
		ModelAndView model=new ModelAndView();
		Result r=ms.getResult(roll);
		model.addObject("result",r);
		model.setViewName("SingleResult");
		return model;
	}
   
   @RequestMapping(value = "/getAllResultEdit",method=RequestMethod.GET )
  	public ModelAndView getAllResultEdit(ModelAndView model)throws IOException {
  		List<Result> lt=new ArrayList<>();
  		lt=ms.getAllResult();
  		model.addObject("listResult",lt);
  		model.setViewName("AllResultEdit");
  		return model;
  	}
   
   @RequestMapping(value = "/getAllResult",method=RequestMethod.GET)
 	public ModelAndView getAllResult(ModelAndView model)throws IOException {
 		List<Result> listResult=new ArrayList<Result>();
 		System.out.println("List of Result");
 		listResult=ms.getAllResult();
 		for(Result item:listResult)
 			System.out.println(item);
 		model.setViewName("AllResult");
 		model.addObject("listResult",listResult);
        return model;
 	}

   @RequestMapping(value = "/deleteResult", method = RequestMethod.GET)
	public ModelAndView deleteEmployee(HttpServletRequest request) {
		int roll = Integer.parseInt(request.getParameter("roll"));
		ms.deleteResult(roll);
		return new ModelAndView("redirect:/thankyou");
	}

	@RequestMapping(value = "/updateResult", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {
		int roll = Integer.parseInt(request.getParameter("roll"));
		Result r=ms.getResult(roll);
		ModelAndView model = new ModelAndView("ResultForm");
		model.addObject("result",r);

		return model;
	}
	
	
}
