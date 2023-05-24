/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Date;

/**
 *
 * @author eduro
 */
public class Reitor extends Funcionario {
    private String departamento;

    public Reitor(String nomeSobrenome, String CPF, int registroGeral, String tipoFuncao, Date dataNasc, Date dataRegistro, String email, String telefone, boolean pcd, String genero, String endereco, String cargo, double salario, String departamento) {
        super(nomeSobrenome, CPF, registroGeral, tipoFuncao, dataNasc, dataRegistro, email, telefone, pcd, genero, endereco, cargo, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void editar(String nomeSobrenome, String CPF, int registroGeral, String tipoFuncao, Date dataNasc, Date dataRegistro, String email, String telefone, boolean pcd, String genero, String endereco, String cargo, double salario) {
        super.editar(nomeSobrenome, CPF, registroGeral, tipoFuncao, dataNasc, dataRegistro, email, telefone, pcd, genero, endereco, cargo, salario);
    }

    @Override
    public void excluirPessoa() {
        super.excluirPessoa();
        this.departamento = null;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nDepartamento: " + departamento;
    }
}