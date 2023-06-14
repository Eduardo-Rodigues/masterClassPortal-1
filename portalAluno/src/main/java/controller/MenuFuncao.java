/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author eduro
 */
public class MenuFuncao {

    private RepositorioFuncao repositorio;
    private CadastrarFuncao cadastro;
    private EditarFuncao edicao;
    private ExcluirFuncao exclusao;
    private ExibirFuncao exibicao;
    
    public MenuFuncao() {
        repositorio = new FuncaoRepositorioImpl();
        cadastro = new CadastrarFuncao(repositorio);
        edicao = new EditarFuncao(repositorio);
        exclusao = new ExcluirFuncao(repositorio);
        exibicao = new ExibirFuncao(repositorio);
    }
    
    public void iniciar() {
        Scanner lerInput = new Scanner(System.in);
        int opcao = 0;
        
        while (opcao != 5) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar função");
            System.out.println("2 - Editar função");
            System.out.println("3 - Excluir função");
            System.out.println("4 - Exibir funções");
            System.out.println("5 - Sair");
            
            opcao = lerInput.nextInt();
            lerInput.nextLine(); // Consumir a quebra de linha
            
            switch (opcao) {
                case 1:
                    cadastro.cadastrarFuncao();
                    break;
                case 2:
                    edicao.editarFuncao();
                    break;
                case 3:
                    exclusao.excluirFuncao();
                    break;
                case 4:
                    System.out.println(exibicao.exibirFuncao());
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
