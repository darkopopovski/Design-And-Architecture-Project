package com.ukim.mk.demo15544543.repo;

import com.ukim.mk.demo15544543.model.MapData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface MapDataRepository extends JpaRepository<MapData, Integer> {

    

    @Query(value = "select * from map_skopje_banks_atms as mapData where (mapdata.plusCode ~ ? and mapData.category=?)",nativeQuery = true)
    public List<MapData> findAllByCategory(String city, String category);
}
