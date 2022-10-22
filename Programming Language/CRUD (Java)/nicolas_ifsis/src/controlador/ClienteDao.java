
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;

public class ClienteDao {
    public int inserir(Cliente c) throws Exception{
        int retorno;
        PreparedStatement ps = null;
        Connection conexao = Conexao.getInstancia();
        
        String sql = "insert into cliente (nome, cpfcnpj, telefone, observacao)"
                + "values (?, ?, ?, ?)";
        
        ps = conexao.prepareStatement(sql);
        ps.setString(1, c.getNome());
        ps.setString(2, c.getCpfcnpj());
        ps.setString(3, c.getTelefone());
        ps.setString(4, c.getObservacao());
        
        retorno = ps.executeUpdate();
        ps.close();
        
        return retorno;
    }
    
    public int alterar(Cliente c) throws Exception {        
        int retorno;
        PreparedStatement ps = null;
        Connection conexao = Conexao.getInstancia();
        
        String sql = "update cliente"
                + "     set     nome = ?,"
                + "             cpfcnpj = ?,"
                + "             telefone = ?,"
                + "             observacao = ?"
                + "     where   id = ?";
        
        ps = conexao.prepareStatement(sql);
        ps.setString(1, c.getNome());
        ps.setString(2, c.getCpfcnpj()); 
        ps.setString(3, c.getTelefone());
        ps.setString(4, c.getObservacao());
        ps.setInt(5, c.getId());
        
        retorno = ps.executeUpdate();
        ps.close();
        
        return retorno;
    }
    
    public int excluir(Cliente c) throws Exception {
        int retorno;
        PreparedStatement ps = null;
        Connection conexao = Conexao.getInstancia();
        
        String sql = "delete from cliente "
                + "where id = ?";
        
        ps = conexao.prepareStatement(sql);
        ps.setInt(1, c.getId());
        
        retorno = ps.executeUpdate();
        ps.close();
        
        return retorno;
    }
    
    public boolean existeCliente (String nome, String cpfcnpj) throws Exception{
        Connection conexao = Conexao.getInstancia();
        String sql = "select * from cliente where nome = ? and cpfcnpj = ?";
        
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, nome);
            ps.setString(2, cpfcnpj);
            
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (Exception e) {
            throw new Exception("Erro ao verificar o login do cliente");
        }
    }
    
    public Cliente buscarCliente (int id) throws Exception{
        Connection conexao = Conexao.getInstancia();
        String sql = "select * from cliente where id = ?";
        
        Cliente c = null;
        
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                c = new Cliente();
                c.setId(id);
                c.setNome(rs.getString("nome"));
                c.setCpfcnpj(rs.getString("cpfcnpj"));
                c.setTelefone(rs.getString("telefone"));
                c.setObservacao(rs.getString("observacao"));
            }
        } catch (Exception e) {
            throw e;
        }
        
        return c;
    }
    
    public List<Cliente> buscar(String nome) throws Exception{
        Connection conexao = Conexao.getInstancia();
        String sql = "select * from cliente where nome like ?";
        
        List<Cliente> clientes = new ArrayList<>();
        
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, "%" + nome + "%");
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                Cliente u = new Cliente(rs.getInt("id"),
                                        rs.getString("nome"), 
                                        rs.getString("cpfcnpj"),
                                        rs.getString("telefone"),
                                        rs.getString("observacao"));
                
                clientes.add(u);
            }
        } catch (Exception e) {
            throw e;
        }
        
        return clientes;
    }
}
