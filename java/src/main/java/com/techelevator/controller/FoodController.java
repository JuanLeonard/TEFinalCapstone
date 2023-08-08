package com.techelevator.controller;

import com.techelevator.dao.FoodDao;
import com.techelevator.dao.MealsDao;
import com.techelevator.model.Food;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@Component
@RestController
public class FoodController {

    private FoodDao foodDao;

    public FoodController(FoodDao foodDao) {
        this.foodDao = foodDao;

    }

    @GetMapping("/profile/{id}/food")
    public List<Food> listAllFood(){
        return null;
    }

    @GetMapping("/food/{id}")
    public FoodDao getFoodById(int foodId){
        return null;
    }

    @GetMapping("/profile/{id}/food/{id}")
    public FoodDao deleteFoodById(int id){
        return null;
    }

//    // foodName was not added so this is just a place holder
//    @GetMapping("/profile/{id}/food/food_name")
//    public FoodDao getFoodByName(String foodName) {
//        return null;
//    }
}