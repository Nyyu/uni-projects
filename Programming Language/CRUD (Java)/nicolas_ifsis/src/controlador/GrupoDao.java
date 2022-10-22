package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Grupo;


public class GrupoDao {
    public int inserir(Grupo g) throws Exception{
        int retorno;
        PreparedStatement ps = null;
        Connection conexao = Conexao.getInstancia();
        
        String sql = "insert into usuariogrupo (nome)"
                + "values (?)";
        
        ps = conexao.prepareStatement(sql);
        ps.setString(1, g.getNome());
        
        retorno = ps.executeUpdate();
        ps.close();
        
        return retorno;
    }
    
    public int alterar(Grupo g) throws Exception {        
        int retorno;
        PreparedStatement ps = null;
        Connection conexao = Conexao.getInstancia();
        
        String sql = "update usuariogrupo"
                + "     set     nome = ?"
                + "     where   id = ?";
        
        ps = conexao.prepareStatement(sql);
        ps.setString(1, g.getNome());        
        ps.setInt(2, g.getId());
        
        retorno = ps.executeUpdate();
        ps.close();
        
        return retorno;
    }
    
    public int excluir(Grupo g) throws Exception {
        int retorno;
        PreparedStatement ps = null;
        Connection conexao = Conexao.getInstancia();
        
        String sql = "delete from usuariogrupo"
                + " where id = ?";
        
        ps = conexao.prepareStatement(sql);
        ps.setInt(1, g.getId());
        
        retorno = ps.executeUpdate();
        ps.close();
        
        return retorno;
    }
    
    public boolean existeGrupo (String nome) throws Exception{
        Connection conexao = Conexao.getInstancia();
        String sql = "select * from usuariogrupo where nome = ?";
        
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, nome);
            
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (Exception e) {
            throw new Exception("Erro");
        }
    }
    
    public Grupo buscarGrupo (int id) throws Exception{
        Connection conexao = Conexao.getInstancia();
        String sql = "select * from usuariogrupo where id = ?";
        
        Grupo g = null;
        
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                g = new Grupo();
                g.setId(id);
                g.setNome(rs.getString("nome"));
            }
        } catch (Exception e) {
            throw e;
        }
        
        return g;
    }
    
    public List<Grupo> buscar(String nome) throws Exception{
        Connection conexao = Conexao.getInstancia();
        String sql = "select * from usuariogrupo where nome like ?";
        
        List<Grupo> grupos = new ArrayList<>();
        
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, "%" + nome + "%");
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                Grupo g = new Grupo(rs.getInt("id"), rs.getString("nome"));                
                grupos.add(g);
            }
        } catch (Exception e) {
            throw e;
        }
        
        return grupos;
    }
}
