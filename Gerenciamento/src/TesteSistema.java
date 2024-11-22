public class TesteSistema {
    public static void main(String[] args) {
        // Criação de instâncias
        Aluno aluno1 = new Aluno("João", 20, "Rua A");
        Professor professor1 = new Professor("Maria", 30, "Rua B");

        // Criação de cursos e aulas
        Curso cursoPiano = new CursoDePiano(1);
        Aula aula1 = new Aula("Aula de Piano", "Segunda, 14h");

        // Gerenciamento de inscrições e aulas
        aluno1.inscreverCurso(cursoPiano);

        // Instanciação do gerenciador de aulas
        GerenciadorDeAulas gerenciador = GerenciadorDeAulas.getInstance();

        // Criação dos observadores
        AlunoObservador alunoObs = new AlunoObservador(aluno1);
        ProfessorObservador professorObs = new ProfessorObservador(professor1);

        // Adição dos observadores ao gerenciador
        gerenciador.adicionarObservador(alunoObs);
        gerenciador.adicionarObservador(professorObs);

        // Agendamento e cancelamento de aulas notificando observadores
        gerenciador.agendarAula(aula1);
        gerenciador.cancelarAula(aula1);
    }
}
