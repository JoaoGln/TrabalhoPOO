import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    private List<Curso> cursos;

    public Aluno(String nome, int idade, String endereco) {
        super(nome, idade, endereco);
        this.cursos = new ArrayList<>();
    }

    public void inscreverCurso(Curso curso) {
        cursos.add(curso);
        System.out.println("Inscrição no curso " + curso.getNome() + " realizada.");
    }

    public void cancelarInscricao(Curso curso) {
        cursos.remove(curso);
        System.out.println("Inscrição no curso " + curso.getNome() + " cancelada.");
    }
}
