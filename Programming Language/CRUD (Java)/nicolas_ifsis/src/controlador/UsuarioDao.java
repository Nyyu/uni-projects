package controlador;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import modelo.Usuario;

public class UsuarioDao {
    
    public int inserir(Usuario u) throws Exception{
        int retorno;
        PreparedStatement ps = null;
        Connection conexao = Conexao.getInstancia();
        
        String sql = "insert into usuario (nome, email, senha)"
                + "values (?, ?, ?)";
        
        ps = conexao.prepareStatement(sql);
        ps.setString(1, u.getNome());
        ps.setString(2, u.getEmail());
        ps.setString(3, u.getSenha());
        
        retorno = ps.executeUpdate();
        ps.close();
        
        return retorno;
    }
    
    public int alterar(Usuario u) throws Exception {        
        int retorno;
        PreparedStatement ps = null;
        Connection conexao = Conexao.getInstancia();
        
        String sql = "update usuario"
                + "     set     nome = ?,"
                + "             email = ?"
                + "     where   id = ?";
        
        ps = conexao.prepareStatement(sql);
        ps.setString(1, u.getNome());
        ps.setString(2, u.getEmail());        
        ps.setInt(3, u.getId());
        
        retorno = ps.executeUpdate();
        ps.close();
        
        return retorno;
    }
    
    public int excluir(Usuario u) throws Exception {
        int retorno;
        PreparedStatement ps = null;
        Connection conexao = Conexao.getInstancia();
        
        String sql = "delete from usuario "
                + "where id = ?";
        
        ps = conexao.prepareStatement(sql);
        ps.setInt(1, u.getId());
        
        retorno = ps.executeUpdate();
        ps.close();
        
        return retorno;
    }
    
    public boolean existeUsuario (String email, String senha) throws Exception{
        Connection conexao = Conexao.getInstancia();
        String sql = "select * from usuario where email = ? and senha = ?";
        
        // try with resources
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, email);
            ps.setString(2, senha);
            
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (Exception e) {
            throw new Exception("Erro ao verificar o login do usuário");
        }

//        PreparedStatement ps = null;        
//        try {
//            ps = conexao.prepareStatement(sql);
//            ps.setString(1, email);
//            String senhaStr = senha.toString(); // Conversão de char para String
//            ps.setString(2, senhaStr);
//            
//            // Método 'executeQuery' serve para consultas
//            ResultSet rs = ps.executeQuery();
//            return rs.next();
//            
//        } catch (Exception e) {
//            throw new Exception("Erro ao verificar o login do usuário");
//        } finally {
//            ps.close();
//        }
    }
    
    public Usuario buscarUsuario (int id) throws Exception{
        Connection conexao = Conexao.getInstancia();
        String sql = "select * from usuario where id = ?";
        
        Usuario u = null;
        
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                u = new Usuario();
                u.setId(id);
                u.setNome(rs.getString("nome"));
                u.setEmail(rs.getString("email"));
            }
        } catch (Exception e) {
            throw e;
        }
        
        return u;
    }
    
    public List<Usuario> buscar(String nome) throws Exception{
        Connection conexao = Conexao.getInstancia();
        String sql = "select * from usuario where nome like ?";
        
        List<Usuario> usuarios = new ArrayList<>();
        
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, "%" + nome + "%");
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                Usuario u = new Usuario(rs.getInt("id"), rs.getString("nome"), rs.getString("email"));
                
                usuarios.add(u);
            }
        } catch (Exception e) {
            throw e;
        }
        
        return usuarios;
    }
}
