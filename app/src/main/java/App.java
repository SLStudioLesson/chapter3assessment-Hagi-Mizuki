import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.recipeapp.datahandler.CSVDataHandler;
import com.recipeapp.datahandler.DataHandler;
import com.recipeapp.datahandler.JSONDataHandler;
import com.recipeapp.ui.RecipeUI;

public class App {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Choose the file format:");
            System.out.println("1. CSV");
            System.out.println("2. JSON");
            System.out.print("Select (1/2): ");
            String choice = reader.readLine();

            DataHandler format;

            // 「1」を選択した場合、`CSVDataHandler`インスタンスを生成する
            if (choice.equals("1")) {
                format = new CSVDataHandler();
                // 「2」を選択した場合、`JSONDataHandler`インスタンスを生成する
            } else if (choice.equals("2")) {
                format = new JSONDataHandler();
                // 不正な入力（「1」「2」以外）が与えられた場合、`CSVDataHandler`インスタンスを生成する
            } else {
                format = new CSVDataHandler();
            }
            // 選択されたデータハンドラーを`com/recipeapp`パッケージの`RecipeUI`に渡す
            RecipeUI recipeUi = new RecipeUI(format);
            // `displayMenu`メソッドを呼び出してメインメニューを表示します。
            recipeUi.displayMenu();

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}