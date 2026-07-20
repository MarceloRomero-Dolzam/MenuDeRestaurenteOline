package entity;

import java.time.LocalDateTime;

public class Pedido {

    public enum Situacao{
        EM_ESPERA, 
        EM_PREPARO, 
        PRONTO, 
        ENTREGUE
    }
    
    private int pedidoId;
    private int mesaId;
    private Situacao situacao;
    private LocalDateTime dataHora;
    private double valor;

    public Pedido(){}

    public Pedido(int pedidoId,int mesaId, double valor){

        this.pedidoId = pedidoId;
        this.mesaId = mesaId;
        this.situacao = Situacao.EM_ESPERA;
        this.dataHora = LocalDateTime.now();
        this.valor = valor;

    }

    public int getPedidoId(){
        return pedidoId;
    }

    public int getMesaId(){
        return mesaId;
    }
    
    public void setMesaId(int mesaId){
        this.mesaId = mesaId;
    }

    public Situacao getSituacao(){
        return situacao;
    }

    public void setSituacao(Situacao situacao){
        this.situacao = situacao;
    }

    public LocalDateTime getDataHora(){
        return dataHora;
    }

    public double getValor(){
        return valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }
}
