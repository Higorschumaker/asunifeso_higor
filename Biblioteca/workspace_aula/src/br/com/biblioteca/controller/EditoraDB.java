/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.biblioteca.controller;


import br.com.biblioteca.model.Editora;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Higor e Gustavo
 */
public class EditoraDB implements LogAplicacao{

    private List<Editora> editoras;
    
    public EditoraDB(){
        editoras = new ArrayList<>();
    }
    
    public void inserirEditora(Editora editora){
        editoras.add(editora);
        gravarLog("Editora inserida" + editora.getNome());
    }
    
    public List<Editora> retornarTodas(){
        return editoras;
    }
    
    @Override
    public void gravarLog(String log) {
    
        System.out.println("Nova Editora " + log);
        
    }
    
    
}
