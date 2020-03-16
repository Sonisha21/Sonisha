package com.vehicleAPI.v1;

import java.net.URI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import com.vehicleAPI.v1.model.Vehicles;
import com.vehicleAPI.v1.model.Vehicle;
@RestController
@RequestMapping(path = "/vehicles")
public class Controller 
{
    @Autowired
    private Dao dao;
     
    @GetMapping(path="/", produces = "application/json")
    public Vehicles getVehicles() 
    {
        return dao.getAllVehicles();
    }
     
    @PostMapping(path= "/", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addEmployee(@RequestBody Vehicle vehicle) 
    {
        Integer id = dao.getAllVehicles().getVehicleList().size() + 1;
        vehicle.setId(id);
         
        dao.addVehicle(vehicle);
         
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                                    .path("/{id}")
                                    .buildAndExpand(vehicle.getId())
                                    .toUri();
         
        return ResponseEntity.created(location).build();
    }
}