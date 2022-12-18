package com.ukim.mk.demo15544543.service;

import com.ukim.mk.demo15544543.model.MapData;

import java.util.List;
import java.util.Optional;

public interface MapDataService{

    public List<MapData> findAll();
    public Optional<MapData> findById(Integer id);

    public List<MapData> findAllByCategory(String city, String category);
}
