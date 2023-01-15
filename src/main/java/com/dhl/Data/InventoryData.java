package com.dhl.Data;

public class InventoryData {
    private String hawb = "";

    private Integer pieces;

    private String location;

    public String getHawb() {
        return hawb;
    }

    public void setHawb(String hawb) {
        this.hawb = hawb;
    }

    public Integer getPieces() {
        return pieces;
    }

    public void setPieces(Integer pieces) {
        this.pieces = pieces;
    }
    public void addPieces(Integer addPie){
        this.pieces = addPie + this.pieces;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public void addLocation(String addLocation){
        this.location = this.location + "/" + addLocation;
    }
}
