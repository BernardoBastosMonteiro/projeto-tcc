/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Produtos;

/**
 *
 * @author Senai
 */
public class ProdutosDAO {
    
/**
 *
 * @author Senai
 */

    public void cadastrarProduto(Produtos p) {
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            
            stmt = conexao.prepareStatement("INSERT INTO produtos (categoria, nome, valor, descricao, imagem) VALUES (?, ?, ?, ?, ?)");
            stmt.setInt(1, p.getCategoria());
            stmt.setString(2, p.getNome());
            stmt.setFloat(3, p.getValor());
            stmt.setString(4, p.getDescricao());
            stmt.setBytes(5, p.getImagem());
            
            stmt.executeUpdate();
            stmt.close();
            conexao.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List<Produtos> listarProdutos() {
        List<Produtos> produtos = new ArrayList<>();
        Connection conexao = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conexao = Conexao.conectar();
            stmt = conexao.prepareStatement("SELECT * FROM produtos LIMIT 10");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produtos produto = new Produtos();
                produto.setIdProduto(rs.getInt("id_produto"));
                produto.setNome(rs.getString("nome"));
                produto.setCategoria(rs.getInt("categoria"));
                produto.setValor(rs.getFloat("valor"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setImagem(rs.getBytes("imagem"));
                produtos.add(produto);
            }
            
            rs.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return produtos;
    }
    
    public List<Produtos> buscaProdutos(String busca) {
        List<Produtos> resultadoBusca = new ArrayList();

        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conexao.prepareStatement("SELECT * FROM produtos WHERE nome LIKE ? OR descricao LIKE ?");
            stmt.setString(1, busca);
            stmt.setString(2, busca);
            
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                Produtos prod = new Produtos();
                prod.setIdProduto(rs.getInt("id_produto"));
                prod.setNome(rs.getString("nome"));
                prod.setCategoria(rs.getInt("categoria"));
                prod.setDescricao(rs.getString("descricao"));
                prod.setValor(rs.getFloat("valor"));
                prod.setImagem(rs.getBytes("imagem"));
                
                resultadoBusca.add(prod);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultadoBusca;
    }
    
    public List<Produtos> buscaCategoria (int categoria) {
        List<Produtos> resultadoBusca = new ArrayList();

        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conexao.prepareStatement("SELECT * FROM produtos WHERE categoria = ?");
            stmt.setInt(1, categoria);
            
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                Produtos prod = new Produtos();
                prod.setIdProduto(rs.getInt("id_produto"));
                prod.setNome(rs.getString("nome"));
                prod.setCategoria(rs.getInt("categoria"));
                prod.setDescricao(rs.getString("descricao"));
                prod.setValor(rs.getFloat("valor"));
                prod.setImagem(rs.getBytes("imagem"));
                
                resultadoBusca.add(prod);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultadoBusca;
    }
    public Produtos buscarProdutoCarrinho(int idProduto) {
        Produtos p = new Produtos();
        
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conexao.prepareStatement("SELECT * FROM produto WHERE  idProduto = ?");
            stmt.setInt(1, idProduto);
            
            rs = stmt.executeQuery();
            
            if(rs.next()) {
                p.setIdProduto(rs.getInt("idProduto"));
                p.setNome(rs.getString("nome"));
                p.setCategoria(rs.getInt("categoria"));
                p.setDescricao(rs.getString("descricao"));
                p.setValor(rs.getFloat("preco"));
                p.setImagem(rs.getBytes("imagem"));
            } else {
                p.setIdProduto(0);
            }
        } catch(SQLException e ) {
            e.printStackTrace();
        }
        
        return p;
    }
    }
