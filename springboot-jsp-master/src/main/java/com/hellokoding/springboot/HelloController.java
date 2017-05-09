package com.hellokoding.springboot;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.conection.query;
@Controller
public class HelloController {


    
    @RequestMapping("/")
    public String homePage() {
    
        return "index";
    }
    
    @RequestMapping("/vidu")
    public String viduPage() {
    	query get = new query();
    	 get.setData("haah");
        return "edit";
    }
    
    
    
    @RequestMapping("/edit")
    public String editPage(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) throws Exception {


    	query get = new query();
    	String data = get.getData();
      
        model.addAttribute("name",data);
   
    	
        return "edit";
    }
    @RequestMapping(value ="edit/upload",method = RequestMethod.GET)
    @ResponseBody 
    public String uploadck(Model model,@RequestParam("noidung") String noidung) {
    	try{
             
        	query get = new query();
	    	get.setData(noidung);
	    	return "Up du lieu hoan tat";
    	}
    	catch (Exception e) {
    		return "That bai!";
		}
        
    }
   

       

  

}
  

     
  
    

    	
    	
    
    

