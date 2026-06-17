package exercicio03;

import java.util.ArrayList;
import java.util.List;

public class AppTeste {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();

        aluno1.setNome("Andrea Silva");
        aluno1.setMatricula("12AB4");
        
        Aluno aluno2 = new Aluno();
        
        aluno2.setNome("Bruno Souza");
        aluno2.setMatricula("12BC3");
        
        Turma turma13 = new Turma("TF13", 3, 1);
        
        aluno1.setTurma(turma13);
        aluno2.setTurma(turma13);

        List<Aluno> listaAlunos = new ArrayList<>();
        listaAlunos.add(aluno1);
        listaAlunos.add(aluno2);
        
        turma13.setAlunos(listaAlunos);

        System.out.println("N. de alunos matriculados na Turma 13: " + turma13.getAlunos().size());
    }
    
}
