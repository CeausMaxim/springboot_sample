package com.springboot_sample.springboot_sample.model;

public class City {
    private Integer id = null;
    private String name = null;

    private Integer countryId = null;
    public static Integer autoincrementId = 0;

    City(){

    }

    public City(String name, Integer countryId){
        City.autoincrementId++;
        this.id = City.autoincrementId;
        this.name = name;
        this.countryId = countryId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    //todo

    public String getCountryName(){
        //todo to implement this method
        return "Noname";
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", countryId=" + countryId +
                ", countryName=" + this.getCountryName() +
                '}';
    }
}
