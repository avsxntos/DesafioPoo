public class Iphone {
    private Tela tela;
    private ReprodutorMusical reprodutor;
    private AparelhoTelefonico telefone;
    private NavegadorInternet navegador;

    public Iphone() {
        this.tela = new Tela();
        this.reprodutor = new ReprodutorMusical();
        this.telefone = new AparelhoTelefonico();
        this.navegador = new NavegadorInternet();
    }

    public void tocarMusica() {
        reprodutor.tocar();
    }

    public void fazerLigacao(String numero) {
        telefone.ligar(numero);
    }

    public void exibirPagina(String url) {
        navegador.exibirPagina(url);
    }
}
