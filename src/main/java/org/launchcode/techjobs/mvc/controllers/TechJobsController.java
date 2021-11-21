package org.launchcode.techjobs.mvc.controllers;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;

public class TechJobsController {

    // hashmap for navigation link choices
    private static HashMap<String, String> actionChoices = new HashMap<>();
    private static HashMap<String, String> columnChoices = new HashMap<>();

    // constructors
    public TechJobsController(){
        // navigation links
        actionChoices.put("search", "Search");
        actionChoices.put("list", "List");

        // column for category choices
        columnChoices.put("all", "ALL");
        columnChoices.put("employer", "Employer");
        columnChoices.put("location", "Location");
        columnChoices.put("positionType", "Position Type");
        columnChoices.put("coreCompetency", "Skill");
    }

    // encapsulation: Getters
    @ModelAttribute("action")
    public static HashMap<String, String> getActionChoices(){return actionChoices; };

    @ModelAttribute("columns")
    public static HashMap<String, String> getColumnChoices(){return columnChoices; }


}
