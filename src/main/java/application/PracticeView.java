package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
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

        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10, 10, 10, 10));

        Label wordInstruction = new Label("Translate the word " + word);
        TextField translationInput = new TextField();
        Button checkButton = new Button("Check");
        Label feedback = new Label("");

        layout.add(wordInstruction, 0, 0);
        layout.add(translationInput, 0, 1);
        layout.add(checkButton, 0, 2);
        layout.add(feedback, 0, 3);

        checkButton.setOnMouseClicked((event) -> {
            String translation = translationInput.getText();
            if (translation.equals(dictionary.get(word))) {
                feedback.setText("Correct");
            } else {
                feedback.setText("Incorrect, the correct translation for " + word + " is " + dictionary.get(word));
            }

            word = dictionary.getRandomWord();
            wordInstruction.setText("Translate the word " + word);
            translationInput.clear();

        });

        return layout;
    }


}
