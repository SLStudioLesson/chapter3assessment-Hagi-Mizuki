package com.recipeapp.model;

import java.util.ArrayList;

public class Recipe {
    //フィールドは`private`
    //コンストラクタ・メソッドは`public`で定義
    private String  name;
    private ArrayList<Ingredient> ingredient; 

    public Recipe(String naem, ArrayList<Ingredient> ingredient){
        this.name = name;
        this.ingredient = ingredient;
    }

    public String getName(){
        return this.name;
    }

    public ArrayList<Ingredient> getIngredients(){
        return this.ingredient;
    }
    
}
