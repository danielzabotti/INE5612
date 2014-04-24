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
        if(validarPlaca(placa)){
            this.placa = placa;
        }else{
            throw new IllegalArgumentException("Placa inválida");
        }
    }

    private boolean validarPlaca(String placa) {
        Boolean valida = true;

        if(!placa.matches("[A-Z]{3}[0-9]{4}")){            
            valida = false;
        }        
        return valida;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if(validarPlaca(placa)){
            this.placa = placa;
        }else{
            throw new IllegalArgumentException("Placa inválida");
        }     
    }            
    
}
