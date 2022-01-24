package pessoas;

public class Aluno extends Pessoa {
    private int matricula;
    public Aluno(){
        super();
    }
    public Aluno(int matricula, String nome, int idade){
        super(idade, nome);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    @Override
    public String toString() {
        return "Professor { nome = " + getNome() +
                "\nidade = " + getIdade() +
                "\nmatricula = " + matricula +
                '}';
    }
}
