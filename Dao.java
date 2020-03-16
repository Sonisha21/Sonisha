package com.vehicleAPI.v1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;
import java.util.concurrent.CompletableFuture;


import com.vehicleAPI.v1.model. Vehicles;
import com.vehicleAPI.v1.model. Vehicle;
 
@Repository
public class Dao
{  
    private static Vehicles list = new Vehicles();
     
    static
    {
        list.getVehicleList().add(new Vehicle(1, "1A4AABBC5KD501999", "2019", "FCA","RAM","MANUAL"));
        list.getVehicleList().add(new Vehicle(2, "1VHDCJDC5KD684455", "2018", "IFS","CRETA","MANUAL"));
        list.getVehicleList().add(new Vehicle(3, "1GVSCJHK5KD476872", "2016", "ACF","LEXUS","MANUAL"));
    }
     
    public Vehicles getAllVehicles() 
    {
        return list;
    }
     
    public void addVehicle(Vehicle vehicle) {
        list.getVehicleList().add(vehicle);
    }
}