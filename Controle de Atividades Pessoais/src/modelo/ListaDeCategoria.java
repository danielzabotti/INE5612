/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import beans.CategoriaBean;
import java.util.HashMap;

/**
 *
 * @author daniel
 */
public class ListaDeCategoria {
    private HashMap<String, CategoriaBean> listaDeCategoria = new HashMap<>();
    
    public CategoriaBean buscaCategoria(String nomeBusca){
        return listaDeCategoria.get(nomeBusca);
    }
    
    public void adicionarCategoria(CategoriaBean categoria){
        listaDeCategoria.put(categoria.getNome(), categoria);
    }
    
    public void removerCategoria(CategoriaBean categoria){
        listaDeCategoria.remove(categoria.getNome());
    }
    
    public void editaCategoria(String descricao, CategoriaBean categoria){
        CategoriaBean modificada = new CategoriaBean(categoria);
        modificada.setDescricao(descricao);
        listaDeCategoria.replace(categoria.getNome(), modificada);
    }
}
