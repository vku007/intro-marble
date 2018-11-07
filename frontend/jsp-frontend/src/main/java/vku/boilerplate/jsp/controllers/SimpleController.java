package vku.boilerplate.jsp.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import vku.boilerplate.jsp.services.GreetingService;
import vku.boilerplate.jsp.services.dto.GreetingResponse;

import java.util.Date;
import java.util.Map;

@Controller
public class SimpleController {

    @Autowired
    private GreetingService service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelMap modelMap = new ModelMap();

        modelMap.put("resultgreeting", new GreetingResponse(777,"xxx", null));
        modelMap.put("nameHolder", new GetGreetingMessage());


        return new ModelAndView("main", modelMap);
    }

    @RequestMapping(value = "/getgreeting", method = RequestMethod.POST)
    public ModelAndView submit(@ModelAttribute("nameHolder") GetGreetingMessage message,
                               BindingResult result, ModelMap model) {
        GreetingResponse received = service.getGreeting(message.getName());

        ModelMap modelMap = new ModelMap();

        modelMap.put("resultgreeting", received);
        modelMap.put("nameHolder", message);
        return new ModelAndView("main", modelMap);
    }
}
