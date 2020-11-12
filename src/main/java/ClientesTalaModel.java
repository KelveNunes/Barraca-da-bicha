






import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ClientesTalaModel extends AbstractTableModel{
    private ArrayList<CadastroClientes> clientes = new ArrayList<>();
    private String[] colunas = {"NOME","ENDEREÇO","DÍVIDA","CUPOM"};
    
    public void addLinha(CadastroClientes cadastro){
        this.clientes.add(cadastro);
        this.fireTableDataChanged();
    }
    public void removerLinha(int linha){
        this.clientes.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }    
    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    
    @Override
    public int getRowCount() {
        return clientes.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna) {  
        case 0:
            return clientes.get(linha).getNomeCliente();
        
        case 1:
            return clientes.get(linha).getEndereco();
        
        case 2:
            return clientes.get(linha).getDivida();
            
        case 3: 
            return clientes.get(linha).getCupom();
        }
        return null;
    }
    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        switch(coluna) {  
        case 0:
            clientes.get(linha).setNomeCliente((String)valor);
            break;
        
        case 1:
            clientes.get(linha).setEndereco((String)valor);
            break;
        
        case 2:
            clientes.get(linha).setDivida(Double.parseDouble((String)valor));
            break;
            
        case 3: 
            clientes.get(linha).setCupom(Integer.parseInt((String)valor)); 
            break;
        }
        this.fireTableRowsUpdated(linha, linha);
    }
    
    

                
    
}
