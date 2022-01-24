package pessoas;

public class Professor extends Pessoa {
    private String materia;

    public Professor() {
        super();
    }
    public Professor(String materia, int idade, String nome){
        super(idade, nome);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Professor { nome = " + getNome() +
                "\nidade = " + getIdade() +
                "\nmateria = " + materia +
                '}';
    }
}
