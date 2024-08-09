package src;

import src.IAparelhoTelefonico;
import src.INavegadorInternet;
import src.IReprodutorMusical;

public class iPhone implements IReprodutorMusical, IAparelhoTelefonico, INavegadorInternet {

    // Implementação dos métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música.");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada.");
    }

    // Implementação dos métodos da interface AparelhoTelefonico
    @Override
    public void ligar() {
        System.out.println("Ligando para o número desejado.");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada.");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    // Implementação dos métodos da interface NavegadorNaInternet
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página da web.");
    }

    @Override
    public void abrirNovaAba() {
        System.out.println("Abrindo uma nova aba no navegador.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página da web.");
    }
}


