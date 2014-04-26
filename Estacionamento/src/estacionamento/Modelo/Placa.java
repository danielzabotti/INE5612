/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estacionamento.Modelo;

/**
 *
 * @author aluno
 */
public class Placa {
    private String placa;    

    public Placa(String placa) {
        if(validarPlaca(placa))
            this.placa = placa;
        
    }

    public static boolean validarPlaca(String placa) {
        if(!placa.matches("[A-Z]{3}[0-9]{4}"))        
            throw new IllegalArgumentException("Placa inválida");
               
        return true;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if(validarPlaca(placa))
            this.placa = placa;
    }            
    
}
