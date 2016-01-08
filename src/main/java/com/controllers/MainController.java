package com.controllers;

import com.dao.CarDAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Эдуард on 29.11.15.
 */

@Controller
public class MainController {
    @RequestMapping("/")
    public ModelAndView printWelcome(HttpServletRequest request) {
        CarDAO carDAO = new CarDAO();

        ModelAndView model = new ModelAndView("index1");//this is constructor were is view filrd
        model.addObject("cars",carDAO.getLastCars(3));
        return model;
    }
}
