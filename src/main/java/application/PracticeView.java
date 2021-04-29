package application;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class PracticeView {

    private Dictionary dictionary;
    private String word;

    public PracticeView(Dictionary dictionary) {
        this.dictionary = dictionary;
        this.word = dictionary.getRandomWord();
    }

    public Parent getView() {

        GridPane layout = new GridPane();

        Label wordInstruction = new Label("Translate the word " + word);
        TextField translationInput = new TextField();
        Button checkButton = new Button("Check");
        Label feedback = new Label("");

        layout.add(wordInstruction, 0, 0);
        layout.add(translationInput, 0, 1);
        layout.add(checkButton,0, 2);
        layout.add(feedback, 0, 3);

        return layout;
    }



}
