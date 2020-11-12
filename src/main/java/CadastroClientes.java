




import javax.swing.JTextField;

/*
 No que se diz respeito às vendas, a aplicação poderá cadastrar clientes, onde cada um tem como características nome, endereço, dívida  e um cupom. 
Como métodos se fazem Indispensáveis, além dos acessores e modificadores, uma função de verificação se o valor do cupom foi atingido.
Cada cupom só é válido em compras acima de 10 reais e caso o cliente atinja a marca de 10 cupons será beneficiado com uma compra de até 10 reais grátis,
cupons só são válidos em compras à vista. 
 */
public class CadastroClientes {
    private String nomeCliente;
    private String endereco;
    private double divida;
    private int cupom;
    
    public CadastroClientes() {
        this.divida = 0;
        this.cupom = 0;
    }

    public CadastroClientes(String nomeCliente, String endereco) {
        this.nomeCliente = nomeCliente;
        this.endereco = endereco;
        this.divida = 0;
        this.cupom = 0;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    

    public double getDivida() {
        return divida;
    }

    public void setDivida(double divida) {
        this.divida = divida;
    }

    public int getCupom() {
        return cupom;
    }

    public void setCupom(int cupom) {
        this.cupom = cupom;
    }
    
    public void verificarCupom(){
        if(cupom<10 && cupom>0){
            cupom=0;
            this.cupom=cupom;
        }
        else{
            this.cupom++;
        }
    }
    
}
