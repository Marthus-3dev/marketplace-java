package com.marthus.marketplace.controller;

import javafx.fxml.FXML;

public class RelatorioController {

    @FXML
    private Label lblTotalProdutos;

    @FXML
    private Label lblValorTotal;

    @FXML
    private Label lblEstoqueBaixo;

    private final EstoqueDAO dadosEstoque = EstoqueDao.getInstancia();

    @FXML
    public void initialize(){

    }








}
