package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.Group;

public class PrimeiraTelaFX extends Application{
	@Override
	public void start(Stage palco1) throws Exception {
		Group raiz = new Group();
		Scene cena = new Scene(raiz, 600, 300);
		cena.setFill(Color.GREY);
		palco1.setTitle("Exemplo com JavaFX");
		palco1.setScene(cena);
		palco1.show();
	}

	public static void main(String[] args) {
		launch();

	}

}
