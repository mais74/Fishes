package com.example.myapplication;

public class FIsh {

    private String name, description, population;
    private int fishRes;

    public FIsh(String name, String description, String population, int fishRes){
        this.name = name;
        this.description = description;
        this.population = population;
        this.fishRes = fishRes;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public int getFishRes() {
        return fishRes;
    }

    public void setFishRes(int fishRes) {
        this.fishRes = fishRes;
    }
}
