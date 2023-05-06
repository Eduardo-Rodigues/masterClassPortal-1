/*
 * Classe : TipoFuncao
 * Analista Responsável:  Joao Florisvaldo
 * Desenvolvedor: Eduardo
 */
package controller;

/**
 *
 * @author eduro
 */
public class Funcao {
    private String nomeFuncao;
    private String descricaoFuncao;

    public funcao(String nome, String descricao) {
        this.nomeFuncao = nome;
        this.descricaoFuncao = descricao;
    }
    public String getnomeFuncao(){
        return nomeFuncao;
    }
    public String getdescricaoFuncao(){
        return descricaoFuncao;
    }
}
