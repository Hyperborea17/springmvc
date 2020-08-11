package javatest.formsayfasi;


import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppController {
@Autowired
private BilgilerService service;
@RequestMapping("/")
public String showNewForm(Model model) {
Bilgiler bilgiler=new Bilgiler();
model.addAttribute("bilgiler",bilgiler);
return "index";	
}
@RequestMapping(value="/kaydet" , method=RequestMethod.POST)
public String saveBilgiler(@ModelAttribute("bilgiler") Bilgiler bilgiler){
service.save(bilgiler);
return "index";
}
}
