package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.scene.Group;

public class LinhaReta extends Application{
	@Override
	public void start(Stage palco2) {
		Line linha = new Line();
		
		linha.setStartX(100.0);
		linha.setStartY(150.0);
		linha.setEndX(500.0);
		linha.setEndY(150.0);
		
		Group raiz = new Group(linha);
		Scene cena = new Scene(raiz, 600, 300);
		palco2.setScene(cena);
		palco2.show();
	}
	
	public static void main(String[] args) {
		launch();

	}

}
