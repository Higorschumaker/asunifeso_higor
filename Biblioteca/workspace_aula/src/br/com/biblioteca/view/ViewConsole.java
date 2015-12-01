package br.com.biblioteca.view;

import br.com.biblioteca.model.*;

public class ViewConsole {
    
    public static void main(String args[]){
        Biblioteca objBilblioteca = new Biblioteca();
        objBilblioteca.setNome("Biblioteca ABC");
        
        Aluno objAluno = new Aluno();
        objAluno.setNome("Aluno A");
        objAluno.setMatricula("123456");
        
        Funcionario objFuncionario = new Funcionario();
        objFuncionario.setNome("Funcionario A");
        objFuncionario.setCpf("123456789");
        
        Editora objEditora = new Editora();
        objEditora.setNome("Editora A");
        
        Livro objLivro = new Livro(objEditora);
        objLivro.setCodigo("#123");
        objLivro.setNome("Java! Como Programar.");
        objLivro.setEditora(objEditora);
        
        Emprestimo objEmprestimo = new Emprestimo();
        objEmprestimo.setDataEntrega("15/11/2015");
        objEmprestimo.setFuncionario(objFuncionario);
        objEmprestimo.setAluno(objAluno);
        objEmprestimo.setLivro(objLivro);
        
        System.out.println(objEmprestimo.getAluno().getNome());
    }
    
}
