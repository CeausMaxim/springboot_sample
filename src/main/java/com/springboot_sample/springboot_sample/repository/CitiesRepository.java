package com.springboot_sample.springboot_sample.repository;

import com.springboot_sample.springboot_sample.model.Cities;

import java.util.ArrayList;

public class CitiesRepository {
    ArrayList<Cities> cities = new ArrayList<>();

    public CitiesRepository(){

    }

    public String create(String citiesName){
        Cities cities = new Cities(citiesName);
        this.cities.add(cities);
        return "City created";
    }

    public String read(Integer id){
        try {
            Cities cities = this.cities.stream().filter(element -> id.equals(element.getId())).findFirst().orElse(null);
            return cities.toString();
        } catch (Exception exception){
            return "Not found";
        }
    }

    public String readAll(){
        return this.cities.toString();
    }

    public String update(Integer id, String citiesName){
        try {
            Cities cities = this.cities.stream().filter(element -> id.equals(element.getId())).findFirst().orElse(null);
            cities.setName(citiesName);
            return "City updated";
        } catch (Exception exception){
            return "City not found";
        }
    }

    public String delete(Integer id){
        try {
            Cities cities = this.cities.stream().filter(element -> id.equals(element.getId())).findFirst().orElse(null);
            if(cities == null){
                return "City not found";            }
            this.cities.remove(cities);
            return "City deleted";
        } catch (Exception exception){
            return "City not found";
        }

    }
}
