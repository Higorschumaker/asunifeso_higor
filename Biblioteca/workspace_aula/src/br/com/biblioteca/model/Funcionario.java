package br.com.biblioteca.model;

/**
 * 
 * @author Bruno Costa
 */
public class Funcionario {
    
    private String nome;
    private String cpf;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome o nome do funcionário
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public String toString(){
        return cpf + " - " + nome;
    }
    
}
