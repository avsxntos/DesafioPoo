public class ReprodutorMusical {
    private String musicaAtual;

    public void tocar() {
        System.out.println("Tocando música...");
    }

    public void pausar() {
        System.out.println("Pausando música...");
    }

    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Selecionando música: " + musica);
    }
}