package com.ukim.mk.demo15544543.repo;

import com.ukim.mk.demo15544543.model.MapData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MapDataRepository extends JpaRepository<MapData, Integer> {

    @Query(value = "select * from map_skopje_banks_atms as mapData where mapData.plusCode ilike '%Skopje%'",nativeQuery = true)
    public List<MapData> findAllByCitySkopje();
}
