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
public class EditarFuncao {
  private RepositorioFuncao repositorio;
    
    public EditarFuncao(RepositorioFuncao repositorio) {
        this.repositorio = repositorio;
    }
    
    public void editarFuncao() {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite o código da função que deseja editar: \nSe não souber vá até a opção Exibir Função. ");
        int indice = read.nextInt();
        read.nextLine(); // Consumir a quebra de linha
        if (indice >= 0 && indice < repositorio.listarFuncoes().size()) {
            System.out.print("Digite o novo nome da função: ");
            String nome = read.nextLine();
            repositorio.editarFuncao(indice, nome);
            System.out.println("Função editada com sucesso!");
        } else {
            System.out.println("Índice inválido!");
        }

    }  
}
