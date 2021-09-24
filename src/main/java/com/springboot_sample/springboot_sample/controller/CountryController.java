package com.springboot_sample.springboot_sample.controller;

import com.springboot_sample.springboot_sample.repository.CountriesRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class CountryController {
    CountriesRepository countriesRepository = new CountriesRepository();

    @PostMapping("countries")
    public String create(@RequestParam String countryName){
        return countriesRepository.create(countryName);
    }

    @GetMapping("countries/{id}")
    public String read(@PathVariable Integer id){
        return countriesRepository.read(id);
    }

    @GetMapping("countries")
    public String readAll(){
        return countriesRepository.readAll();
    }

    @PutMapping("countries/{id}")
    public String update(@PathVariable Integer id, @RequestParam String countryName){
        return countriesRepository.update(id, countryName);
    }

    @DeleteMapping("countries/{id}")
    public String delete(@PathVariable Integer id){
        return countriesRepository.delete(id);
    }
}
