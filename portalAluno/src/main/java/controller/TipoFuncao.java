/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tipofuncao;

import com.mycompany.empresa.funcao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduro
 */
public class TipoFuncao {
    public static void main(String[] args) {
        
    }

    public List<funcao> funcoes = new ArrayList<>();

    public void cadastrarCargo(funcao funcao) {
        funcoes.add(funcao);
    }

    public void removerCargo(funcao funcao) {
        funcoes.remove(funcao);
    }
    public void editarFuncao(funcao funcaoAntiga, funcao funcaoNova) {
        int index = funcoes.indexOf(funcaoAntiga);
        if (index >= 0) {
            funcoes.set(index, funcaoNova);
        }
    }
    public void exibirFuncao(List<String> funcoes) {
        for (String exibirFuncoes : funcoes) {
            System.out.println(exibirFuncoes);
        }
    }
}
