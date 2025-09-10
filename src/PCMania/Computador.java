package pcmania;

public class Computador {
    private String marca;
    private float preco;
    private HardwareBasico[] hb;
    private SistemaOperacional so;
    private MemoriaUSB musb;

    public Computador(String marca, float preco) {
        this.marca = marca;
        this.preco = preco;
        this.hb = new HardwareBasico[3]; // máximo 3 hardwares básicos
    }

    public void instalarSO(SistemaOperacional so) {
        this.so = so;
    }

    public void adicionarHardware(HardwareBasico hardware, int pos) {
        if (pos >= 0 && pos < hb.length) {
            hb[pos] = hardware;
        }
    }

    public void adicionarMemoriaUSB(MemoriaUSB musb) {
        this.musb = musb;
    }

    public float preco() {
        return preco;
    }

    public void mostrarPCConfigs() {
        System.out.println("Marca: " + marca);
        for (HardwareBasico h : hb) {
            if (h != null) {
                h.mostrarInfo();
            }
        }
        if (so != null) so.mostrarInfo();
        if (musb != null) musb.mostrarInfo();
        System.out.println("Preço: R$ " + preco);
        System.out.println("-----------------------------------");
    }
}
