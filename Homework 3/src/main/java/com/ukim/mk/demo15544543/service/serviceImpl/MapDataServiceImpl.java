package com.ukim.mk.demo15544543.service.serviceImpl;

import com.ukim.mk.demo15544543.model.MapData;
import com.ukim.mk.demo15544543.repo.MapDataRepository;
import com.ukim.mk.demo15544543.service.MapDataService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MapDataServiceImpl implements MapDataService {

    private final MapDataRepository mapDataRepository;

    public MapDataServiceImpl(MapDataRepository mapDataRepository) {
        this.mapDataRepository = mapDataRepository;
    }

    @Override
    public List<MapData> findAll() {
        return this.mapDataRepository.findAll();
    }

    @Override
    public Optional<MapData> findById(Integer id) {
        return Optional.of(this.mapDataRepository.findById(id).get());
    }
}
