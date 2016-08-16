package model;

import java.io.Serializable;

/**
 * Created by ronjdaugherty on 4/12/16.
 */
//will allow us to pass the Food object with all its states between intents

public class Food implements Serializable{

    //serializable is used to freeze the state of the food object to use later

    private static final long serialVersionUID = 10L;
    private String foodName;
    private int calories;
    private int foodId;
    private String recordDate;

    public Food( String food, int cals, int id, String date){
        foodName = food;
        calories = cals;
        foodId = id;
        recordDate = date;

    }

    public Food(){

    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public String getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(String recordDate) {
        this.recordDate = recordDate;
    }
}
