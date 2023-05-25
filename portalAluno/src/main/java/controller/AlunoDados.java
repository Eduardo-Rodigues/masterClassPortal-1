package controller;

/**
 * Classe : Aluno Analista Responsável: João Contini Desenvolvedor: Joao
 * Florisvaldo Desenvolvedor Atual: Roney Junior Prates
 */
public class AlunoDados {

    private int registroAcademico;
    private String disciplina;
    private String turno;
    private String emailAcademico;
    private String nome;
    private String periodo;
    private String genero;
    private boolean pcd;
    private String cpf;
    private String telefone;
    private String endereco;

    public AlunoDados(int registroAcademico, String disciplina, String turno, String emailAcademico, String nome, String periodo, String genero, boolean pcd, String cpf, String telefone, String endereco) {
        this.registroAcademico = registroAcademico;
        this.disciplina = disciplina;
        this.turno = turno;
        this.emailAcademico = emailAcademico;
        this.nome = nome;
        this.periodo = periodo;
        this.genero = genero;
        this.pcd = pcd;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public int getRegistroAcademico() {
        return registroAcademico;
    }

    public void setRegistroAcademico(int registroAcademico) {
        this.registroAcademico = registroAcademico;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getEmailAcademico() {
        return emailAcademico;
    }

    public void setEmailAcademico(String emailAcademico) {
        this.emailAcademico = emailAcademico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isPcd() {
        return pcd;
    }

    public void setPcd(boolean pcd) {
        this.pcd = pcd;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "RA: " + registroAcademico
                + ", Disciplina: " + disciplina
                + ", Turno: " + turno
                + ", Endereço: " + endereco
                + ", Nome: " + nome
                + ", CPF: " + cpf
                + ", Genero: " + genero
                + ", PCD: " + pcd
                + ", Periodo: " + periodo
                + ", Telefone: " + telefone
                + ", email academico: " + emailAcademico;
    }
}
