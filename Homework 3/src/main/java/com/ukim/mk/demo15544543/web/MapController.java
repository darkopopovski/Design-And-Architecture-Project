package com.ukim.mk.demo15544543.web;

import com.ukim.mk.demo15544543.service.MapDataService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/map")
public class MapController {


    private final MapDataService mapDataService;

    public MapController(MapDataService mapDataService) {
        this.mapDataService = mapDataService;
    }

    @GetMapping
    public String getRegisterPage(@RequestParam(required = false) String error, Model model) {
        if(error != null && !error.isEmpty()) {
            model.addAttribute("hasError", true);
            model.addAttribute("error", error);
        }
        model.addAttribute("bodyContent", "googleMaps");
        model.addAttribute("mapData", mapDataService.findAll());
        return "master-template";
    }
}
