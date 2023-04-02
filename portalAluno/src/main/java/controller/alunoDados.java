/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *Classe : Aluno
 *Analista Responsável:  João Contini
 *Desenvolvedor: Joao Florisvaldo
 */
public class alunoDados {
    private int registroAcademico;
    private String disciplina;
    private String turno;
    private String situacaoAcademica;

    public alunoDados(int registroAcademico, String disciplina, String turno, String situacaoAcademica, int presenca, double nota, String emailAcademico) {
        this.registroAcademico = registroAcademico;
        this.disciplina = disciplina;
        this.turno = turno;
        this.situacaoAcademica = situacaoAcademica;
        this.presenca = presenca;
        this.nota = nota;
        this.emailAcademico = emailAcademico;
    }
    private int presenca;
    private double nota;
    private String emailAcademico;

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

    public String getSituacaoAcademica() {
        return situacaoAcademica;
    }

    public void setSituacaoAcademica(String situacaoAcademica) {
        this.situacaoAcademica = situacaoAcademica;
    }

    public int getPresenca() {
        return presenca;
    }

    public void setPresenca(int presenca) {
        this.presenca = presenca;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getEmailAcademico() {
        return emailAcademico;
    }

    public void setEmailAcademico(String emailAcademico) {
        this.emailAcademico = emailAcademico;
    }
    @Override
    public String toString() {
        return "RA: " + registroAcademico + ", Disciplina: " + disciplina + ", Turno: " + turno + ", Situacao Academica: " + situacaoAcademica + ", Quantidade de presenca: " + presenca + ", Nota: " + nota + ", email academico: " + emailAcademico;
    }
}
