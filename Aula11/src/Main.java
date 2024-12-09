public class Main {
    public static void main(String[] args) {

        Visitante visitante1 = new Visitante();
        Aluno aluno1 = new Aluno();
        Bolsista bolsista1 = new Bolsista();

        visitante1.setNome("Jack");
        visitante1.setIdade(23);
        visitante1.setSexo('M');
        System.out.println(visitante1.toString());

        aluno1.setNome("Cleber");
        aluno1.setMatricula(1111);
        aluno1.setCurso("Informatica");
        aluno1.setIdade(19);
        aluno1.setSexo('M');
        aluno1.pagarMensalidade();

        bolsista1.setNome("Antonio");
        bolsista1.setMatricula(1112);
        bolsista1.setBolsa(13.5f);
        bolsista1.setSexo('M');
        bolsista1.pagarMensalidade();
        

    }
}