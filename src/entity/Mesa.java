package entity;

public class Mesa {
    
    private int mesaId;
    private int numMesa;
    private String senhaMesa;

    public Mesa(){}

    public Mesa(int mesaId, int numMesa, String senhaMesa){
        this.mesaId = mesaId;
        this.numMesa = numMesa;
        this.senhaMesa = senhaMesa;
    }

    public int getMesaId(){
        return mesaId;
    }

    public void setMesaId(int mesaId){
        this.mesaId = mesaId;
    }

    public int getNumMesa(){
        return numMesa;
    }

    public void setNumMesa(int numMesa){
        this.numMesa = numMesa;
    }

    public String senhaMesa(){
        return senhaMesa;
    } 

    public void senhaMesa(String senhaMesa){
        this.senhaMesa = senhaMesa;
    }


}
