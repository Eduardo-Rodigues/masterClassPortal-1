package controller;

import java.util.*;

public class Pessoa {
    protected String nomeSobrenome;
    protected String CPF;
    protected int registroGeral;
    protected String tipoFuncao;
    protected Date dataNasc;
    protected Date dataRegistro;
    protected String email;
    protected String telefone;
    protected boolean pcd;
    protected String genero;
    protected String endereco;

    public Pessoa(String nomeSobrenome, String CPF, int registroGeral, String tipoFuncao, Date dataNasc, Date dataRegistro, String email, String telefone, boolean pcd, String genero, String endereco) {
        this.nomeSobrenome = nomeSobrenome;
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
    }
    
    public String getTelefone() {
        return telefone;
    }

    public String getGenero() {
        return genero;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void editarPessoa(String nomeSobrenome, String CPF, int registroGeral, String tipoFuncao, Date dataNasc, Date dataRegistro, String email, String telefone, boolean pcd, String genero, String endereco) {
        this.nomeSobrenome = nomeSobrenome;
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
    }

    public void excluirPessoa() {
        this.nomeSobrenome = null;
        this.CPF = null;
        this.registroGeral = 0;
        this.tipoFuncao = null;
        this.dataNasc = null;
        this.dataRegistro = null;
        this.email = null;
        this.telefone = null;
        this.pcd = false;
        this.genero = null;
        this.endereco = null;
    }
}