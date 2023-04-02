package controller;
public class Instituicao {

    public int keyAluno;
    public boolean aluno;
    public boolean financeiro;
    public boolean curso;
    public boolean logradouro;
    public boolean biblioteca;
    public boolean juridico;
    public boolean emailInstituicao;
    
    
    
    public void validaSetores(String setor){
        switch (setor) {
            case "aluno":
                if (aluno == true) {
                    System.out.println("Esse setor existe dentro desta instituição");
                } else {
                    System.out.println("Esse setor não existe dentro desta instituição");
                }
                break;
            case "financeiro":
                if (financeiro == true) {
                    System.out.println("Esse setor existe dentro desta instituição");
                } else {
                    System.out.println("Esse setor não existe dentro desta instituição");
                }
                break;
            case "curso":
                if (curso == true) {
                    System.out.println("Esse setor existe dentro desta instituição");
                } else {
                    System.out.println("Esse setor não existe dentro desta instituição");
                }
                break;
            case "logradouro":
                if (logradouro == true) {
                    System.out.println("Esse setor existe dentro desta instituição");
                } else {
                    System.out.println("Esse setor não existe dentro desta instituição");
                }
                break;
            case "biblioteca":
                if (biblioteca == true) {
                    System.out.println("Esse setor existe dentro desta instituição");
                } else {
                    System.out.println("Esse setor não existe dentro desta instituição");
                }
                break;
            case "juridico":
                if (juridico == true) {
                    System.out.println("Esse setor existe dentro desta instituição");
                } else {
                    System.out.println("Esse setor não existe dentro desta instituição");
                }         
                break;
            default:
                System.out.println("O setor informado não existe no corpo acadêmico desta instituição");
        }
    
    }

    
}