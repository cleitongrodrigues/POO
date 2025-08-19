package app;

public class PrimeiraClasse{
    public static void main(String[] args){
        Aluno a1 = new Aluno();
        a1.nome = "Robson";
        a1.idade = 32;

        Aluno a2 = a1;
        a2.nome = "Wertin";
        a2.idade = 46;

        System.out.println("nome = " + a1.nome);
        System.out.println("idade = " + a1.idade);

        System.out.println("---------------------");
        
        System.out.println("nome = " + a2.nome);
        System.out.println("idade = " + a2.idade);

        System.out.println("---------------------");

        System.out.println("[ CHAMADA DE METÓDO ]");
        System.out.println("A1 = " + a1.getDados());
        System.out.println("A2 = " + a2.getDados());

        System.out.println("---------------------");

        Aluno a3 = new Aluno("Maria", 35);
        System.out.println("[ CHAMADA DE METÓDO ]");
        System.out.println("A3 = " + a3.getDados());

        System.out.println("---------------------");

        Cliente c1 = new Cliente();
        c1.setNome("Cliente");
        System.out.println("[ CHAMADA DE GET ]");
        System.out.println(c1.getNome());
    }
}