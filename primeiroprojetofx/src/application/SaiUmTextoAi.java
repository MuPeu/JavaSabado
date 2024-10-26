package application;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.Group;

public class SaiUmTextoAi extends Application{
	@Override
	public void start(Stage palco3) {
		Text texto = new Text();
		texto.setFont(new Font(45));
		
		texto.setX(150.0);
		texto.setY(150);
		
		texto.setText("JavaFX no Senai!");
		
		Group raiz = new Group();
		ObservableList lista = raiz.getChildren();
		lista.add(texto);
		
		Scene cena = new Scene(raiz, 600, 300);
		palco3.setTitle("App de Exemplo");
		palco3.setScene(cena);
		palco3.show();
		
	}
	
	public static void main(String[] args) {
		launch();

	}

}
