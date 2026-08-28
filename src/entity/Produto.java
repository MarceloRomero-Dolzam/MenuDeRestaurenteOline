package entity;

public class Produto {
    
    private int produto_id;
    private String nome_do_produto;
    private String descricao_do_produto;
    private double preco;
    private String categoria;
    private boolean disponivel;

    public Produto(){}

    public Produto(int produtoId, String nome, String descricaoDoProduto, double preco, String categoria, boolean disponivel){
        this.produto_id = produtoId;
        this.nome_do_produto = nome;
        this.descricao_do_produto = descricaoDoProduto;
        this.preco = preco;
        this.categoria = categoria;
        this.disponivel = disponivel;
    }

    public int getProdutoId(){
        return produto_id;
    }

    public String getNome(){
        return nome_do_produto;
    }

    public void setNome(String nome){
        this.nome_do_produto = nome;
    }

    public String getDescricaoDoProduto(){
        return descricao_do_produto;
    }

    public void setDescricaoDoProduto(String descricaoDoProduto){
        this.descricao_do_produto = descricaoDoProduto;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public String getCategoria(){
        return categoria;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    public boolean getDisponivel(){
        return disponivel;
    }

    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }

}
