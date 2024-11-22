import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeAulas {
    private static GerenciadorDeAulas instancia;
    private List<Aula> aulas;
    private List<Observador> observadores;

    private GerenciadorDeAulas() {
        aulas = new ArrayList<>();
        observadores = new ArrayList<>();
    }

    public static GerenciadorDeAulas getInstance() {
        if (instancia == null) {
            instancia = new GerenciadorDeAulas();
        }
        return instancia;
    }

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    private void notificarObservadores(String mensagem) {
        for (Observador observador : observadores) {
            observador.atualizar(mensagem);
        }
    }

    public void agendarAula(Aula aula) {
        aulas.add(aula);
        notificarObservadores("Nova aula agendada: " + aula.getDescricao() + " às " + aula.getHorario());
    }

    public void cancelarAula(Aula aula) {
        aulas.remove(aula);
        notificarObservadores("Aula cancelada: " + aula.getDescricao() + " às " + aula.getHorario());
    }
}
