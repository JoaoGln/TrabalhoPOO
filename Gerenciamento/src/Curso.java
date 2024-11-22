public abstract class Curso {
    private String nome;
    private int nivel;

    public Curso(String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public int getNivel() {
        return nivel;
    }
}