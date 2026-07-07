import java.sql.Connection;
import conexao.Conexao;

public class Main {

    //para testar a conexão com o banco de dados.
    public static void main(String[] args) {

        Connection conexao = Conexao.getConecction();

        if (conexao != null) {
            System.out.println("Conexão realizada com sucesso!");
        } else {
            System.out.println("Erro ao conectar ao banco de dados.");
        }

    }
}