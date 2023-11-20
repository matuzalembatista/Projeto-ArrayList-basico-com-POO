import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Aluno> listarAlunos = new ArrayList<>();

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Matuzalem");
        aluno1.setNota(9.9);
        listarAlunos.add(aluno1);

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Ana");
        aluno2.setNota(8.5);
        listarAlunos.add(aluno2);


        Aluno aluno3 = new Aluno();
        aluno3.setNome("Maria");
        aluno3.setNota(5.9);
        listarAlunos.add(aluno3);

        Aluno aluno4 = new Aluno();
        aluno4.setNome("Joao");
        aluno4.setNota(7.4);
        listarAlunos.add(aluno4);


        double media = calcularMedia(listarAlunos);
        System.out.printf(" Media de notas dos alunos: %.2f ", media);
    }


    public static double calcularMedia(ArrayList<Aluno> alunos ){
        double somaNota = 0.0;
        for(Aluno aluno : alunos){
            somaNota += aluno.getNota();
        }
        return somaNota / alunos.size();
    }
}