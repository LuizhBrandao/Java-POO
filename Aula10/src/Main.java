public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        Aluno pessoa2 = new Aluno();
        Professor pessoa3 = new Professor();
        Funcionario pessoa4 = new Funcionario();

        pessoa1.setNome("Carlos");
        pessoa2.setNome("Luiz");
        pessoa3.setNome("Anderson");
        pessoa4.setNome("Fabiana");

        pessoa1.setSexo('M');
        pessoa4.setSexo('F');
        pessoa2.setIdade(18);

        pessoa2.setCurso("Fabiana");
        pessoa3.setSalario(2500);
        pessoa4.setSetor("Estoque");

        System.out.println(pessoa1.toString());
        System.out.println(pessoa2.toString());
        System.out.println(pessoa3.toString());
        System.out.println(pessoa4.toString());

    }
}