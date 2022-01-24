package pessoas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(21, "André");
        Professor professor = new Professor("Matemática",35,"Ryan");
        Aluno aluno = new Aluno(3129,"Tiago",23);
        System.out.println(pessoa);
        System.out.println(professor);
        System.out.println(aluno);
    }
}
