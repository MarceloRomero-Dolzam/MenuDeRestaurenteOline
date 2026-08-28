package DataAcessObject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entity.Produto;
import conexao.Conexao;

public class ProdutoDAO {

    public boolean inserirProduto(Produto produto){
        String sql = "INSERT INTO produto"
        +"(nome_do_produto, descricao_do_produto, preco, categoria, disponivel)"
        +"VALUES (?, ?, ?, ?, ?)";

        try{
            Connection conn = Conexao.getConecction();
            PreparedStatement stmt = conn.prepareStatement(sql);

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
}