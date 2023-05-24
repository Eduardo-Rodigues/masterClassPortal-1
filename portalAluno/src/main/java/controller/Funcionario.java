/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author eduro
 */
public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;
    
    public void dadosFuncionario() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o nome do funcionário: (ex: Antonio das Neves)");
        String setNome = ler.nextLine();
        
        System.out.println("Informe o CPF do funcionário: (ex: 11111111111)");
        String setCpf = ler.nextLine();
        
        System.out.println("Informe o registro do funcionário: (ex: 00241717)");
        int setR = ler.nextInt();

        System.out.println("Informe o email do funcionário: (ex: fulano@unipar.com)");
        String setE = ler.next();
        
        System.out.println("Informe o telefone do funcionário: (ex: 45999999999)");
        String setTelefone = ler.next();
        
        System.out.println("Informe o endereco do funcionário: (ex: Rua Presidente, 59)");
        String setEndereco = ler.next();
        
        System.out.println("Informe o gênero do funcionário: (ex: feminino)");
        String setGenero = ler.next();
        
        System.out.println("Informe se o funcionário é PCD: (sim/não)");
        boolean setPcd = ler.nextBoolean();
       
        System.out.println("Informe a função: (ex: professor)");
        String setCargo = ler.nextLine();
        
        System.out.println("Informe o salário do funcionário: (ex: 3500)");
        double setSalario = ler.nextDouble();
        
        this.adicionar(setNome, setCpf, setR, setE, setTelefone, setPcd, setGenero, setEndereco, setCargo, setSalario);
    }
    
    public void adicionar(String NomeSobrenome, String CPF, int registroGeral, String email, String telefone, boolean pcd, String genero, String endereco, String cargo, double salario) {
        this.NomeSobrenome = NomeSobrenome;
        this.CPF = CPF;
        this.registroGeral = registroGeral;
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