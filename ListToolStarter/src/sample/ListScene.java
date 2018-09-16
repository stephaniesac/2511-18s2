package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class ListScene {

    private Stage stage;
    private FXMLLoader fxmlLoader;

    public ListScene(Stage s) {
        stage = s;
        fxmlLoader = new FXMLLoader(getClass().getResource("ListTool.fxml"));
    }

    public void display() {
        try {
            stage.setTitle("List Tool");
            stage.setScene(new Scene(fxmlLoader.load()));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
