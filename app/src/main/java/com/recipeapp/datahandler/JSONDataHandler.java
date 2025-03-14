package com.recipeapp.datahandler;

import java.util.ArrayList;

import com.recipeapp.model.Recipe;
// メソッドはすべて`public`で定義

public class JSONDataHandler implements DataHandler {

    @Override
    public String getMode() {
        return "JSON";
    }

    @Override
    public ArrayList<Recipe> readData() {
        return null;
    }

    @Override
    // 指定された`Recipe`オブジェクトを追加します
    public void writeData(Recipe recipe){
    
    }

    @Override
    // 一致する`Recipe`オブジェクトのリストを返します。
    public ArrayList<Recipe> searchData(String keyword){
    return null;
    }

}
