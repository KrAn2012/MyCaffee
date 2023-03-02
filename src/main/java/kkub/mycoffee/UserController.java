package kkub.mycoffee;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;




@Controller
@ComponentScan
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/myCoffee")
    public String index(Model model) {
        UserMyCoffee userMyCoffee = new UserMyCoffee();
        model.addAttribute("userMyCoffee", userMyCoffee);
        return "myCoffee";
    }

    @PostMapping ("/loginPage")
    public String loginPage(@ModelAttribute("userMyCoffe")UserMyCoffee userMyCoffee, Model model ) {
        model.addAttribute(userMyCoffee);
        return "loginPage";
    }

    @GetMapping("/registrationPage")
    public String registrationPage(Model model) {
        UserMyCoffee userMyCoffee = new UserMyCoffee();
        model.addAttribute("userMyCoffee", userMyCoffee);
        return "registrationPage";
    }

    @PostMapping("/registrationPage")
    public String registrationPage(@ModelAttribute("userMyCoffee") UserMyCoffee userMyCoffee , Model model) {
        model.addAttribute("userMyCOffee",userMyCoffee);
        userRepository.save(userMyCoffee);
        return "registrationConfirmed";
    }

  
    
}
