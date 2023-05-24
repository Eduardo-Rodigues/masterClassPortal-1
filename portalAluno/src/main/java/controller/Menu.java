package controller;

import java.util.*;

public class Menu {

    public static void main(String[] args) {
        Scanner lerOpcao = new Scanner(System.in);

        System.out.println("\n\nOlá, bem vindo ao MasterClass, seu aluno Online melhorado!!"
                + "\nEscolha uma das opções abaixo:"
                + "\n1 - Cadastrar um Aluno"
                + "\n2 - Validacao de Setores"
                + "\n3 - Financeiro"
                + "\n4 - Tipo Funcao"
                + "\n5 - Setor"
                + "\n6 - Cadastrar um Financeiro"
                + "\n7 - Cadastrar uma Forma de pagamento"
                + "\n8 - Cadastrar um Funcionário"
                + "\n0 - Sair");

        int escolherOpcao = 1;
        while (escolherOpcao != 0) {
            try {
                System.out.print("Informe o valor desejado: ");
                escolherOpcao = Integer.parseInt(lerOpcao.nextLine());
                switch (escolherOpcao) {
                    case 1:
                        Aluno aluno = new Aluno();
                        aluno.dadosAlunos();
                        break;
                    case 2:
                        Instituicao.validaSetores(args);
                        break;
                    case 3:
                        TipoFuncao tipoFuncao = new TipoFuncao();
                        tipoFuncao.cadastrarFuncao();
                        break;
                    case 4:
                        CadastroPessoas.cadastro(args);
                        break;
                    case 5:
                        System.out.println("Parabéns você escolheu cadastrar um Setor!");
                        break;
                    case 6:
                        System.out.println("Parabéns você escolheu cadastrar um Financeiro!");
                        break;
                    case 7:
                        System.out.println("Parabéns você escolheu cadastrar uma Forma de pagamento!");
                        break;
                    case 8:
                        Funcionario funcionario = new Funcionario();
                        funcionario.dadosFuncionario();
                        break;
                    case 0:
                        System.out.println("Você escolheu sair, tchau tchau");
                        break;
                    default:
                        System.out.println("Não há nenhuma opção com esse valor\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("Você deve digitar um número\n");
            }
        } 
    }
}
