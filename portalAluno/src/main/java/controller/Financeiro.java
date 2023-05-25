/*
Classe : Financeiro
Analista Responsável:  Renan
Desenvolvedor: Bruno
 */
package controller;

public class Financeiro {

    private int numMensalidade;
    public double mensalidade;
    public int pagamento;
    private int notaFiscal;

    public static void financeiro(String[] args) {
        System.out.println("Em Desenvolvimento");
        Menu.main(args);
    }

    public void realizarPagamento() {

    }

    public void cadastrarCartaoCredito() {

    }

    private void gerarNotaFiscal() {

    }

    public void emitirGerarNotaFiscal() {

    }

    public void exibirBoleto() {

    }

    public void salvarPagamento() {

    }

    public void removerCartaoCredito() {

    }

    private void gerarQrCode() {

    }

    public void exibirQrCode() {

    }

    public void removerPagamento() {

    }

    public void setNotaFiscal(int notaFis) {
        this.notaFiscal = notaFis;
    }

    public int getNotaFiscal() {
        return this.notaFiscal;
    }

    public void setMensalidade(double mensal) {
        this.mensalidade = mensal;
    }

    public double getMensalidade() {
        return this.mensalidade;
    }

    public void setPagamento(int pag) {
        this.pagamento = pag;
    }

    public int getPagamento() {
        return this.pagamento;
    }

    public void setNumMensalidade(int numMen) {
        this.numMensalidade = numMen;
    }

    public int setNumMensalidade() {
        return this.numMensalidade;
    }
}
