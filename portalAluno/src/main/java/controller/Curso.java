/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.curso;

import java.util.ArrayList;

/**
 *
 * @author eduro
 */
public class Curso {
    
        private int cargaHoraria;
        private String disciplina;
        private String turnoCurso;
        private String campusAcademico;


        public ArrayList<Object> cadastrarCurso(String disci, String turno, String campus, int carga){
            ArrayList<Object> cadastro = new ArrayList<>();

            this.disciplina = disci;
            this.turnoCurso = turno;
            this.campusAcademico = campus;
            this.cargaHoraria = carga;

            cadastro.add(disci);
            cadastro.add(turno);
            cadastro.add(campus);
            cadastro.add(disci);

            return cadastro;
        }

        public void removerCurso(){

        }
        public void cadastrarCargaHoraria(){

        }
        public void cadastrarTurno(){

        }
        public void cadastrarTurma(){

        }
        public void editarTurno(){

        }
        public void editarTurma(){

        }
        public void editarCargaHoraria(){

        }

        public int getCargaHoraria() {
            return cargaHoraria;
        }

        public void setCargaHoraria(int cargaHoraria) {
            this.cargaHoraria = cargaHoraria;
        }

        public String getDisciplina() {
            return disciplina;
        }

        public void setDisciplina(String disciplina) {
            this.disciplina = disciplina;
        }

        public String getTurnoCurso() {
            return turnoCurso;
        }

        public void setTurnoCurso(String turnoCurso) {
            this.turnoCurso = turnoCurso;
        }

        public String getCampusAcademico() {
            return campusAcademico;
        }

        public void setCampusAcademico(String campusAcademico) {
                this.campusAcademico = campusAcademico;
        }
 }

