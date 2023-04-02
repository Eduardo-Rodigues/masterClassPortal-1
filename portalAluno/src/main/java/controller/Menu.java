package controller;
import java.util.*;
public class Menu {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("\n\n\n\nOlá, bem vindo ao MasterClass, seu aluno Online melhorado!!");
        System.out.println("Escolha uma das opções abaixo");
        System.out.println("1 - Cadastrar um Aluno");
        System.out.println("2 - Validacao de Setores");
        System.out.println("3 - Financeiro");
        System.out.println("4 - Tipo Funcao");
        System.out.println("5 - Setor");
        System.out.println("6 - Cadastrar um Financeiro");
        System.out.println("7 - Cadastrar uma Forma de pagamento");
        System.out.println("0 - Sair");
        
        System.out.println("Informe o valor desejado:");
        int valor = 0;
        valor = ler.nextInt();
        switch (valor) {
            case 1:
                aluno.main(args);
                break;
            case 2:
                Instituicao.validaSetores(args);
                break;
            case 3:
                tipoFuncao.cadastrarFuncao(args);
                break;
            case 4:
                cadastroPessoas.cadastro(args);
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
            case 0:
                System.out.println("Você escolheu sair, tchau tchau");
                break;
            default:
                System.out.println("Não há nenhuma opção com esse valor");
        }
    }
}
