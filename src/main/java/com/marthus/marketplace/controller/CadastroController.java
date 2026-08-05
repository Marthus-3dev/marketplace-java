package com.marthus.marketplace.controller;

import com.marthus.marketplace.model.UsuarioDAO;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.TextFlow;

public class CadastroController {

    @FXML
    private TextField usuarioCadastrar;

    @FXML
    private PasswordField senhaCadastrar;

    @FXML
    private PasswordField confirmarSenha;

    @FXML
    private TextFlow senhaNaoIguais;

    @FXML
    private TextFlow semNada;

    private static UsuarioDAO dbUsuario = UsuarioDAO.getInstancia();

    @FXML
    protected void aoCadastrar(){
        String usuario = usuarioCadastrar.getText
    }





}
