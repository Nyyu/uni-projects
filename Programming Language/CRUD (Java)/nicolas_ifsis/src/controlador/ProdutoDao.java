package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Produto;


public class ProdutoDao {
    public int inserir(Produto p) throws Exception{
        int retorno;
        PreparedStatement ps = null;
        Connection conexao = Conexao.getInstancia();
        
        String sql = "insert into produto (nome, unidadeDeMedida)"
                + "values (?, ?)";
        
        ps = conexao.prepareStatement(sql);
        ps.setString(1, p.getNome());
        ps.setString(2, p.getUnidadeDeMedida());
        
        retorno = ps.executeUpdate();
        ps.close();
        
        return retorno;
    }
    
    public int alterar(Produto p) throws Exception {        
        int retorno;
        PreparedStatement ps = null;
        Connection conexao = Conexao.getInstancia();
        
        String sql = "update produto"
                + "     set     nome = ?,"
                + "             unidadeDeMedida = ?"
                + "     where   id = ?";
        
        ps = conexao.prepareStatement(sql);
        ps.setString(1, p.getNome());
        ps.setString(2, p.getUnidadeDeMedida());
        ps.setInt(3, p.getId());
        
        retorno = ps.executeUpdate();
        ps.close();
        
        return retorno;
    }
    
    public int excluir(Produto p) throws Exception {
        int retorno;
        PreparedStatement ps = null;
        Connection conexao = Conexao.getInstancia();
        
        String sql = "delete from produto "
                + "where id = ?";
        
        ps = conexao.prepareStatement(sql);
        ps.setInt(1, p.getId());
        
        retorno = ps.executeUpdate();
        ps.close();
        
        return retorno;
    }
    
    public boolean existeProduto (String nome) throws Exception{
        Connection conexao = Conexao.getInstancia();
        String sql = "select * from produto where nome = ?";
        
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, nome);
            
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (Exception e) {
            throw new Exception("Erro ao verificar o login do cliente");
        }
    }
    
    public Produto buscarProduto (int id) throws Exception{
        Connection conexao = Conexao.getInstancia();
        String sql = "select * from produto where id = ?";
        
        Produto p = null;
        
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                p = new Produto();
                p.setId(id);
                p.setNome(rs.getString("nome"));
                p.setUnidadeDeMedida(rs.getString("unidadeDeMedida"));
            }
        } catch (Exception e) {
            throw e;
        }
        
        return p;
    }
    
    public List<Produto> buscar(String nome) throws Exception{
        Connection conexao = Conexao.getInstancia();
        String sql = "select * from produto where nome like ?";
        
        List<Produto> produtos = new ArrayList<>();
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, "%" + nome + "%");
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {  
                Produto u = new Produto(rs.getInt("id"),
                                        rs.getString("nome"),
                                        rs.getString("unidadeDeMedida"));
                
                produtos.add(u);
            }
        } catch (Exception e) {
            throw e;
        }
        
        return produtos;
    }
}
