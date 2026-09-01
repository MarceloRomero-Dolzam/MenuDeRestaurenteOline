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

    public List<Produto> listarProduto(){
        String sql = "select * from produto";
        List<Produto> lista = new ArrayList<>();

         try{
            Connection conn = Conexao.getConecction();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet result = stmt.executeQuery();

            while(result.next()){
                Produto produto = new Produto();
                produto.setNome(result.getString("nome_do_produto"));
                produto.setDescricaoDoProduto(result.getString("descricao_do_produto"));
                produto.setPreco(result.getDouble("preco"));
                produto.setCategoria(result.getString("categoria"));
                produto.setDisponivel(result.getBoolean("disponivel"));
                lista.add(produto);
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return lista;
    }

}