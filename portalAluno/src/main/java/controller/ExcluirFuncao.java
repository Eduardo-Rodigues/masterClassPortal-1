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
public class ExcluirFuncao {
    private RepositorioFuncao repositorio;
    
    public ExcluirFuncao(RepositorioFuncao repositorio) {
        this.repositorio = repositorio;
    }
    public void excluirFuncao() {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite o código da função que deseja excluir: ");
        int indice = read.nextInt();
        read.nextLine(); // Consumir a quebra de linha
        if (indice >= 0 && indice < repositorio.listarFuncoes().size()) {
            repositorio.excluirFuncao(indice);
            System.out.println("Função excluída com sucesso!");
        } else {
            System.out.println("Código inválido!");
        }
    }
}
