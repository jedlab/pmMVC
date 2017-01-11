package com.jedlab.pm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jedlab.pm.model.Project;
import com.jedlab.pm.service.ProjectService;

@Controller
public class ProjectController
{

    
    @Autowired
    ProjectService projectService;
    
    @RequestMapping(method=RequestMethod.GET, value="/index")
    public ModelAndView index(){
        ModelAndView mv = new  ModelAndView("index");
        Project p = projectService.findAll().iterator().next();
        mv.addObject("project", p);
        return mv;
    }
    
    @RequestMapping(method=RequestMethod.GET, value="/projectList")
    public ModelAndView projectList(){
        ModelAndView mv = new  ModelAndView("projectList");
        Project p = projectService.findAll().iterator().next();
        mv.addObject("project", p);
        return mv;
    }
    
}
