package com.springboot_sample.springboot_sample.repository;

import com.springboot_sample.springboot_sample.model.City;

import java.util.ArrayList;

public class CitiesRepository {

    ArrayList<City> cities = new ArrayList<>();
    public CitiesRepository(){
    }

    public String create(String CityName, Integer countryId){
        City city = new City(CityName, countryId);
        this.cities.add(city);
        return "City created";
    }

    public String read(Integer id){
        try {
            City City = this.cities.stream().filter(element -> id.equals(element.getId())).findFirst().orElse(null);
            return City.toString();
        } catch (Exception exception){
            return "Not found";
        }
    }

    public String readAll(){
        return this.cities.toString();
    }

    public String update(Integer id, String CityName){
        try {
            City City = this.cities.stream().filter(element -> id.equals(element.getId())).findFirst().orElse(null);
            City.setName(CityName);
            return "City updated";
        } catch (Exception exception){
            return "City not found";
        }
    }

    public String delete(Integer id){
        try {
            City City = this.cities.stream().filter(element -> id.equals(element.getId())).findFirst().orElse(null);
            if(City == null){
                return "City not found";            }
            this.cities.remove(City);
            return "City deleted";
        } catch (Exception exception){
            return "City not found";
        }

    }
}
