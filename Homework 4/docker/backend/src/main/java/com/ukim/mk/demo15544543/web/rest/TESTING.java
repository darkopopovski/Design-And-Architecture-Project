package com.ukim.mk.demo15544543.web.rest;

import com.ukim.mk.demo15544543.model.MapData;
import com.ukim.mk.demo15544543.service.MapDataService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;



@RestController
@RequestMapping("/tests")
public class TESTING {

    private final MapDataService mapDataService;

    public TESTING(MapDataService mapDataService) {
        this.mapDataService = mapDataService;
    }

    @GetMapping
    public ResponseEntity viewQuery() {
        String city = "Skopje";
        String category = "ATM";
        List<MapData> mapDataList = mapDataService.findAllByCategory(city,category);
        return ResponseEntity.ok(mapDataList);
    }
}
