/*
 *Classe : Curso 
 *Analista Responsável:  Eduardo
 *Desenvolvedor: Renan
*/

package controller;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @analista Eduardo
 * @desenvolvedor renan
 *
 */
public class Curso {
        private int cargaHoraria;
        private String disciplina;
        private String turnoCurso;
        private String campusAcademico;
        ArrayList<Cadastro> cadastro;
        
        public Curso(){
            cadastro = new ArrayList<Cadastro>();
        }
        
        public void cadastrarCurso(){
            String disci;
            String turno;
            String campus;
            int carga;
            
            try {
            Scanner ler = new Scanner(System.in);
            
            System.out.println("Informe a disciplina do curso: ");
            disci = ler.next();
            
            System.out.println("Informe qual o turno do curso: ");
            turno = ler.next();
            
            System.out.println("Informe qual é o campus do curso: ");
            campus = ler.next();
            
            System.out.println("Informe a  carga horaria do curso: ");
            carga = ler.nextInt();
            
            cadastro.add(new Cadastro(disci, turno, campus, carga));
            
            for(Cadastro car : cadastro){
                System.out.println("========= Curso salvo com Sucesso!===========");
                System.out.println("Curso: " + car.getDisciplina()+ "," + car.getTurno()+ "," + car.getCampus() + ","+ car.getCargaHoraria());
            }
            
            } catch (Exception exception) {
                System.out.println("ERRO! Informe os dados corretamente");
                System.exit(0);
            }
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
           
    private class Cadastro{
        private String campus;
        private String disciplina;
        private String turno;
        private int CargaHoraria;

    public Cadastro(String campus, String disciplina, String turno, int CargaHoraria) {
        this.campus = campus;
        this.disciplina = disciplina;
        this.turno = turno;
        this.CargaHoraria = CargaHoraria;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
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

    public int getCargaHoraria() {
        return CargaHoraria;
    }

    public void setCargaHoraria(int CargaHoraria) {
        this.CargaHoraria = CargaHoraria;
    }
        
      
    }
    
}
