package com.zxd8813.earthquake.model;

import lombok.Data;

import java.util.Date;


@Data
public class Earthquake {
    private Date time;
    private float latitude;
    private float longitude;
    private float depth;
    private float mag;
    private String magType;
    private int nst;
    private float gap;
    private float dmin;
    private float rms;
    private String net;
    private String id;
    private String updated;
    private String place;
    private String type;
    private float horizontalError;
    private float depthError;
    private float magError;
    private int magNst;
    private String status;
    private String locationSource;
    private String magSource;

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getDepth() {
        return depth;
    }

    public void setDepth(float depth) {
        this.depth = depth;
    }

    public float getMag() {
        return mag;
    }

    public void setMag(float mag) {
        this.mag = mag;
    }

    public String getMagType() {
        return magType;
    }

    public void setMagType(String magType) {
        this.magType = magType;
    }

    public int getNst() {
        return nst;
    }

    public void setNst(int nst) {
        this.nst = nst;
    }

    public float getGap() {
        return gap;
    }

    public void setGap(float gap) {
        this.gap = gap;
    }

    public float getDmin() {
        return dmin;
    }

    public void setDmin(float dmin) {
        this.dmin = dmin;
    }

    public float getRms() {
        return rms;
    }

    public void setRms(float rms) {
        this.rms = rms;
    }

    public String getNet() {
        return net;
    }

    public void setNet(String net) {
        this.net = net;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getHorizontalError() {
        return horizontalError;
    }

    public void setHorizontalError(float horizontalError) {
        this.horizontalError = horizontalError;
    }

    public float getDepthError() {
        return depthError;
    }

    public void setDepthError(float depthError) {
        this.depthError = depthError;
    }

    public float getMagError() {
        return magError;
    }

    public void setMagError(float magError) {
        this.magError = magError;
    }

    public int getMagNst() {
        return magNst;
    }

    public void setMagNst(int magNst) {
        this.magNst = magNst;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLocationSource() {
        return locationSource;
    }

    public void setLocationSource(String locationSource) {
        this.locationSource = locationSource;
    }

    public String getMagSource() {
        return magSource;
    }

    public void setMagSource(String magSource) {
        this.magSource = magSource;
    }
}
