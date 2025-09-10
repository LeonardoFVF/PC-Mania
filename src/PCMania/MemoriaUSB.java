package pcmania;

public class MemoriaUSB {
    private String nome;
    private int capacidade;

    public MemoriaUSB(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public void mostrarInfo() {
        System.out.println("Brinde: " + nome + " - " + capacidade);
    }
}
