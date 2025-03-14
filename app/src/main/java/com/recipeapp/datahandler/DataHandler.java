package com.recipeapp.datahandler;

import java.util.ArrayList;

import com.recipeapp.model.Recipe;

public interface DataHandler {
    // メソッドはすべて`public`で定義
    public String getMode();

    //送信される例外 `IOException` 
    //Recipe 型のArrayListを作成
    public ArrayList<Recipe> readData();
    // {        // レシピデータを読み込み
    //     try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
    //         //`Recipe`オブジェクトのリストとして返します。
    //         String line;
    //         while((line = reader.readLine()) != null){
    //             //リスト形式で返す ArrayListにlineを追加したい
    //             recipes.add(line);
    //         }
    //     }catch(IOException e){
    //         System.out.println("エラーが発生しました。");
    //     }
    // }

    
    // 送信される例外 `IOException`
    // 指定された`Recipe`オブジェクトを追加します。
    public void writeData(Recipe recipe);
    // {        try(){

    //     }catch(IOException){
    //         System.out.println("エラーが発生しました。");
    //     }
    // }

    // 送信される例外`IOException` | 指定されたキーワードでレシピを検索
    // 一致する`Recipe`オブジェクトのリストを返します。
    public ArrayList<Recipe> searchData(String keyword);
    // {try(){

    //     }
    //     catch(IOException){
    //         System.out.println("エラーが発生しました。");
    //     }
    // }
}
