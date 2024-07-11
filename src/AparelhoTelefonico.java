public class AparelhoTelefonico {
    private String numeroTelefone;

    public void ligar(String numero) {
        this.numeroTelefone = numero;
        System.out.println("Ligando para: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
}