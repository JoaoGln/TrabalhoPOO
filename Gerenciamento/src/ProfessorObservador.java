public class ProfessorObservador implements Observador {
    private Professor professor;

    public ProfessorObservador(Professor professor) {
        this.professor = professor;
    }

    @Override
    public void atualizar(String mensagem) {
        System.out.println("Professor " + professor.getNome() + ": " + mensagem);
    }
}
