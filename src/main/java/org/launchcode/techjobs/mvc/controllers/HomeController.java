package org.launchcode.techjobs.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

/**
 * Created by LaunchCode
 */
@Controller
// home controller renders the index.html template
public class HomeController extends TechJobsController {

    @GetMapping(value = "")
    // handler that display the home page for the app
    public String index() {
        return "index";
    }

}
