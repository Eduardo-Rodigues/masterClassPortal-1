/*
/*
 *Classe : Curso 
 *Analista Responsável:  Eduardo
 *Desenvolvedor: Renan
 */

package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Curso {

    private List<Cadastro> cadastro;

    public Curso() {
        cadastro = new ArrayList<>();
    }

    public void cadastrarCurso() {
        Scanner scanner = new Scanner(System.in);

        boolean cadastrar = true;

        while (cadastrar) {
            System.out.println("Informe a disciplina do curso: ");
            String disci = scanner.nextLine();

            System.out.println("Informe qual o turno do curso: ");
            String turno = scanner.nextLine();

            System.out.println("Informe qual é o campus do curso: ");
            String campus = scanner.nextLine();

            System.out.println("Informe a carga horaria do curso: ");
            int carga = scanner.nextInt();
            scanner.nextLine();

            cadastro.add(new Cadastro(campus, disci, turno, carga));

            for (Cadastro curso : cadastro) {
                System.out.println("\n========= Curso cadastrado com Sucesso!===========");
                System.out.println("Curso: " + curso.getDisciplina() + " - " + curso.getTurno() + " - " + curso.getCampus() + " - " + curso.getCargaHoraria());
            }

            System.out.println("\nDeseja cadastrar mais um Curso? (S/N)");
            String resposta = scanner.nextLine();

            if (!resposta.equalsIgnoreCase("S")) {
                cadastrar = false;
            }
        }
    }

    public void removerCurso() {
        Scanner scanner = new Scanner(System.in);

        if (!cadastro.isEmpty()) {
            System.out.println("\n============== Cursos Cadastrados: ==============\n");
            for (Cadastro curso : cadastro) {
                System.out.println(curso.getDisciplina() + " - " + curso.getTurno());
            }
        } else {
            System.out.println("Nenhum curso cadastrado");
            return;
        }

        System.out.println("\nInforme qual curso você deseja remover: ");
        String curso = scanner.nextLine();

        for (Cadastro cadastros : cadastro) {
            if (cadastros.getDisciplina().equals(curso)) {
                cadastro.remove(cadastros);
                System.out.println("\nCurso Removido: " + cadastros.getDisciplina());
                return;
            }
        }

        System.out.println("\nCurso não encontrado");
    }

    public void editarCurso() {
        Scanner scanner = new Scanner(System.in);

        if (!cadastro.isEmpty()) {
            System.out.println("\n============== Cursos Cadastrados: ==============\n");
            for (Cadastro curso : cadastro) {
                System.out.println(curso.getDisciplina() + " - " + curso.getTurno());
            }
        } else {
            System.out.println("Nenhuma curso cadastrada");
            return;
        }

        System.out.println("\nInforme qual curso deseja editar: ");
        String editar = scanner.nextLine();

        for (Cadastro listaCurso : cadastro) {
            if (listaCurso.getDisciplina().equals(editar)) {
                cadastro.remove(listaCurso);
                break;
            }
        }

        System.out.println("Informe as novas informações do curso: \n");

        System.out.println("Informe a disciplina do curso: ");
        String disciplinaEditadaCurso = scanner.nextLine();

        System.out.println("Informe o turno do curso: ");
        String turnoEditadoCurso = scanner.nextLine();

        System.out.println("Informe o campus: ");
        String campusEditadoCurso = scanner.nextLine();

        System.out.println("Informe qual a carga horária: ");
        int cargaHorariaEditada = scanner.nextInt();
        scanner.nextLine();

        cadastro.add(new Cadastro(campusEditadoCurso, disciplinaEditadaCurso, turnoEditadoCurso, cargaHorariaEditada));

        System.out.println("========= Curso editado com Sucesso!===========");
    }

    private static class Cadastro {

        private String campus;
        private String disciplina;
        private String turno;
        private int cargaHoraria;

        public Cadastro(String campus, String disciplina, String turno, int cargaHoraria) {
            this.campus = campus;
            this.disciplina = disciplina;
            this.turno = turno;
            this.cargaHoraria = cargaHoraria;
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
            return cargaHoraria;
        }

        public void setCargaHoraria(int cargaHoraria) {
            this.cargaHoraria = cargaHoraria;
        }

    }
}
