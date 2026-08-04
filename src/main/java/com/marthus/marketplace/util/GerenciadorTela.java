package com.marthus.marketplace.util;

import java.io.IOException;

public class GerenciadorTela {

    private static GerenciadorTela instancia;

        private GerenciadorTela(){
        }

        public static GerenciadorTela getInstancia(){
            if (instancia == null){
                instancia = new GerenciadorTela();
            }
            return instancia;
        }

    public void trocarTela(ActionEvent event, String telaFXML, String titulo) throws IOException {

    }
}
