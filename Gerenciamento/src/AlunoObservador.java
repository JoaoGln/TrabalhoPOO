public class AlunoObservador implements Observador {
    private Aluno aluno;

    public AlunoObservador(Aluno aluno) {
        this.aluno = aluno;
    }

    @Override
    public void atualizar(String mensagem) {
        System.out.println("Aluno " + aluno.getNome() + ": " + mensagem);
    }
}
