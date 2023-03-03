package kkub.mycoffee;


import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


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

    @PostMapping("/loginPage")
    public String loginPage(@ModelAttribute("userMyCoffe") UserMyCoffee userMyCoffee, Model model) {
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
    public String validOk(
            @Valid @ModelAttribute("userMyCoffee") UserMyCoffee userMyCoffee,
            BindingResult bindingResult,
            RedirectAttributes ra,
            Model model)
    { if (bindingResult.hasErrors()){
        model.addAttribute("userMyCoffee",userMyCoffee);
        return "registrationPage";
    } try{
        ra.addFlashAttribute("userMyCoffee",userMyCoffee);
        userRepository.save(userMyCoffee);
        return "registrationConfirmed";
    } catch (Exception e) {
        throw new RuntimeException(e);

    }
}}

