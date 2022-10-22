package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import modelo.CompraVenda;
import modelo.CompraVendaProduto;


public class CompraVendaDao {
    
    public int inserir(CompraVenda cv) throws Exception{
        int retorno = 0;
        
        String sql = "insert into compravenda (operacao, id_cliente,"
                + "formapagamento, desconto)"
                + "values (?, ?, ?, ?)";
        
        Connection conexao = Conexao.getInstancia();
        try (PreparedStatement ps = conexao.prepareStatement(sql, 
                Statement.RETURN_GENERATED_KEYS)){
            ps.setString(1, cv.getOperacao());
            ps.setInt(2, cv.getCliente_id());
            ps.setInt(3, cv.getFormaPagamento());
            ps.setDouble(4, cv.getDesconto());
            
            ps.executeUpdate();
            
            int idCompraVenda = 0;       
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                idCompraVenda = rs.getInt(1);
            }
            
            for (CompraVendaProduto p : cv.getProdutos()) {
                p.setIdVendaProduto(idCompraVenda);
                CompraVendaProdutoDao dao = new CompraVendaProdutoDao();
                dao.inserir(p);
            }
            
            
        } catch (Exception e) {
        }
        
        
        return retorno;
    }
}
