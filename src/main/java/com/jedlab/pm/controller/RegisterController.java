package com.jedlab.pm.controller;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import com.jedlab.pm.model.User;
import com.jedlab.pm.service.UserService;

@Controller
public class RegisterController
{

    @Autowired
    UserService userService;
    
    @Autowired
    MailClient mailClient;
    
    
    @RequestMapping(method = RequestMethod.POST, value = "/users/register")
    public ModelAndView resgisterUser(@ModelAttribute("user") User userModel, 
            BindingResult result, WebRequest request, Errors errors)
    {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String passwd = encoder.encode(userModel.getPasswd());
        userModel.setPasswd(passwd);
        userService.save(userModel);
        Map<String, Object> maps = new HashMap<String, Object>();
        maps.put("username", userModel.getUsername());        
        maps.put("code", userModel.getId());        
        mailClient.send("info@jedlab.ir", userModel.getEmail(), "Verify Account", "com/jedlab/pm/controller/register.vm", maps, new UncaughtExceptionHandler() {
            
            public void uncaughtException(Thread t, Throwable e)
            {
                System.out.println("email is not sent ");
            }
        });
        ModelAndView mv = new ModelAndView("thankyou");        
        return mv;
    }

}
