package com.recipeapp.datahandler;

import java.util.ArrayList;

import com.recipeapp.model.Recipe;

//CSV形式に対応したクラス
public class CSVDataHandler implements DataHandler {
    // フィールドは`private`、コンストラクタ・メソッドは`public`で定義
    private String filePath;


    public CSVDataHandler() {
        // フィールド`filePath`に`app/src/main/resources/recipes.csv`を代入する
        filePath = "app/src/main/resources/recipes.csv";
    }

    // フィールド`filePath`に引数を代入す
    public CSVDataHandler(String filePath) {
        this.filePath = filePath;
    }

    // 文字列`CSV`を返してください
    @Override
    public String getMode() {
        return "csv";
    }

    @Override
    // 以降の設問で処理を実装するため定義し、nullをreturnしてください。
    public ArrayList<Recipe> readData() {
        return null;
    }

    @Override
    // 以降の設問で処理を実装するため定義のみ行います。
    public void writeData(Recipe recipe){
    }

    @Override
    // 以降の設問で処理を実装するため定義し、nullをreturnしてください。
    public ArrayList<Recipe> searchData(String keyword) {
        return null;

    }
}
