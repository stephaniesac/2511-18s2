package listtool;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        /* Set Width and Height */
        primaryStage.setWidth(600);
        primaryStage.setHeight(400);

        /* Create the Home Scene */
        ListScene sc = new ListScene(primaryStage);
        sc.display();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
