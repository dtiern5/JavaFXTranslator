package application;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class VocabularyPracticeApplication extends Application {

    private Dictionary dictionary;

    public void init() throws Exception {
        this.dictionary = new Dictionary();
    }

    @Override
    public void start(Stage stage) throws Exception {
        // create subviews
        InputView inputView = new InputView(dictionary);
        PracticeView practiceView = new PracticeView(dictionary);

        // create overall layout
        BorderPane layout = new BorderPane();

        // create menu
        HBox menu = new HBox();

        menu.setPadding(new Insets(10, 10, 10, 10));
        menu.setSpacing(10);

        // create buttons
        Button enterButton = new Button("Enter new words");
        Button practiceButton = new Button("Practice");

        // add buttons to menu
        menu.getChildren().addAll(enterButton, practiceButton);
        layout.setTop(menu);

        layout.setCenter(inputView.getView());

        Scene view = new Scene(layout, 400, 300);
        stage.setScene(view);
        stage.show();


    }


    public static void main(String[] args) {
        launch(VocabularyPracticeApplication.class);
    }
}
