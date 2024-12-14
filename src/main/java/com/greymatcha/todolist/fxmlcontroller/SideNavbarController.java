package com.greymatcha.todolist.fxmlcontroller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.ResourceBundle;

public class SideNavbarController implements Initializable {

    @FXML
    Button inboxButton, todayButton;

    @FXML
    Rectangle inboxBackground, todayBackground;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        buttonHoverEffect(inboxButton, inboxBackground);
        buttonHoverEffect(todayButton, todayBackground);
    }

    public void buttonHoverEffect(Button button, Rectangle background) {

        button.setOnMouseEntered(_ -> {
            background.setFill(Color.web("#ffffff"));
        });

        button.setOnMouseExited(_ -> {
            background.setFill(Color.web("#f8f4f4"));
        });
    }
}