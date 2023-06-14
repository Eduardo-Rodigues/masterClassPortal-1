/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduro
 */
class FuncaoRepositorioImpl implements RepositorioFuncao {
    private List<String> nomeFuncao = new ArrayList<>();
    
    @Override
    public void adicionarFuncao(String nome) {
        nomeFuncao.add(nome);
    }

    @Override
    public void editarFuncao(int indice, String novoNome) {
        nomeFuncao.set(indice, novoNome);
    }

    @Override
    public void excluirFuncao(int indice) {
        nomeFuncao.remove(indice);
    }

    @Override
    public List<String> listarFuncoes() {
        return nomeFuncao;
    }
}