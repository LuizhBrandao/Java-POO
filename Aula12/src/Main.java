public class Main {
    public static void main(String[] args) {

        Mamifero mamifero1 = new Mamifero();
        Repitil repitil1 = new Repitil();
        Peixe peixe1 = new Peixe();
        Ave ave1 = new Ave();
        Canguru canguru1 = new Canguru();
        Cachorro cachorro1 = new Cachorro();


        mamifero1.setPeso(7.75);
        mamifero1.setIdade(9);
        mamifero1.setMembros(4);
        mamifero1.locomover();
        mamifero1.alimentar();
        mamifero1.emitirSom();

        canguru1.setPeso(57.39);
        canguru1.setIdade(3);
        canguru1.setMembros(4);
        canguru1.locomover();
        canguru1.alimentar();
        canguru1.emitirSom();
        canguru1.usarBolsa();

        cachorro1.setPeso(3.91);
        cachorro1.setIdade(5);
        cachorro1.setMembros(4);
        cachorro1.locomover();
        cachorro1.alimentar();
        cachorro1.emitirSom();
        cachorro1.abanarRabo();

    }
}