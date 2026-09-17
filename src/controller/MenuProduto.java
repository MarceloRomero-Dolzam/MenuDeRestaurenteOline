package controller;
import java.util.List;
import java.util.Scanner;
import DataAcessObject.*;
import entity.*;

public class MenuProduto {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int menu = 0;

        do{
            Produto produto = new Produto();
            ProdutoDAO produtoDAO = new ProdutoDAO();
            boolean inserido = false;

            System.out.println("================MENU================");
            System.out.println("1. Inserir novo produto no cardápio.");
            System.out.println("2. Mostrar os produtos no cardápio.");
            System.out.println("3. Atualziar produto.");
            System.out.println("4. Deletar produto");
            System.out.println("=====================================");
            System.out.print("Escolha sua opção: ");
            menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:

                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine().trim();
                    while(nome.isEmpty()){
                        System.out.println("O campo 'nome do produto' não pode ficar vázio!");
                        System.out.print("Digite o nome do produto: ");
                        nome = scanner.nextLine().trim();
                    }
                    produto.setNome(nome);

                    System.out.print("Dê uma descrição do produto: ");
                    String descricao = scanner.nextLine().trim();
                    while(descricao.isEmpty()){
                        System.out.println("O campo 'descrição do produto' não pode ficar vázio!");
                        System.out.print("Dê uma descrição do produto: ");
                        descricao = scanner.nextLine().trim();
                    }
                    produto.setDescricaoDoProduto(descricao);

                    System.out.print("Digite o preço do produto: ");
                    String preco = scanner.nextLine().trim();
                    double valorFinal = 0;
                    boolean flag = false;
                    while(!flag){
                        
                        if(preco.isEmpty()){
                            System.out.println("O campo 'preço do produto' não pode ficar vazio.");
                            System.out.print("Digite o preço do produto: ");
                            preco = scanner.nextLine().trim();
                            continue;
                        }

                        try {
                            valorFinal = Double.parseDouble(preco);

                            if(valorFinal < 1){
                                System.out.println("O preço não pode ser menor que 1.");
                                System.out.print("Digite o preço do produto: ");
                                preco = scanner.nextLine().trim();
                                continue;
                            }

                            flag = true;
                        } catch (NumberFormatException e) {
                            System.out.println("Este campo aceita somente número.");
                        }
                    }
                    produto.setPreco(valorFinal);

                    System.out.print("Descreva a categoria do produto: ");
                    String categoria = scanner.nextLine().trim();
                    while(categoria.isEmpty()){
                        System.out.println("Por favor, escreva uma categoria para o produto.");
                        System.out.print("Descreva a categoria do produto: ");
                        categoria = scanner.nextLine().trim();
                    }
                    produto.setCategoria(categoria);

                    System.out.println("Responda somente com S ou N");
                    System.out.print("O produto está disponível? ");
                    String disponivel = scanner.nextLine().toUpperCase().trim();

                    while(!disponivel.equals("S") && !disponivel.equals("N")){
                        System.out.println("Digite somente S para sim e N para não.");
                        System.out.print("O produto está disponível? ");
                        disponivel = scanner.nextLine().toUpperCase().trim();
                    }

                    if(disponivel.equals("S")){
                        produto.setDisponivel(true);
                    }
                    else if(disponivel.equals("N")){
                        produto.setDisponivel(false);
                    }

                    inserido = produtoDAO.inserirProduto(produto);

                    if(inserido){
                        System.out.println("Produto inserido com sucesso!");
                    }
                    else{
                        System.out.println("Erro ao inserir o produto!");
                    }

                    break;

                    case 2:

                        List<Produto> produtos = produtoDAO.listarProduto();

                        System.out.println("====================CARDÁPIO====================");
                        for(Produto p : produtos){
                            System.out.println("Nome: "+p.getNome());
                            System.out.println("Descrição: "+p.getDescricaoDoProduto());
                            System.out.println("Preço: "+p.getPreco());
                            System.out.println("Categoria: "+p.getCategoria());
                            System.out.println("Dispobivel: "+p.getDisponivel());
                            System.out.println("--------------------------------------------------");
                        }

                        break;

                    case 3:
                        //update
                        break;

                    case 4:
                        //delete
                        break;
            
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        }while(menu != -1);

        scanner.close();
    }
}
