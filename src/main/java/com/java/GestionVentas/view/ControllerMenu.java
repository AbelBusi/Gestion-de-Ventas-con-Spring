package com.java.GestionVentas.view;

import javafx.fxml.FXML;
import javafx.stage.Stage;
import org.springframework.stereotype.Component;
import javafx.event.ActionEvent;

@Component
public class ControllerMenu {

    private ControllerLogin controllerLogin;

    private Stage stage;

    @FXML
    void menuLogin(ActionEvent event) {

        controllerLogin.show();
        stage.close();
    }

    public void init(Stage stage1, ControllerLogin controllerLogin) {

        this.controllerLogin= controllerLogin;
        this.stage=stage1;

    }
}
