package aula10;

import javafx.application.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class LoginApp extends Application{
	@Override
	public void start(Stage estagio) throws Exception{
		AnchorPane painel = new AnchorPane();
		painel.setPrefSize(400, 300);
		
		TextField txLogin = new TextField();
		txLogin.setPromptText("Digite aqui seu login");
		PasswordField txSenha = new PasswordField();
		txSenha.setPromptText("Digite aqui sua senha");
		Button btEntrar = new Button("Entrar");	
		Button btSair = new Button("Sair");
		
		painel.getChildren().addAll(txLogin, txSenha, btEntrar, btSair);
		
		painel.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, blue 0%, silver 100%);");
		
		Scene cena = new Scene(painel);
		estagio.setTitle("Login com JavaFX");
		estagio.setScene(cena);
		estagio.show();
		
		txLogin.setLayoutX((painel.getWidth() - txLogin.getWidth()) / 2);
		txLogin.setLayoutY(75);
		txSenha.setLayoutX((painel.getWidth() - txSenha.getWidth()) / 2);
		txSenha.setLayoutY(125);
		btEntrar.setLayoutX((painel.getWidth() - btEntrar.getWidth()) / 3);
		btEntrar.setLayoutY(175);
		btSair.setLayoutX((painel.getWidth() - btSair.getWidth()) / 1.5);
		btSair.setLayoutY(175);
	}
	
	public static void main(String[] args) {
		launch();

	}

}
