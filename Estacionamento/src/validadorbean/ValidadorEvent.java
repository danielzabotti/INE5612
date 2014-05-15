/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package validadorbean;



import java.util.EventObject;
/**
 *
 * @author aluno
 */

public class ValidadorEvent extends EventObject  {

    private String conteudo;

    private boolean valido;

 

    public ValidadorEvent(Object source, String conteudo, Boolean valido) {

        super(source);

        this.conteudo = conteudo;

        this.valido = valido;

    }

 

    public void setConteudo(String conteudo) { this.conteudo = conteudo; }

    public String getConteudo() { return this.conteudo; } 

    public void setValido(Boolean valido) { this.valido = valido; }

    public boolean isValido() { return this.valido; }   

} 
