public class Main {
    public static void main(String[] args) {
        Pessoa [] pessoa = new Pessoa[2];
        Livro [] livro = new Livro[3];

        pessoa[0] = new Pessoa("Luiz", 30, 'M');
        pessoa[1] = new Pessoa("Amanda", 25, 'F');

        livro[0] = new Livro("Aprendendo Java", "João Silva", 300, pessoa[0]);
        livro[1] = new Livro("POO para Iniciantes", "Antonio Nunes",500, pessoa[1]);
        livro[2] = new Livro("Java Avançado","Caio Ventura",700, pessoa[0]);

        livro[0].abrir();
        livro[0].folhear(100);
        livro[0].avancarPagina();
        System.out.println(livro[0].detalhes());

        System.out.println(livro[1].detalhes());
    }
}