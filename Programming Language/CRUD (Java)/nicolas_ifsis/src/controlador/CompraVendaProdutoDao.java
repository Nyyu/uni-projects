package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import modelo.CompraVendaProduto;

public class CompraVendaProdutoDao {
    
    public int inserir(CompraVendaProduto cvp) throws Exception{
        int retorno = 0;
        
        String sql = "insert into compravendaproduto (id_compravenda, id_produto,"
                + "quantidade, valorunitario)"
                + "values (?, ?, ?, ?)";
        
        Connection conexao = Conexao.getInstancia();
        try (PreparedStatement ps = conexao.prepareStatement(sql)){
            ps.setInt(1, cvp.getIdVendaProduto());
            ps.setInt(2, cvp.getIdProduto());
            ps.setDouble(3, cvp.getQuantidade());
            ps.setDouble(4, cvp.getValorUnitario());
            
            ps.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return retorno;
    }
}
