package pcmania;

public class SistemaOperacional {
    private String nome;
    private int tipo; // 32 ou 64 bits

    public SistemaOperacional(String nome, int tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public void mostrarInfo() {
        System.out.println("SO: " + nome + " (" + tipo + " bits)");
    }
}
