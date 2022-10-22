package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Categoria;

public class CategoriaDao {
    
    public int inserir(Categoria c) throws Exception{
        int retorno;
        PreparedStatement ps = null;
        Connection conexao = Conexao.getInstancia();
        
        String sql = "insert into produtocategoria (nome)"
                + "values (?)";
        
        ps = conexao.prepareStatement(sql);
        ps.setString(1, c.getNome());
        
        retorno = ps.executeUpdate();
        ps.close();
        
        return retorno;
    }
    
    public int alterar(Categoria c) throws Exception {        
        int retorno;
        PreparedStatement ps = null;
        Connection conexao = Conexao.getInstancia();
        
        String sql = "update produtocategoria"
                + "     set     nome = ?"
                + "     where   id = ?";
        
        ps = conexao.prepareStatement(sql);
        ps.setString(1, c.getNome());        
        ps.setInt(2, c.getId());
        
        retorno = ps.executeUpdate();
        ps.close();
        
        return retorno;
    }
    
    public int excluir(Categoria c) throws Exception {
        int retorno;
        PreparedStatement ps = null;
        Connection conexao = Conexao.getInstancia();
        
        String sql = "delete from produtocategoria "
                + "where id = ?";
        
        ps = conexao.prepareStatement(sql);
        ps.setInt(1, c.getId());
        
        retorno = ps.executeUpdate();
        ps.close();
        
        return retorno;
    }
    
    public boolean existeCategoria (String nome) throws Exception{
        Connection conexao = Conexao.getInstancia();
        String sql = "select * from produtocategoria where nome = ?";
        
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, nome);
            
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (Exception e) {
            throw new Exception("Erro ao verificar o login do usuário");
        }

    }
    
    public Categoria buscarCategoria (int id) throws Exception{
        Connection conexao = Conexao.getInstancia();
        String sql = "select * from produtocategoria where id = ?";
        
        Categoria c = null;
        
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                c = new Categoria();
                c.setId(id);
                c.setNome(rs.getString("nome"));
            }
        } catch (Exception e) {
            throw e;
        }
        
        return c;
    }
    
    public List<Categoria> buscar(String nome) throws Exception{
        Connection conexao = Conexao.getInstancia();
        String sql = "select * from produtocategoria where nome like ?";
        
        List<Categoria> categorias = new ArrayList<>();
        
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, "%" + nome + "%");
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                Categoria c = new Categoria(rs.getInt("id"), rs.getString("nome"));                
                categorias.add(c);
            }
        } catch (Exception e) {
            throw e;
        }
        
        return categorias;
    }
}
