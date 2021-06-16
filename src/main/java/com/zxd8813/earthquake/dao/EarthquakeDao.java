package com.zxd8813.earthquake.dao;

import com.alibaba.fastjson.JSONObject;
import com.zxd8813.earthquake.model.Earthquake;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EarthquakeDao {
    @Select("SELECT * FROM earthquake")
    List<Earthquake> getEarthquakeList();

    @Select("SELECT * FROM earthquake WHERE mag>=#{mag}")
    List<Earthquake> searchMagnitude(JSONObject request);

    @Select("SELECT * FROM earthquake WHERE #{mag_small}<=mag AND mag<=#{mag_large} AND time<=#{end_day} AND time >=#{start_day}")
    List<Earthquake> searchDay(JSONObject request);

    @Select("SELECT * FROM earthquake WHERE place LIKE #{mohu}")
    List<Earthquake> nearLocation(JSONObject request);

    int countDay(@Param("mag") float mag);

    int countNight(@Param("mag") float mag);

    int countAll(@Param("mag") float mag);
}
