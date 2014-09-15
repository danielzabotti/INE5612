/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import beans.AtividadeBean;
import beans.CategoriaBean;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author daniel
 */
public class GerenciadorDeAtividades {

    private static GerenciadorDeAtividades instance = null;

    HashMap<String, AtividadeBean> atividades = new HashMap<>();
    HashMap<String, CategoriaBean> categorias = new HashMap<>();

    private GerenciadorDeAtividades() {

    }

    public static GerenciadorDeAtividades getInstance() {
        if (instance == null) {
            instance = new GerenciadorDeAtividades();
        }

        return instance;
    }

    public boolean adicionarAtividade(AtividadeBean atividade) {
        if (atividades.containsKey(atividade.getNome())) {
            System.err.println("Atividade já existe!");
            return false;
        }

        atividades.put(atividade.getNome(), atividade);

        return true;
    }

    public boolean adicionarCategoria(CategoriaBean categoria) {
        if (categorias.containsKey(categoria.getNome())) {
            System.err.println("Categoria já existe!");

            return false;
        }

        categorias.put(categoria.getNome(), categoria);

        return true;
    }

    public boolean editarCategoria(CategoriaBean categoria) {

        categorias.put(categoria.getNome(), categoria);
        for (Map.Entry<String, AtividadeBean> entry : atividades.entrySet()) {
            String string = entry.getKey();
            AtividadeBean atividadeBean = entry.getValue();
            if (atividadeBean.getCategoria().getNome().equals(categoria.getNome())) {
                atividadeBean.setCategoria(categoria);
            }

        }

        return true;
    }

    public HashMap<String, AtividadeBean> listarAtividades() {
        return atividades;
    }

    public HashMap<String, CategoriaBean> listarCategorias() {
        return categorias;
    }

    public void removerCategoria(String chave) {
        this.categorias.remove(chave);
    }

    public void removerAtividade(String chave) {
        this.atividades.remove(chave);
    }

}
