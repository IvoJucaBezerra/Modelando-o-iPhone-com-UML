package src;

import src.iphone.iPhone;

public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Testando ReprodutorMusical
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica();

        // Testando AparelhoTelefonico
        meuIphone.ligar();
        meuIphone.atender();
        meuIphone.iniciarCorreioDeVoz();

        // Testando NavegadorNaInternet
        meuIphone.exibirPagina();
        meuIphone.abrirNovaAba();
        meuIphone.atualizarPagina();
    }
}

