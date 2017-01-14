package com.jedlab.pm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jedlab.pm.model.User;
import com.jedlab.pm.service.UserService;

@Controller
@RequestMapping(value = "/login")
public class LoginController
{

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView login()
    {
        ModelAndView mv = new ModelAndView("login");
        User user = new User();
        mv.addObject("user", user);
        return mv;
    }
    
//    @RequestMapping(method = RequestMethod.POST)
//    public ModelAndView post(@ModelAttribute("user") User user)
//    {
//        ModelAndView mv = new ModelAndView("activated");        
//        return mv;
//    }

}
