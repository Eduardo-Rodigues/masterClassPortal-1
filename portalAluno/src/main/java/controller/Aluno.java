package controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Aluno extends Pessoa {

    private String periodo;

    public void dadosAlunos() {
        ArrayList<AlunoDados> alunos = new ArrayList();
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o nome do aluno: (ex: Antonio das Neves)");
        String setNome = ler.nextLine();

        System.out.println("Informe o CPF do aluno: (ex: 11111111111)");
        String setCpf = ler.nextLine();

        System.out.println("Informe o RA do aluno: (ex: 00241717)");
        int setRA = ler.nextInt();

        System.out.println("Informe qual a disciplina: (ex: historia)");
        String setDisciplina = ler.next();

        System.out.println("Informe qual é o turno das aulas: (ex: matutino)");
        String setTurno = ler.next();

        System.out.println("Informe o email do aluno: (ex: fulano@unipar.com)");
        String setEmailAcademico = ler.next();

        System.out.println("Informe o telefone do aluno: (ex: 45999999999)");
        String setTelefone = ler.next();

        System.out.println("Informe o endereco do aluno: (ex: Rua Presidente, 59)");
        String setEndereco = ler.next();

        System.out.println("Informe o gênero do aluno: (ex: feminino)");
        String setGenero = ler.next();

        System.out.println("Informe se o aluno é PCD: (sim/não)");
        boolean setPcd = ler.nextBoolean();

        System.out.println("Informe o periodo do aluno: (ex: 1º ano)");
        String setPeriodo = ler.next();

        /*int registroAcademico, String disciplina, String turno, String situacaoAcademica, int presenca, double nota, String emailAcademico*/
        AlunoDados alunodados = new AlunoDados(setRA, setDisciplina, setTurno, setEmailAcademico, setNome, setPeriodo, setGenero, setPcd, setCpf, setTelefone, setEndereco);
        alunos.add(alunodados);

        for (AlunoDados dados : alunos) {
            System.out.println(dados);
        }

        this.adicionar(setNome, setCpf, setRA, setEmailAcademico, setTelefone, setPcd, setGenero, setEndereco, setPeriodo);
    }

    @Override
    public void excluir(String NomeSobrenome, String CPF, int registroGeral, String tipoFuncao, Date dataNasc, Date dataRegistro, String email, String telefone, boolean pcd, String genero, String endereco) {
        super.excluir(NomeSobrenome, CPF, registroGeral, tipoFuncao, dataNasc, dataRegistro, email, telefone, pcd, genero, endereco);
    }

    @Override
    public void editar(String NomeSobrenome, String CPF, int registroGeral, String tipoFuncao, Date dataNasc, Date dataRegistro, String email, String telefone, boolean pcd, String genero, String endereco) {
        editar(NomeSobrenome, CPF, registroGeral, tipoFuncao, dataNasc, dataRegistro, email, telefone, pcd, genero, endereco);
        super.editar(NomeSobrenome, CPF, registroGeral, tipoFuncao, dataNasc, dataRegistro, email, telefone, pcd, genero, endereco);
    }

    public void adicionar(String NomeSobrenome, String CPF, int registroGeral, String email, String telefone, boolean pcd, String genero, String endereco, String periodo) {
        this.NomeSobrenome = NomeSobrenome;
        this.CPF = CPF;
        this.registroGeral = registroGeral;
        this.email = email;
        this.telefone = telefone;
        this.pcd = pcd;
        this.genero = genero;
        this.endereco = endereco;
        this.periodo = periodo;
    }

}
