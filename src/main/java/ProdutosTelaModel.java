






import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ProdutosTelaModel extends AbstractTableModel{
    private ArrayList<CadastroProdutos> produtos = new ArrayList<>();
    private String[] colunas = {"TIPO", "SABOR", "VALOR DO PRODUTO", "VALOR DE VENDA","QUANTIDADE EM ESTOQUE"};
    
    public void addLinha(CadastroProdutos cadastro){
        this.produtos.add(cadastro);
        this.fireTableDataChanged();
    }
    public void removerLinha(int linha){
        this.produtos.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    } 
    public ArrayList getProdutos(){
        return this.produtos;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    @Override
    public int getRowCount() {
        return produtos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0:
                return produtos.get(linha).getTipo();
            
            case 1:
                return produtos.get(linha).getSabor();
                
            case 2:
                return produtos.get(linha).getValorProduto();
                
            case 3:
                return produtos.get(linha).getValorVenda();
                
            case 4:
                return produtos.get(linha).getEstoque();
                
        }
        return null;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        switch(coluna){
            case 0:
                produtos.get(linha).setTipo((String)valor);
                break;
            case 1:
                produtos.get(linha).setSabor((String)valor);
                break;
            case 2:
                produtos.get(linha).setValorProduto(Double.parseDouble((String)valor));
                break;
            case 3:
                produtos.get(linha).setValorVenda(Double.parseDouble((String)valor));
                break;
            case 4:
                produtos.get(linha).setEstoque(Integer.parseInt((String)valor));
                break;
        }
        this.fireTableRowsUpdated(linha, linha);
    }
    
    
}
