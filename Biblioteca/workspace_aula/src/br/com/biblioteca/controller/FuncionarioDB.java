package br.com.biblioteca.controller;

import br.com.biblioteca.model.Funcionario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Higor e Gustavo 
 */
public class FuncionarioDB implements LogAplicacao{
    
    private List<Funcionario> funcionarios;
    
    public FuncionarioDB(){
        funcionarios = new ArrayList<>();    
    }
    
    public void inserirFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
        gravarLog("Funcionário cadastrado: " + funcionario.getNome());
    }
    
    public List<Funcionario> retornarTodos(){
        return funcionarios;
    }
    
    @Override
    public void gravarLog(String log) {
        System.out.println("Novo Funcionário " + log);
    }
}