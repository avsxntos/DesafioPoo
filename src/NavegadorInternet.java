public class NavegadorInternet {
    private String urlAtual;

    public void exibirPagina(String url) {
        this.urlAtual = url;
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }
}