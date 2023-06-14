/*
Classe : Financeiro
Analista Responsável:  Renan
Desenvolvedor: Bruno
 */
package controller;
import java.util.*;
public class Financeiro {
    
    private int numMensalidade;
    public double mensalidade;
    public int pagamento;
    private int notaFiscal;

    ArrayList mensalidades = new ArrayList();
    ArrayList cartoes = new ArrayList();
    ArrayList notasFiscais = new ArrayList();
    
    public static void financeiro(String[] args) {
        System.out.println("Em Desenvolvimento");
        Menu.main(args);
    }
    
    public void realizarPagamento(int pNumMensalidade){
        for (Object mensalidade : mensalidades) {
            System.out.println("Você pagou esta mensalidade");
        }
    }
    
    public void cadastrarCartaoCredito(int pNumCartaoCredito) {
        for (Object cartao : cartoes) {
            System.out.println("Informe o numero do cartão que deseja adicionar");
            cartoes.add(pNumCartaoCredito);
    
        }
    }
    
    public void gerarNotaFiscal(int pQtdNota){
        for (int i = 0; i < pQtdNota; i++) {
         double randomNumber = Math.random();    
        notasFiscais.add(randomNumber);
        }
        
    }
    
    public void emitirGerarNotaFiscal(int pNumNotaFiscal){
        notasFiscais.get(pNumNotaFiscal);
    }
    
    public void removerCartaoCredito(int pNumCartao) {
        cartoes.remove(pNumCartao);
  
    }
    
    public void setNotaFiscal(int notaFis){
        this.notaFiscal = notaFis;
    }
    
    public int getNotaFiscal(){
        return this.notaFiscal;
    }
    
    public void setMensalidade(double mensal){
        this.mensalidade = mensal;
    }
    
    public double getMensalidade() {
        return this.mensalidade;
    }
    
    public void setPagamento(int pag){
        this.pagamento = pag;
    }
    
    public int getPagamento() {
        return this.pagamento;
    }
    
    public void setNumMensalidade(int numMen){
        this.numMensalidade = numMen;
    }
    
    public int setNumMensalidade() {
        return this.numMensalidade;
    }
}
