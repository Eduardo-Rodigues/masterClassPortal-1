/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author eduro
 */
public class CadastrarFuncao {
    private RepositorioFuncao repositorio;
    
    public CadastrarFuncao(RepositorioFuncao repositorio) {
        this.repositorio = repositorio;
    }
    
    public void cadastrarFuncao() {
        Scanner read = new Scanner(System.in).useLocale(new Locale("pt", "BR"));
        System.out.print("Digite o nome da função: ");
        String nome = read.nextLine();
        repository.adicionarFuncao(nome);
        System.out.println("Função cadastrada com sucesso!");
    }

}
