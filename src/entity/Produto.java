package entity;

public class Produto {
    
    private int produtoId;
    private String nome;
    private String descricaoDoProduto;
    private double preco;
    private String categoria;
    private boolean disponivel;

    public Produto(){

    }

    public Produto(int produtoId, String nome, String descricaoDoProduto, double preco, String categoria, boolean disponivel){
        this.produtoId = produtoId;
        this.nome = nome;
        this.descricaoDoProduto = descricaoDoProduto;
        this.preco = preco;
        this.categoria = categoria;
        this.disponivel = disponivel;
    }

    public int getProdutoId(){
        return produtoId;
    }

    public void setProdutoId(int produtoId){
        //O this recebe a propriedade desse objeto e essa propriedade recebe o valor vindo do parâmetro.
        this.produtoId = produtoId;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDescricaoDoProduto(){
        return descricaoDoProduto;
    }

    public void setDescricaoDoProduto(String descricaoDoProduto){
        this.descricaoDoProduto = descricaoDoProduto;
    }

    public double preco(){
        return preco;
    }

    public void preco(double preco){
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

    public void disponivel(boolean disponivel){
        this.disponivel = disponivel;
    }

}
