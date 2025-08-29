package academy.devdojo.maratonajava.javacore.introducaoaclasses.Test;

import academy.devdojo.maratonajava.javacore.introducaoaclasses.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.nome = "Rafael";
        pessoa.sexo = 'M';
        pessoa.idade = 19;

        System.out.println(pessoa.nome + " é " + pessoa.sexo + " e tem " + pessoa.idade +" anos");
    }
}
