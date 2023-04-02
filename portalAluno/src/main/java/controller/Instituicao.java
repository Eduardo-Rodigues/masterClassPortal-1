/*Classe : Instituição
Analista Responsável:  Bruno
Desenvolvedor: João Contini
*/

package controller;

import java.util.Scanner;

public class Instituicao {
    
    public static void validaSetores(String[] main){
        boolean aluno = false;
        boolean financeiro = false;
        boolean curso = false;
        boolean logradouro = false;
        boolean biblioteca = false;
        boolean juridico = false;
        Scanner ler = new Scanner(System.in);
        String setor;
        setor = ler.next();
        switch (setor) {
            case "aluno":
                if (aluno == true) {
                    System.out.println("Esse setor existe dentro desta instituição");
                } else {
                    System.out.println("Esse setor não existe dentro desta instituição");
                }
                break;
            case "financeiro":
                if (financeiro == true) {
                    System.out.println("Esse setor existe dentro desta instituição");
                } else {
                    System.out.println("Esse setor não existe dentro desta instituição");
                }
                break;
            case "curso":
                if (curso == true) {
                    System.out.println("Esse setor existe dentro desta instituição");
                } else {
                    System.out.println("Esse setor não existe dentro desta instituição");
                }
                break;
            case "logradouro":
                if (logradouro == true) {
                    System.out.println("Esse setor existe dentro desta instituição");
                } else {
                    System.out.println("Esse setor não existe dentro desta instituição");
                }
                break;
            case "biblioteca":
                if (biblioteca == true) {
                    System.out.println("Esse setor existe dentro desta instituição");
                } else {
                    System.out.println("Esse setor não existe dentro desta instituição");
                }
                break;
            case "juridico":
                if (juridico == true) {
                    System.out.println("Esse setor existe dentro desta instituição");
                } else {
                    System.out.println("Esse setor não existe dentro desta instituição");
                }         
                break;
            default:
                System.out.println("O setor informado não existe no corpo acadêmico desta instituição");
        }
    }
}