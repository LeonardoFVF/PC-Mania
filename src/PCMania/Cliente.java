package pcmania;

public class Cliente {
    private String nome;
    private String cpf;
    private Computador[] compras;
    private int qtdCompras;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.compras = new Computador[10]; // limite de 10 compras
        this.qtdCompras = 0;
    }

    public void comprar(Computador pc) {
        if (qtdCompras < compras.length) {
            compras[qtdCompras] = pc;
            qtdCompras++;
        }
    }

    public float totalCompra() {
        float total = 0;
        for (int i = 0; i < qtdCompras; i++) {
            total += compras[i].preco();
        }
        return total;
    }

    public void mostrarResumo() {
        System.out.println("Cliente: " + nome + " | CPF: " + cpf);
        System.out.println("=== Computadores comprados ===");
        for (int i = 0; i < qtdCompras; i++) {
            compras[i].mostrarPCConfigs();
        }
        System.out.println("TOTAL DA COMPRA: R$ " + totalCompra());
    }
}
