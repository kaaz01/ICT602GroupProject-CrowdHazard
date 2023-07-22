package com.example.crowdhazard;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class CrowdInfo {

    @SerializedName("crowdinfo_id")
    @Expose
    private String crowdinfo_id;
    @SerializedName("report_timestamp")
    @Expose
    private String report_timestamp;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("hazard_type")
    @Expose
    private String hazard_type;
    @SerializedName("hazard_loc")
    @Expose
    private String hazard_loc;
    @SerializedName("hazard_desc")
    @Expose
    private String hazard_desc;
    @SerializedName("hazard_lat")
    @Expose
    private String hazard_lat;
    @SerializedName("hazard_long")
    @Expose
    private String hazard_long;

    /**
     * No args constructor for use in serialization
     *
     */
    public CrowdInfo() {
    }

    /**
     *
     * @param crowdinfo_id
     * @param hazard_long
     * @param name
     * @param hazard_desc
     * @param report_timestamp
     * @param hazard_loc
     * @param hazard_type
     * @param hazard_lat
     */
    public CrowdInfo(String crowdinfo_id, String report_timestamp, String name, String hazard_type, String hazard_loc, String hazard_desc, String hazard_lat, String hazard_long) {
        super();
        this.crowdinfo_id = crowdinfo_id;
        this.report_timestamp = report_timestamp;
        this.name = name;
        this.hazard_type = hazard_type;
        this.hazard_loc = hazard_loc;
        this.hazard_desc = hazard_desc;
        this.hazard_lat = hazard_lat;
        this.hazard_long = hazard_long;
    }

    public String getCrowdinfo_id() {
        return crowdinfo_id;
    }

    public void setCrowdinfo_id(String crowdinfo_id) {
        this.crowdinfo_id = crowdinfo_id;
    }

    public String getReport_timestamp() {
        return report_timestamp;
    }

    public void setReport_timestamp(String report_timestamp) {
        this.report_timestamp = report_timestamp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHazard_type() {
        return hazard_type;
    }

    public void setHazard_type(String hazard_type) {
        this.hazard_type = hazard_type;
    }

    public String getHazard_loc() {
        return hazard_loc;
    }

    public void setHazard_loc(String hazard_loc) {
        this.hazard_loc = hazard_loc;
    }

    public String getHazard_desc() {
        return hazard_desc;
    }

    public void setHazard_desc(String hazard_desc) {
        this.hazard_desc = hazard_desc;
    }

    public String getHazard_lat() {
        return hazard_lat;
    }

    public void setHazard_lat(String hazard_lat) {
        this.hazard_lat = hazard_lat;
    }

    public String getHazard_long() {
        return hazard_long;
    }

    public void setHazard_long(String hazard_long) {
        this.hazard_long = hazard_long;
    }

}

