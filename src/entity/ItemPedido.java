package entity;

public class ItemPedido {
    private int itemPedidoId;
    private int pedidoId;
    private int produtoId;
    private int quantidade;
    private String observacao;

    public ItemPedido(){}

    public ItemPedido(int itemPedidoId, int pedidoId, int produtoId, int quantidade, String observacao){

        this.itemPedidoId = itemPedidoId;
        this.pedidoId = pedidoId;
        this.produtoId = produtoId;
        this.quantidade = quantidade;
        this.observacao = observacao;

    }

    public int getItemPedidoId(){
        return itemPedidoId;
    }

    public int getPedidoId(){
        return pedidoId;
    }

    public int getProdutoId(){
        return produtoId;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public String getObservacao(){
        return observacao;
    }

    public void setObservacao(String observacao){
        this.observacao = observacao;
    }

}
