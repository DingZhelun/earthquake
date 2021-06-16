package com.zxd8813.earthquake.controller;

import com.alibaba.fastjson.JSONObject;
import com.zxd8813.earthquake.service.EarthquakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/earthquake")
public class EarthquakeController {
    @Autowired
    private EarthquakeService earthquakeService;

    @RequestMapping(value = "/earthquakeList", method = RequestMethod.GET)
    public JSONObject getPeopleList(@RequestParam("pageNum") int pageNum, @RequestParam("pageSize") int pageSize) {
        return earthquakeService.getEarthquakeList(pageNum, pageSize);
    }
    @RequestMapping(value = "/searchMagnitude",method = RequestMethod.POST)
    public JSONObject searchMagnitude(@RequestBody JSONObject request){
        return earthquakeService.searchMagnitude(request);
    }

    @RequestMapping(value = "/searchDay",method = RequestMethod.POST)
    public JSONObject searchDay(@RequestBody JSONObject request){
        return earthquakeService.searchDay(request);
    }

    @RequestMapping(value = "/nearLocation",method = RequestMethod.POST)
    public JSONObject nearLocation(@RequestBody JSONObject request){
        return earthquakeService.nearLocation(request);
    }

    @RequestMapping(value = "/countNight",method = RequestMethod.GET)
    public JSONObject countNight(@RequestParam("mag") float mag){
        return earthquakeService.countNight(mag);
    }


}
