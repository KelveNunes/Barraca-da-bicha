




import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class CarrinhoTelaModel extends AbstractTableModel {
    private ArrayList<CadastroProdutos> carrinho = new ArrayList<>();
    private String[] colunas ={"TIPO","PREÇO"};
    
    public void addLinha(CadastroProdutos cadastro){
        this.carrinho.add(cadastro);
        this.fireTableDataChanged();
    }
    public void removerLinha(int linha){
        this.carrinho.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    } 
    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    @Override
    public int getRowCount() {
        return carrinho.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }


 @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0:
                return carrinho.get(linha).getTipo();
            
            case 1:
                return carrinho.get(linha).getValorVenda();
                

        }
        return null;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        switch(coluna){
            case 0:
                carrinho.get(linha).setTipo((String)valor);
                break;
            case 1:
                carrinho.get(linha).setValorVenda(Double.parseDouble((String)valor));
                break;

        }
        this.fireTableRowsUpdated(linha, linha);
    }    
    
}
