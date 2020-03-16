package com.vehicleAPI.v1.model;
 
public class Vehicle {
 
    public Vehicle() {
 
    }
 
    public Vehicle(Integer id, String vin,  String year, String make,String model, String transmissionType) {
        super();
        this.id = id;
        this.vin = vin;
        this.year=year;
        this.make = make;
        this.model = model;
        this.transmissionType=transmissionType;
    }
  
    private Integer id;
    private String vin;
    private String make;
    private String year;
    private String model;
    private String transmissionType;
 
    //Getters and setters
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    
    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }
    
    
    public String getMakee() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    
    
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }
    
    
    
   
    
    
 
    @Override
    public String toString() {
        return "Vehicle [id=" + id + ", vin=" + vin + ", year=" + year + ", make=" + make + ", model="+ model +", transmissionType="+transmissionType+"]";
    }
}