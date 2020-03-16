package com.vehicleAPI.v1.model;
 
import java.util.ArrayList;
import java.util.List;
 
public class Vehicles
{
    private List< Vehicle> vehicleList;
     
    public List< Vehicle> getVehicleList() {
        if(vehicleList == null) {
        	vehicleList = new ArrayList<Vehicle>();
        }
        return vehicleList;
    }
  
    public void setVehicleList(List< Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }
}