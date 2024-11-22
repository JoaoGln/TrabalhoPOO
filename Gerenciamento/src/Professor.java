import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa implements Agendavel {
    private List<Aula> aulas;

    public Professor(String nome, int idade, String endereco) {
        super(nome, idade, endereco);
        this.aulas = new ArrayList<>();
    }

    @Override
    public void agendarAula(Aula aula) {
        aulas.add(aula);
        System.out.println("Aula agendada: " + aula.getDescricao());
    }

    @Override
    public void cancelarAula(Aula aula) {
        aulas.remove(aula);
        System.out.println("Aula cancelada: " + aula.getDescricao());
    }
}
