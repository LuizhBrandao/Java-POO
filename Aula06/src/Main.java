public class Main {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.abrirMenu();
        c.ligar();
        c.maisVolume();
        c.maisVolume();
        c.maisVolume();
        c.maisVolume();
        c.abrirMenu();
        c.ligarMudo();
        c.pause();
        c.abrirMenu();
        c.play();
        c.desligarMudo();
        c.abrirMenu();
        c.menosVolume();
        c.menosVolume();
        c.abrirMenu();
    }
}