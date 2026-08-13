package entity;

public class Mesa {
    
    private int mesa_id;
    private int numero_da_mesa;
    private String senha_da_mesa;

    public Mesa(){}

    public Mesa(int mesaId, int numMesa, String senhaMesa){
        this.mesa_id = mesaId;
        this.numero_da_mesa = numMesa;
        this.senha_da_mesa = senhaMesa;
    }

    public int getMesaId(){
        return mesa_id;
    }

    public void setMesaId(int mesaId){
        this.mesa_id = mesaId;
    }

    public int getNumMesa(){
        return numero_da_mesa;
    }

    public void setNumMesa(int numMesa){
        this.numero_da_mesa = numMesa;
    }

    public String senhaMesa(){
        return senha_da_mesa;
    } 

    public void senhaMesa(String senhaMesa){
        this.senha_da_mesa = senhaMesa;
    }


}
