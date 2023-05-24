/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Date;

/**
 *  Analista responsável: Erick.
 *  Desenvolvedor: Eduardo
 * 
 */
public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;

    public Funcionario(String nomeSobrenome, String CPF, int registroGeral, String tipoFuncao, Date dataNasc, Date dataRegistro, String email, String telefone, boolean pcd, String genero, String endereco) {
        super(nomeSobrenome, CPF, registroGeral, tipoFuncao, dataNasc, dataRegistro, email, telefone, pcd, genero, endereco);
    }
    
    public void adicionar(String NomeSobrenome, String CPF, int registroGeral, String tipoFuncao, Date dataNasc, Date dataRegistro, String email, String telefone, boolean pcd, String genero, String endereco, String cargo, double salario) {
        this.nomeSobrenome = NomeSobrenome;
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
    public void editarPessoa(String nomeSobrenome, String CPF, int registroGeral, String tipoFuncao, Date dataNasc, Date dataRegistro, String email, String telefone, boolean pcd, String genero, String endereco) {
        super.editarPessoa(nomeSobrenome, CPF, registroGeral, tipoFuncao, dataNasc, dataRegistro, email, telefone, pcd, genero, endereco);
        this.cargo = cargo;
        this.salario = salario;
    }

    @Override
    public void excluirPessoa() {
        super.excluirPessoa();
        this.cargo = null;
        this.salario = 0.0;
    }
    
    public String toString() {
        return "Funcionario{" +
                "\n Nome: " + nomeSobrenome +
                "\nCPF: " + CPF +
                "\nRG: " + registroGeral +
                "\n" + tipoFuncao  +
                "\nData de Nascimento: " + dataNasc +
                "\nData de registro: " + dataRegistro +
                "\nEmail: " + email +
                "\nTelefone:" + telefone +
                "\nPCD: " + pcd +
                "\n Genero" + genero +
                "\n Endereço: " + endereco +
                "\n Cargo:" + cargo +
                "\n Salário: " + salario;
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