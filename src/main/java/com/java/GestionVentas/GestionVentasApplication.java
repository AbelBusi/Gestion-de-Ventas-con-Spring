package com.java.GestionVentas;

import com.java.GestionVentas.view.ControllerLogin;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GestionVentasApplication extends Application {

	public static ConfigurableApplicationContext context;

	public static void main(String[] args) {
		launch();
		SpringApplication.run(GestionVentasApplication.class, args);
	}

	@Override
	public void start(Stage stage) throws Exception {

		context= SpringApplication.run(GestionVentasApplication.class);
		FXMLLoader fxml = new FXMLLoader(getClass().getResource("/com/java/GestionVentas/login.fxml"));
		fxml.setControllerFactory(context::getBean);
		Scene scene = new Scene(fxml.load());
		stage.setTitle("LOGIN");
		ControllerLogin controllerLogin =fxml.getController();
		controllerLogin.setStage(stage);
		stage.setScene(scene);
		stage.show();

	}
}
