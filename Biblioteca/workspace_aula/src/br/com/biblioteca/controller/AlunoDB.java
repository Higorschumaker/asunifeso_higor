
package br.com.biblioteca.controller;

import br.com.biblioteca.model.Aluno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Higor e Gustavo
 */
public class AlunoDB implements LogAplicacao{
    
    private List<Aluno> alunos;
    
    public AlunoDB(){
        alunos = new ArrayList<>();
    }
    
    public void inserirAluno(Aluno aluno){
        alunos.add(aluno);
        gravarLog("Aluno inserido" + aluno.getNome());
    }
    
    public List<Aluno> retornarTodos(){
        return alunos;
    }



    @Override
    public void gravarLog(String log) {
        
        System.out.println("Novo Aluno " + log);
        
    }
    
}
