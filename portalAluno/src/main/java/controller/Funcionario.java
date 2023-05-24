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
public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;

    public Funcionario(String nomeSobrenome, String CPF, int registroGeral, String tipoFuncao, Date dataNasc, Date dataRegistro, String email, String telefone, boolean pcd, String genero, String endereco, String cargo, double salario) {
        super(nomeSobrenome, CPF, registroGeral, tipoFuncao, dataNasc, dataRegistro, email, telefone, pcd, genero, endereco);
        this.cargo = cargo;
        this.salario = salario;
    }
    
    public void editar(String nomeSobrenome, String CPF, int registroGeral, String tipoFuncao, Date dataNasc, Date dataRegistro, String email, String telefone, boolean pcd, String genero, String endereco, String cargo, double salario) {
        editarPessoa(nomeSobrenome, CPF, registroGeral, tipoFuncao, dataNasc, dataRegistro, email, telefone, pcd, genero, endereco);
        this.cargo = cargo;
        this.salario = salario;
        super.editarPessoa(nomeSobrenome, CPF, registroGeral, tipoFuncao, dataNasc, dataRegistro, email, telefone, pcd, genero, endereco);
    }

    @Override
    public void excluirPessoa(){
        this.cargo = null;
        this.salario = 0.0;
        super.excluirPessoa();
    }
    
    public String toString() {
        return "Funcionario{" +
                "nomeSobrenome='" + nomeSobrenome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", registroGeral=" + registroGeral +
                ", tipoFuncao='" + tipoFuncao + '\'' +
                ", dataNasc=" + dataNasc +
                ", dataRegistro=" + dataRegistro +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", pcd=" + pcd +
                ", genero='" + genero + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                ' ';
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}