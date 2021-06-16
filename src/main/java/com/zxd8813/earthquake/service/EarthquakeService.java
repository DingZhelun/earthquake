package com.zxd8813.earthquake.service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;

@Service
public interface EarthquakeService {
    JSONObject getEarthquakeList(int pageNum, int pageSize);

    JSONObject searchMagnitude(JSONObject request);

    JSONObject searchDay(JSONObject request);

    JSONObject nearLocation(JSONObject request);

    JSONObject countNight(float mag);


}
