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
    
    public void adicionar(String NomeSobrenome, String CPF, int registroGeral, String tipoFuncao, Date dataNasc, Date dataRegistro, String email, String telefone, boolean pcd, String genero, String endereco, String cargo, double salario) {
        this.NomeSobrenome = NomeSobrenome;
        this.CPF = CPF;
        this.registroGeral = registroGeral;
        this.tipoFuncao = tipoFuncao;
        this.dataNasc = dataNasc;
        this.dataRegistro = dataRegistro;
        this.email = email;
        this.telefone = telefone;
        this.pcd = pcd;
        this.genero = genero;
        this.endereco = endereco;
        this.cargo = cargo;
        this.salario = salario;
    }

    @Override
    public void editar(String NomeSobrenome, String CPF, int registroGeral, String tipoFuncao, Date dataNasc, Date dataRegistro, String email, String telefone, boolean pcd, String genero, String endereco) {
        editar(NomeSobrenome, CPF, registroGeral, tipoFuncao, dataNasc, dataRegistro, email, telefone, pcd, genero, endereco);
        this.cargo = cargo;
        this.salario = salario;
        super.editar(NomeSobrenome, CPF, registroGeral, tipoFuncao, dataNasc, dataRegistro, email, telefone, pcd, genero, endereco);
    }

    @Override
    public void excluir(String NomeSobrenome, String CPF, int registroGeral, String tipoFuncao, Date dataNasc, Date dataRegistro, String email, String telefone, boolean pcd, String genero, String endereco) {
        this.cargo = null;
        this.salario = 0.0;
        super.excluir(NomeSobrenome, CPF, registroGeral, tipoFuncao, dataNasc, dataRegistro, email, telefone, pcd, genero, endereco);
    }
    
    public String toString() {
        return "Funcionario{" +
                "nomeSobrenome='" + this.getNomeSobrenome() + '\'' +
                ", CPF='" + CPF + '\'' +
                ", registroGeral=" + registroGeral +
                ", tipoFuncao='" + tipoFuncao + '\'' +
                ", dataNasc=" + dataNasc +
                ", dataRegistro=" + dataRegistro +
                ", email='" + email + '\'' +
                ", telefone='" + this.getTelefone() + '\'' +
                ", pcd=" + pcd +
                ", genero='" + this.getGenero() + '\'' +
                ", endereco='" + this.getEndereco() + '\'' +
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