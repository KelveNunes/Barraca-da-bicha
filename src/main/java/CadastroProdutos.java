



/*
 *O programa fará cadastros de todos os produtos do negócio num estoque, 
cada produto deve ter como informações seu tipo, nome, sabor, valor do produto, 
valor de venda e quantidade em estoque. Como métodos são necessários os acessores e modificadores.
 */
public class CadastroProdutos {
    private String tipo;
    private String sabor;
    private double valorProduto;
    private double valorVenda;
    private int estoque;
    
    public CadastroProdutos(){}

    public CadastroProdutos(String tipo, double valorProduto) {
        this.tipo = tipo;
        this.valorProduto = valorProduto;
    }
    
    

    public CadastroProdutos(String tipo, String sabor, double valorProduto, double valorVenda, int estoque) {
        this.tipo = tipo;
        this.sabor = sabor;
        this.valorProduto = valorProduto;
        this.valorVenda = valorVenda;
        this.estoque = estoque;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    
    
    
}
