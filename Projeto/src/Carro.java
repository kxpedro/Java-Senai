/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pedro.sarmento
 */
public class Carro {
    
    private int IdCarro;
    private String Modelo;
    private String Marca;

    public Carro(int IdCarro, String Modelo, String Marca) {
        this.IdCarro = IdCarro;
        this.Modelo = Modelo;
        this.Marca = Marca;
    }

    public int getIdCarro() {
        return IdCarro;
    }

    public void setIdCarro(int IdCarro) {
        this.IdCarro = IdCarro;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    
    
    
}
