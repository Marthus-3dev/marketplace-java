package com.marthus.marketplace.controller;

import com.marthus.marketplace.model.UsuarioDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    private TextField usuario;

    @FXML
    private PasswordField senha;

    @FXML
    private TextFlow erroDados;

    private final UsuarioDAO bdUsuario = UsuarioDAO.getInstancia();

    @FXML
    protected void aoApertarBotao(ActionEvent event) throws IOException {

        String usuarioDigitado = usuario.getText().toLowerCase();
        String senhaDigitada = senha.getText();

        Optional

        if (usuarioCadastrado.equalsIgnoreCase(usuario.getText()) && senhaCadastrada.equals(senha.getText())) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("home.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
            stage.setTitle("home");
            stage.show();

        }else{
            erroDados.setVisible(true);
        }
    }
    @FXML
    protected void aoEsquecerSenha(){
        System.out.println("Você esqueceu seu burroide");
    }
}
