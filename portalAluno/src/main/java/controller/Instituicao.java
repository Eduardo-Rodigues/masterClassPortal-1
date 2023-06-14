/*Classe : Instituição
Analista Responsável:  Bruno
Desenvolvedor que criou: João Contini
Desenvolvedor que assumiu: Fernanda
 */
package controller;

import java.util.Scanner;

public class Instituicao {

    private Setor[] setores;

    public Instituicao() {
        setores = new Setor[]{
            new Setor("aluno", true),
            new Setor("financeiro", true),
            new Setor("curso", true),
            new Setor("biblioteca", true),
            new Setor("juridico", true)
        };
    }

    public void validaSetores() {
        Scanner lerSetor = new Scanner(System.in);

        System.out.print("Informe o setor: ");
        String nomeDoSetor = lerSetor.next();

        boolean setorEncontrado = false;
        for (Setor setor : setores) {
            if (setor.getNome().equals(nomeDoSetor)) {
                setorEncontrado = true;
                if (setor.existeSetor()) {
                    System.out.println("Esse setor existe nessa instituição");
                } else {
                    System.out.println("Esse setor não existe nessa instituição");
                }
                break;
            }
        }

        if (!setorEncontrado) {
            System.out.println("O setor informado não existe nessa instituição");
        }
    }
}
