package com.bookstore.demo.controller;

import com.bookstore.demo.model.Category;
import com.bookstore.demo.model.City;
import com.bookstore.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CityController {

    @Autowired
    CityService cityService;


    @PostMapping("/cities")
    public City createCity(@RequestBody City city)  {
        City result = cityService.save(city);
        return result;
    }
    @PutMapping("/cities")
    public City updateCity(@RequestBody City city)  {
        City result = cityService.save(city);
        return result;
    }

    @GetMapping("/cities/{id}")
    public City getCity(@PathVariable Long id) {
        Optional<City> city = cityService.findOne(id);
        return city.get();
    }
    @DeleteMapping("/cities/{id}")
    public void deleteCity(@PathVariable Long id) {
        cityService.delete(id);
    }
    @GetMapping("/cities")
    public List<City> getAllCities() {
        return cityService.findAll();
    }


}
