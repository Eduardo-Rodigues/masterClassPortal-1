/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;

/**
 *
 * @author eduro
 */
public class ExibirFuncao {
    private RepositorioFuncao repositorio;
    
    public ExibirFuncao(RepositorioFuncao repositorio) {
        this.repositorio = repositorio;
    }
    
    public String exibirFuncao() {
        List<String> funcoes = (List<String>) repositorio.listarFuncoes();
        
        if (funcoes.isEmpty()) {
            return "Nenhuma função cadastrada!";
        } else {
            String resultado = "Funções cadastradas:\n";
            for (int i = 0; i < funcoes.size(); i++) {
                resultado += i + ": " + funcoes.get(i) + "\n";
            }
            return resultado;
        }
    }
}
