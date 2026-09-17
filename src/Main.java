import java.sql.Connection;
import conexao.Conexao;
import controller.MenuProduto;

public class Main {

    //para testar a conexão com o banco de dados.
    public static void main(String[] args) {

        Connection conexao = Conexao.getConecction();

        if (conexao != null) {
            System.out.println("Conexão realizada com sucesso!");
            MenuProduto.main(args);
        } else {
            System.out.println("Erro ao conectar ao banco de dados.");
        }

    }
}