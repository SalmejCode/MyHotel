package com.MyHotel.rest.Controller;

import com.MyHotel.rest.Entities.Automobile;
import com.MyHotel.rest.Entities.Trucks;
import com.MyHotel.rest.Service.IVehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("MyHotelAPI/Automobile")
public class AutomobileController {

    @Autowired(required = true)
    private IVehicle iVehicle;

    @RequestMapping(value= "/truck/add", method = RequestMethod.POST)
    public ResponseEntity<?> addTruck(@ModelAttribute("Trucks") Trucks truck){

        this.iVehicle.addTruck(truck);
        return new ResponseEntity<>("Truck has been updated",
                HttpStatus.OK);
    }

    @RequestMapping(value= "/truck/update", method = RequestMethod.POST)
    public ResponseEntity<?> updateTruck(@ModelAttribute("Trucks") Trucks truck){

        this.iVehicle.updateTruck(truck);
        return new ResponseEntity<>("Truck has been updated",
                HttpStatus.OK);
    }

    @RequestMapping("/removeTruck/{id}")
    public ResponseEntity<?> removeTruck(@PathVariable("id") int id){

        this.iVehicle.removeTrucks(id);
        return new ResponseEntity<>("Truck has been removed",
                HttpStatus.OK);
    }

    @RequestMapping("/getTruck/{id}")
    public ResponseEntity<?> getTruck(@PathVariable("id") int id){

        return new ResponseEntity<>(this.iVehicle.getTrucksById(id), HttpStatus.OK);
    }

    @RequestMapping(value= "/automobile/add", method = RequestMethod.POST)
    public ResponseEntity<?> addAutomobile(@ModelAttribute("Automobile") Automobile automobile){

        this.iVehicle.addAutomobile(automobile);
        return new ResponseEntity<>("Automobile has been updated",
                HttpStatus.OK);
    }

    @RequestMapping(value= "/automobile/update", method = RequestMethod.POST)
    public ResponseEntity<?> updateAutomobile(@ModelAttribute("Automobile") Automobile automobile){

        this.iVehicle.updateAutomobile(automobile);
        return new ResponseEntity<>("Automobile has been updated",
                HttpStatus.OK);
    }

    @RequestMapping("/removeAutomobile/{id}")
    public ResponseEntity<?> removeAutomobile(@PathVariable("id") int id){

        this.iVehicle.removeAutomobile(id);
        return new ResponseEntity<>("Automobile has been removed",
                HttpStatus.OK);
    }

    @RequestMapping("/getAutomobile/{id}")
    public ResponseEntity<?> getAutomobile(@PathVariable("id") int id){

        return new ResponseEntity<>(this.iVehicle.getAutomobileById(id), HttpStatus.OK);
    }
}
