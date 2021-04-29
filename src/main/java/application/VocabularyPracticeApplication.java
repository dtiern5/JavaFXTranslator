package application;


import javafx.application.Application;
import javafx.stage.Stage;


public class VocabularyPracticeApplication extends Application {

    private Dictionary dictionary;

    public void init() throws Exception {
        this.dictionary = new Dictionary();
    }

    @Override
    public void start(Stage stage) throws Exception {


    }


    public static void main(String[] args) {
        launch(VocabularyPracticeApplication.class);
    }
}
