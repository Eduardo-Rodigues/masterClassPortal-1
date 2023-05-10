/*Classe : Instituição
Analista Responsável:  Bruno
Desenvolvedor que criou: João Contini
Desenvolvedor que assumiu: Fernanda
 */
package controller;

import java.util.Scanner;

public class Instituicao {

    public static void validaSetores(String[] main) {
        Scanner lerSetor = new Scanner(System.in);
        
        boolean aluno = false;
        boolean financeiro = false;
        boolean curso = false;
        boolean biblioteca = false;
        boolean juridico = false;
        String nomeDoSetor;
        String existeSetor = "Esse setor existe dentro desta instituição";
        String naoExisteSetor = "Esse setor não existe dentro desta instituição";

        System.out.print("Informe o setor: ");
        nomeDoSetor = lerSetor.next();
        switch (nomeDoSetor) {
            case "aluno":
                if (aluno == true) {
                    System.out.println(existeSetor);
                } else {
                    System.out.println(naoExisteSetor);
                }
                break;
            case "financeiro":
                if (financeiro == true) {
                    System.out.println(existeSetor);
                } else {
                    System.out.println(naoExisteSetor);
                }
                break;
            case "curso":
                if (curso == true) {
                    System.out.println(existeSetor);
                } else {
                    System.out.println(naoExisteSetor);
                }
                break;
            case "biblioteca":
                if (biblioteca == true) {
                    System.out.println(existeSetor);
                } else {
                    System.out.println(naoExisteSetor);
                }
                break;
            case "juridico":
                if (juridico == true) {
                    System.out.println(existeSetor);
                } else {
                    System.out.println(naoExisteSetor);
                }
                break;
            default:
                System.out.println("O setor informado não existe no corpo acadêmico desta instituição");
        }
    }
}
