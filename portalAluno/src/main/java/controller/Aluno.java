
package controller;

import java.util.ArrayList;
import java.util.Scanner;

public class aluno {
    
    public static void main(String[] args) {
        ArrayList<alunoDados> alunos = new ArrayList();
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o RA do aluno: (ex: 00241717)");
        int setRA = ler.nextInt();

        System.out.println("Informe qual a disciplina: (ex: historia)");
        String setDisciplina = ler.next();

        System.out.println("Informe qual é o turno das aulas: (ex: matutino)");
        String setTurno = ler.next();

        System.out.println("Informe a situacao academica: (ex: matriculado)");
        String setSA = ler.next();
        
        System.out.println("Informe a quantidade de presenca: (ex: 160)");
        int setPresenca = ler.nextInt();
        
        System.out.println("Informe a Nota: (ex: 3)");
        double setNota = ler.nextInt();

        System.out.println("Informe o email do aluno: (ex: fulano@unipar.com)");
        String setEA = ler.next();
        
        /*int registroAcademico, String disciplina, String turno, String situacaoAcademica, int presenca, double nota, String emailAcademico*/
        alunoDados alunodados = new alunoDados(setRA, setDisciplina, setTurno, setSA, setPresenca, setNota, setEA);
        alunos.add(alunodados);
        
        for (alunoDados dados : alunos) {
            System.out.println(dados);
        }
        Menu.main(args);
    }
    


}
