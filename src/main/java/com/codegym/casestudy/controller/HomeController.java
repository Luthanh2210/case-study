package com.codegym.casestudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping
    public ModelAndView home() {
        return new ModelAndView("/index");
    }

    @GetMapping("shop")
    public ModelAndView shop(){
        return new ModelAndView("/shop");
    }

    @GetMapping("about")
    public ModelAndView about(){
        return new ModelAndView("/about");
    }

    @GetMapping("shop-details")
    public ModelAndView shopdetails(){
        return new ModelAndView("/shop-details");
    }

    @GetMapping("shopping-cart")
    public ModelAndView cart(){
        return new ModelAndView("/shopping-cart");
    }


    @GetMapping("checkout")
    public ModelAndView checkout(){
        return new ModelAndView("/checkout");
    }

    @GetMapping("blog-details")
    public ModelAndView blogdetails(){
        return new ModelAndView("/blog-details");
    }

    @GetMapping("blog")
    public ModelAndView blog(){
        return new ModelAndView("/blog");
    }

    @GetMapping("contact")
    public ModelAndView contact(){
        return new ModelAndView("contact");
    }
}
