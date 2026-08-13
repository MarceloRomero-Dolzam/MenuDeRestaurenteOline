package entity;

public class ItemPedido {
    private int item_pedido_id;
    private int pedido_id;
    private int produto_id;
    private int quantidade;
    private String observacao;

    public ItemPedido(){}

    public ItemPedido(int itemPedidoId, int pedidoId, int produtoId, int quantidade, String observacao){

        this.item_pedido_id = itemPedidoId;
        this.pedido_id = pedidoId;
        this.produto_id = produtoId;
        this.quantidade = quantidade;
        this.observacao = observacao;

    }

    public int getItemPedidoId(){
        return item_pedido_id;
    }

    public int getPedidoId(){
        return pedido_id;
    }

    public int getProdutoId(){
        return produto_id;
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
