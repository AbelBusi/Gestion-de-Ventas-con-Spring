package com.java.GestionVentas.view;

import com.java.GestionVentas.controller.service.IUsuarioService;
import com.java.GestionVentas.model.Usuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.swing.*;
import java.io.IOException;
import java.util.Optional;
import org.slf4j.Logger;

@Component
public class ControllerLogin {

    private final Logger loggger = LoggerFactory.getLogger(ControllerLogin.class);

    @Autowired
    private IUsuarioService usuarioService;

    @FXML
    private Button butonLimpiar;

    @FXML
    private Button buttonLogin;

    @FXML
    private Label labelLogin;

    @FXML
    private Label labelPass;

    @FXML
    private Label labelUsuario;

    @FXML
    private Pane panelLogin;

    @FXML
    private TextField txtPass;

    @FXML
    private TextField txtUsuario;

    private Stage stage;

    @FXML
    void botonMenu(ActionEvent event) throws IOException {

        String correoUsuario = txtUsuario.getText();
        String passUsuario = txtPass.getText();
        Optional<Usuario> userEmail = usuarioService.findByCorreoUsuario(correoUsuario);
        Optional<Usuario> userPassword= usuarioService.findByPasswordUsuario(passUsuario);

        if(userEmail.isPresent() && userPassword.isPresent()){
            loggger.info("Usuario {}",userEmail,userPassword);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/java/GestionVentas/menu.fxml"));
        Parent root = loader.load();
        ControllerMenu controllerMenu = loader.getController();
        Scene scene = new Scene(root);
        Stage stage1 = new Stage();
        stage1.setScene(scene);
        controllerMenu.init(stage1,this);
        stage1.show();
        this.stage.close();

        }else {

            System.out.println("Usuario no encontrado");

        }
    }

    public void setStage(Stage primarystage) {

        stage=primarystage;

    }

    public void show() {
        stage.show();
    }

    public void limpiarCajaTexto(){

        txtUsuario.setText("");
        txtPass.setText("");

    }

    @FXML
    void limpiarTxt(ActionEvent event) {

        limpiarCajaTexto();

    }

}