/*
/*
 *Classe : Curso 
 *Analista Responsável:  Eduardo
 *Desenvolvedor: Renan
 */
package controller;

import java.util.ArrayList;
import java.util.Scanner;

public class Curso {

    private int cargaHoraria;
    private String disciplina;
    private String turnoCurso;
    private String campusAcademico;
    ArrayList<Cadastro> cadastro;

    public Curso() {
        cadastro = new ArrayList<Cadastro>();
    }

    public void cadastrarCurso() {
        String disci;
        String turno;
        String campus;
        int carga;
        boolean cadastrar = true;

        try {

            while (cadastrar) {
                System.out.println("Informe a disciplina do curso: ");
                Scanner lerDisci = new Scanner(System.in);
                disci = lerDisci.nextLine();

                System.out.println("Informe qual o turno do curso: ");
                Scanner lerTurno = new Scanner(System.in);
                turno = lerTurno.nextLine();

                System.out.println("Informe qual é o campus do curso: ");
                Scanner lerCampus = new Scanner(System.in);
                campus = lerCampus.nextLine();

                System.out.println("Informe a  carga horaria do curso: ");
                Scanner lerCarga = new Scanner(System.in);
                carga = lerCarga.nextInt();

                cadastro.add(new Cadastro(campus, disci, turno, carga));

                for (int i = 0; i < cadastro.size(); i++) {
                    Cadastro listaCurso = cadastro.get(i);
                    System.out.println("\n========= Curso cadastrado com Sucesso!===========");
                    System.out.println("Curso: " + listaCurso.getDisciplina() + " - " + listaCurso.getTurno() + " - " + listaCurso.getCampus() + " - " + listaCurso.getCargaHoraria());
                }

                System.out.println("\nDeseja cadastrar mais um Curso? (S/N)");
                Scanner lerScanner = new Scanner(System.in);
                String resposta = lerScanner.nextLine();

                if (resposta.equalsIgnoreCase("S")) {
                    cadastrar = true;
                } else {
                    cadastrar = false;
                }
            }

        } catch (Exception exception) {
            System.out.println("ERRO! Informe os dados corretamente");
            System.exit(1);
        }
    }

    public void removerCurso() {
        Scanner ler = new Scanner(System.in);

        if (this.cadastro.size() >= 0) {
            System.out.println("\n============== Cursos Cadastrados: ==============\n");
            for (Cadastro curso : cadastro) {
                System.out.println(curso.getDisciplina() + " - " + curso.getTurno());
            }
        } else {
            System.out.println("Nenhum curso Cadastrado");
            System.exit(1);
        }

        System.out.println("\nInforme qual curso você deseja remover: ");
        String curso = ler.nextLine();

        for (Cadastro cadastros : cadastro) {
            if (cadastros.getDisciplina().equals(curso)) {
                int i = cadastro.indexOf(cadastros);
                cadastro.remove(i);
                System.out.println("\nCurso Removido: " + cadastros.getDisciplina());
                return;
            } else {
                System.out.println("\nCurso não encontrado");
                System.exit(1);
            }
        }
    }

    public void editarCurso() {

        try {

            if (this.cadastro.size() >= 0) {
                System.out.println("\n============== Cursos Cadastrados: ==============\n");
                for (Cadastro curso : cadastro) {
                    System.out.println(curso.getDisciplina() + " - " + curso.getTurno());
                }

            } else {
                System.out.println("Nenhuma curso cadastrada");
                System.exit(1);
            }

            System.out.println("\nInforme qual curso que deseja editar: ");
            Scanner ler = new Scanner(System.in);
            String editar = ler.nextLine();

            for (Cadastro listaCurso : cadastro) {
                if (listaCurso.getDisciplina().equals(editar)) {
                    int i = cadastro.indexOf(listaCurso);
                    cadastro.remove(i);
                }
            }

            System.out.println("Informe as novas informações do curso: \n");

            System.out.println("Informe a disciplina do curso: ");
            Scanner lerTurmaEditado = new Scanner(System.in);
            String disciplinaEditadaCurso = lerTurmaEditado.nextLine();

            System.out.println("Informe o turno do curso: ");
            Scanner lerTurnoEditado = new Scanner(System.in);
            String turnoEditadoCurso = lerTurnoEditado.nextLine();

            System.out.println("Informe o campus: ");
            Scanner lerCampusEditado = new Scanner(System.in);
            String campusEditadoCurso = lerCampusEditado.nextLine();

            System.out.println("Informe qual a carga horária: ");
            Scanner cargaHorariaEditadaCurso = new Scanner(System.in);
            int cargaHorariaEditada = cargaHorariaEditadaCurso.nextInt();

            cadastro.add(new Cadastro(campusEditadoCurso, disciplinaEditadaCurso, turnoEditadoCurso, cargaHorariaEditada));

            System.out.println("========= Turma editada com Sucesso!===========");

        } catch (Exception exception) {
            System.out.println("ERRO! Informe os dados corretamente");
            System.exit(1);
        }
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

    private class Cadastro {

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
