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
public interface RepositorioFuncao {
    void adicionarFuncao(String nome);
    void editarFuncao(int indice, String novoNome);
    void excluirFuncao(int indice);
    List<String> listarFuncoes();
}
