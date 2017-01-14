package com.jedlab.pm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DashboardController
{

    @RequestMapping(method = RequestMethod.GET, value = "/dashboard")
    public ModelAndView dashboard()
    {
        ModelAndView mv = new ModelAndView("dashboard");
        if(AuthenticationUtil.isLoggedIn())
            mv.addObject("auth", AuthenticationUtil.getSecurityUser());
        return mv;
    }

}
