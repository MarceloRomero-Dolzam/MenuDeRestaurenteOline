package DataAcessObject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Produto;
import conexao.Conexao;

public class ProdutoDAO {

    //Create
    public boolean inserirProduto(Produto produto){
        String sql = "INSERT INTO produto"
        +"(nome_do_produto, descricao_do_produto, preco, categoria, disponivel)"
        +"VALUES (?, ?, ?, ?, ?)";

        try(Connection conn = Conexao.getConecction();
            PreparedStatement stmt = conn.prepareStatement(sql);){

            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getDescricaoDoProduto());
            stmt.setDouble(3, produto.getPreco());
            stmt.setString(4, produto.getCategoria());
            stmt.setBoolean(5, produto.getDisponivel());
            stmt.executeUpdate();
            return true;
            
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }

    }

    //Read
    public List<Produto> listarProduto(){
        String sql = "select * from produto";
        List<Produto> lista = new ArrayList<>();

        try(Connection conn = Conexao.getConecction();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet result = stmt.executeQuery();){
            
            while(result.next()){
                int idProduto = result.getInt("produto_id");

                Produto produto = new Produto(
                    idProduto,
                    result.getString("nome_do_produto"),
                    result.getString("descricao_do_produto"),
                    result.getDouble("preco"),
                    result.getString("categoria"),
                    result.getBoolean("disponivel")
                );

                lista.add(produto);
                
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return lista;
    }

    //Update
    public boolean alterarProduto(Produto produto){

        String sql = "update produto set nome_do_produto = ?, descricao_do_produto = ?, preco = ?, categoria = ?, disponivel = ? where produto_id = ?";

        try(Connection conn = Conexao.getConecction();
            PreparedStatement stmt = conn.prepareStatement(sql);){
            
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getDescricaoDoProduto());
            stmt.setDouble(3, produto.getPreco());
            stmt.setString(4, produto.getCategoria());
            stmt.setBoolean(5, produto.getDisponivel());
            stmt.setInt(6, produto.getProdutoId());

            int linhasAfetadas = stmt.executeUpdate();

            return linhasAfetadas > 0;

        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }

    }

    //Delete
    public boolean removerProduto(int produto_id){
        String sql = "delete from produto where produto_id = ?";

        try(Connection conn = Conexao.getConecction();
            PreparedStatement stmt = conn.prepareStatement(sql);){
            
            stmt.setInt(1, produto_id);
            int linhasAfetadas = stmt.executeUpdate();

            return linhasAfetadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

}