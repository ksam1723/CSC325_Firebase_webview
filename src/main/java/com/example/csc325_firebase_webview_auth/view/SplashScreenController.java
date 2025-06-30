package com.example.csc325_firebase_webview_auth.view;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;
import java.io.IOException;

public class SplashScreenController implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    @FXML
    private void handleEnterClick() {
        try {
            App.setRoot("/files/AccessFBView.fxml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
