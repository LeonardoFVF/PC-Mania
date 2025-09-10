package pcmania;

import java.util.Scanner;

public class PCMania {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // <<< ALTERE para sua matrícula real >>>
        int matricula = 1000;

        // Promoção 1
        Computador pc1 = new Computador("Apple", matricula);
        pc1.adicionarHardware(new HardwareBasico("Pentium Core i3", 2200), 0);
        pc1.adicionarHardware(new HardwareBasico("Memória RAM", 8), 1);
        pc1.adicionarHardware(new HardwareBasico("HD", 500), 2);
        pc1.instalarSO(new SistemaOperacional("macOS Sequoia", 64));
        pc1.adicionarMemoriaUSB(new MemoriaUSB("Pen-drive", 16));

        // Promoção 2
        Computador pc2 = new Computador("Samsung", matricula + 1234);
        pc2.adicionarHardware(new HardwareBasico("Pentium Core i5", 3370), 0);
        pc2.adicionarHardware(new HardwareBasico("Memória RAM", 16), 1);
        pc2.adicionarHardware(new HardwareBasico("HD", 1000), 2);
        pc2.instalarSO(new SistemaOperacional("Windows 8", 64));
        pc2.adicionarMemoriaUSB(new MemoriaUSB("Pen-drive", 32));

        // Promoção 3
        Computador pc3 = new Computador("Dell", matricula + 5678);
        pc3.adicionarHardware(new HardwareBasico("Pentium Core i7", 4500), 0);
        pc3.adicionarHardware(new HardwareBasico("Memória RAM", 32), 1);
        pc3.adicionarHardware(new HardwareBasico("HD", 2000), 2);
        pc3.instalarSO(new SistemaOperacional("Windows 10", 64));
        pc3.adicionarMemoriaUSB(new MemoriaUSB("HD Externo", 1000));

        // Cadastro cliente
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite seu CPF: ");
        String cpf = sc.nextLine();
        Cliente cliente = new Cliente(nome, cpf);

        int opcao;
        do {
            System.out.println("\nEscolha a promoção (1-3) ou 0 para finalizar:");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1: cliente.comprar(pc1); break;
                case 2: cliente.comprar(pc2); break;
                case 3: cliente.comprar(pc3); break;
                case 0: break;
                default: System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        // Resumo
        System.out.println("\n=== RESUMO DA COMPRA ===");
        cliente.mostrarResumo();
        System.out.println("Pedido enviado!");
    }
}
