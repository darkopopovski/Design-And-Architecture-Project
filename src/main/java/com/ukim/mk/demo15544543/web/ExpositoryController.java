package com.ukim.mk.demo15544543.web;

import com.ukim.mk.demo15544543.service.MapDataService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/expository")
public class ExpositoryController {

    private final MapDataService mapDataService;

    public ExpositoryController(MapDataService mapDataService) {
        this.mapDataService = mapDataService;
    }

    @GetMapping
    public String getMoviePage(@RequestParam(required = false) String error, Model model) {
        if (error != null && !error.isEmpty()) {
            model.addAttribute("hasError", true);
            model.addAttribute("error", error);
        }
        model.addAttribute("mapData", mapDataService.findAll());
        model.addAttribute("bodyContent", "expository");
        return "master-template";
    }
}
