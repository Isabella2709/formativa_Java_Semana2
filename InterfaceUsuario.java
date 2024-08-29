public class Financiamento {


    double valormovel;
    int prazoFinanciamento;
    double taxaJurosAnual;


    Financiamento(double valormovel, int prazoFinanciamento, double taxaJurosAnual) {
        this.valormovel = valormovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    double CalcularpagamentoMensal() {
        return(this.valormovel /(this.prazoFinanciamento * 12)) * (1 + (this.taxaJurosAnual/ 12) );


    }

    double calcularTotalPagamento(){
        return this.CalcularpagamentoMensal() * this.prazoFinanciamento * 12;
    }






}
