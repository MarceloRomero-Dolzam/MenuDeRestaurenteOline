package entity;

import java.time.LocalDateTime;

public class Pedido {

    public enum Situacao{
        EM_ESPERA, 
        EM_PREPARO, 
        PRONTO,
        SAIU_PARA_ENTREGA,
        ENTREGUE
    }
    
    private int pedido_id;
    private int mesa_id;
    private Situacao situacao;
    private LocalDateTime data_hora;
    private double total;

    public Pedido(){}

    public Pedido(int pedidoId,int mesaId, double valor){

        this.pedido_id = pedidoId;
        this.mesa_id = mesaId;
        this.situacao = Situacao.EM_ESPERA;
        this.data_hora = LocalDateTime.now();
        this.total = valor;

    }

    public int getPedidoId(){
        return pedido_id;
    }

    public int getMesaId(){
        return mesa_id;
    }
    
    public void setMesaId(int mesaId){
        this.mesa_id = mesaId;
    }

    public Situacao getSituacao(){
        return situacao;
    }

    public void setSituacao(Situacao situacao){
        this.situacao = situacao;
    }

    public LocalDateTime getDataHora(){
        return data_hora;
    }

    public double getValor(){
        return total;
    }

    public void setValor(double valor){
        this.total = valor;
    }
}
