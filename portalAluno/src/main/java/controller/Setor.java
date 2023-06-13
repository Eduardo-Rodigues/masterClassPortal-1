package controller;

/**
 *
 * @author Ferna
 */
public class Setor {

    private String nome;
    private boolean existe;

    public Setor(String nome, boolean existe) {
        this.nome = nome;
        this.existe = existe;
    }

    public String getNome() {
        return nome;
    }

    public boolean existeSetor() {
        return existe;
    }
}
