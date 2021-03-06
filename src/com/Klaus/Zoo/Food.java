package com.Klaus.Zoo;

public class Food {
    private String name;
    private String unit;
    private int dailyFoodDemand;
    private int foodStock;

    public Food(String name, String unit) {
        this.name = name;
        this.unit = unit;
    }

    public void addToDailyFoodDemand(int demand) {
        dailyFoodDemand += demand;
    }

    public String getName() {
        return name;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Object getUnit() {
        return unit;
    }

    public int getFoodStock() { return foodStock; }

    public void setFoodStock(int foodStock) { this.foodStock = foodStock;}


}
