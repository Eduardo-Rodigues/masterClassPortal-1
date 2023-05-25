package controller;

import java.util.*;

public class Pessoa {

    public String NomeSobrenome;
    protected String CPF;
    public int registroGeral;
    public String tipoFuncao;
    public Date dataNasc;
    public Date dataRegistro;
    public String email;
    protected String telefone;
    public boolean pcd;
    protected String genero;
    protected String endereco;

    public void adicinar(String NomeSobrenome, String CPF, int registroGeral, String tipoFuncao, Date dataNasc, Date dataRegistro, String email, String telefone, boolean pcd, String genero, String endereco) {
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
    }

    public void editar(String NomeSobrenome, String CPF, int registroGeral, String tipoFuncao, Date dataNasc, Date dataRegistro, String email, String telefone, boolean pcd, String genero, String endereco) {
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
    }

    public void excluir(String NomeSobrenome, String CPF, int registroGeral, String tipoFuncao, Date dataNasc, Date dataRegistro, String email, String telefone, boolean pcd, String genero, String endereco) {
        this.NomeSobrenome = null;
        this.CPF = null;
        this.registroGeral = (Integer) null;
        this.tipoFuncao = null;
        this.dataNasc = null;
        this.dataRegistro = null;
        this.email = null;
        this.telefone = null;
        this.pcd = (Boolean) null;
        this.genero = null;
        this.endereco = null;
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

    public String getNomeSobrenome() {
        return NomeSobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setTelefone() {
        this.telefone = telefone;
    }

    public void setGenero() {
        this.genero = genero;
    }

    public void setEndereco() {
        this.endereco = endereco;
    }

    public void setNomeSobrenome(String NomeSobrenome) {
        this.NomeSobrenome = NomeSobrenome;
    }
}
