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

    public Pedido(int pedidoId, int mesaId, String dataHora, double valor){


    }

}
