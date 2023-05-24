/*
 * Classe : TipoFuncao
 * Analista Responsável:  Joao Florisvaldo
 * Desenvolvedor: Eduardo
 */
package controller;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class TipoFuncao {
    private ArrayList<String> nomeFuncao = new ArrayList<>();
    // adição de método useLocale() para tratamento de caraçteres da lingua portuguesa.
    public void cadastrarFuncao() {
        Scanner lerInput = new Scanner(System.in).useLocale(new Locale("pt", "BR"));
        System.out.print("Digite o nome da função: ");
        String nome = lerInput.nextLine();
        nomeFuncao.add(nome);
        System.out.println("Função cadastrada com sucesso!");
    }

    public void editarFuncao() {
        Scanner lerInput = new Scanner(System.in);
        System.out.print("Digite o código da função que deseja editar: \nSe não souber vá até a opção Exibir Função. ");
        int indice = lerInput.nextInt();
        lerInput.nextLine(); 
        if (indice >= 0 && indice < nomeFuncao.size()) {
            System.out.print("Digite o novo nome da função: ");
            String nome = lerInput.nextLine();
            nomeFuncao.set(indice, nome);
            System.out.println("Função editada com sucesso!");
        } else {
            System.out.println("Índice inválido!");
        }
    }

    public void excluirFuncao() {
        Scanner lerInput = new Scanner(System.in);
        System.out.print("Digite o código da função que deseja excluir: ");
        int indice = lerInput.nextInt();
        lerInput.nextLine(); 
        if (indice >= 0 && indice < nomeFuncao.size()) {
            nomeFuncao.remove(indice);
            System.out.println("Função excluída com sucesso!");
        } else {
            System.out.println("Código inválido!");
        }
    }

    public String exibirFuncao() {
        if (nomeFuncao.isEmpty()) {
            return "Nenhuma função cadastrada!";
        } else {
        String resultado = "Funções cadastradas:\n";
        for (int i = 0; i < nomeFuncao.size(); i++) {
            resultado += i + ": " + nomeFuncao.get(i) + "\n";
        }
        return resultado;
        }
    }
}
