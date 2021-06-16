package com.zxd8813.earthquake.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zxd8813.earthquake.dao.EarthquakeDao;
import com.zxd8813.earthquake.model.Earthquake;
import com.zxd8813.earthquake.service.EarthquakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "EarthquakeService")
public class EarthquakeServiceImpl implements EarthquakeService {
    @Autowired
    private EarthquakeDao earthquakeDao;

    @Override
    public JSONObject getEarthquakeList(int pageNum, int pageSize) {
        JSONObject result = new JSONObject();
        try {
            PageHelper.startPage(pageNum, pageSize);
            PageInfo<Earthquake> pageInfo = new PageInfo(earthquakeDao.getEarthquakeList());

            result.put("code", "0");
            result.put("msg", "operation success！");
            result.put("data", pageInfo.getList());
            result.put("count", pageInfo.getTotal());
        } catch (Exception e) {
            result.put("code", "500");
            result.put("msg", "query error！");
        }
        return result;
    }

    @Override
    public JSONObject searchMagnitude(JSONObject request) {
        JSONObject result = new JSONObject();
        try {
            int pageNum = request.getInteger("pageNum");
            int pageSize = request.getInteger("pageSize");
            PageHelper.startPage(pageNum, pageSize);

            PageInfo<Earthquake> pageInfo = new PageInfo(earthquakeDao.searchMagnitude(request));

            result.put("code", "0");
            result.put("msg", "operation success！");
            result.put("data", pageInfo.getList());
            result.put("count", pageInfo.getTotal());
        } catch (Exception e) {
            result.put("code", "500");
            result.put("msg", "query earthquake error!");
        }
        return result;
    }

    @Override
    public JSONObject searchDay(JSONObject request) {
        JSONObject result = new JSONObject();
        try {
            int pageNum = request.getInteger("pageNum");
            int pageSize = request.getInteger("pageSize");
            PageHelper.startPage(pageNum, pageSize);

            PageInfo<Earthquake> pageInfo = new PageInfo(earthquakeDao.searchDay(request));

            result.put("code", "0");
            result.put("msg", "operation success！");
            result.put("data", pageInfo.getList());
            result.put("count", pageInfo.getTotal());
        } catch (Exception e) {
            result.put("code", "500");
            result.put("msg", "query earthquake error!");
        }
        return result;
    }

    @Override
    public JSONObject nearLocation(JSONObject request) {
        JSONObject result = new JSONObject();
        try {
            int pageNum = request.getInteger("pageNum");
            int pageSize = request.getInteger("pageSize");
            PageHelper.startPage(pageNum, pageSize);
            String mohu = "%"+request.get("distance")+"%"+request.get("location")+"%";
            request.put("mohu",mohu);
            PageInfo<Earthquake> pageInfo = new PageInfo(earthquakeDao.nearLocation(request));

            result.put("code", "0");
            result.put("msg", "operation success！");
            result.put("data", pageInfo.getList());
            result.put("count", pageInfo.getTotal());
        } catch (Exception e) {
            result.put("code", "500");
            result.put("msg", "query earthquake error!");
        }
        return result;
    }

    @Override
    public JSONObject countNight(float mag) {
        JSONObject result = new JSONObject();
        try {

            int all = earthquakeDao.countAll(mag);
            int night = earthquakeDao.countNight(mag);
            int day = earthquakeDao.countDay(mag);


            result.put("night",(((float)night/all)*100));
            result.put("day",(((float)day/all)*100));
            System.out.println(result.get("night"));
            System.out.println(result.get("day"));

            result.put("code", "0");
            result.put("msg", "operation success！");
        } catch (Exception e) {
            result.put("code", "500");
            result.put("msg", "query earthquake error!");
        }
        return result;
    }
}
