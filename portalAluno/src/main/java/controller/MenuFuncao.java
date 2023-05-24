/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Scanner;

/**
 *
 * @author eduro
 */
public class MenuFuncao {
    public static void menuFuncao(String[] args) {
        TipoFuncao menuTipoFuncao = new TipoFuncao();
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("Escolha uma opção: " +
                   "\n1 - Cadastrar função." +
                   "\n2 - Excluir função." +
                   "\n3 - Editar função." +
                   "\n4 - Exibir funções cadastradas." +
                   "\n0 - Sair" +
                   "\nOpção:"
                    );
            try {
                opcao = Integer.parseInt(scanner.nextLine());
                switch (opcao) {
                    case 1:
                        menuTipoFuncao.cadastrarFuncao();
                        break;
                    case 2:
                        menuTipoFuncao.excluirFuncao();
                        break;
                    case 3:
                        menuTipoFuncao.editarFuncao();
                        break;
                    case 4:
                        System.out.println(menuTipoFuncao.exibirFuncao());
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida!");
            }
            
        }
    }
}
