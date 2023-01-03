package com.ukim.mk.demo15544543.web.rest;

import com.ukim.mk.demo15544543.model.MapData;
import com.ukim.mk.demo15544543.service.MapDataService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@CrossOrigin(origins = "http://localhost:9656")
@RequestMapping("/api/map-data")
public class MapDataRest {
    private final MapDataService mapDataService;

    public MapDataRest(MapDataService mapDataService) {
        this.mapDataService = mapDataService;
    }


    @GetMapping
    private List<MapData> findAll() {
        return this.mapDataService.findAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<MapData> findById(@PathVariable Integer id) {

        return this.mapDataService.findById(id)
                .map(mapData -> ResponseEntity.ok().body(mapData))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

}
