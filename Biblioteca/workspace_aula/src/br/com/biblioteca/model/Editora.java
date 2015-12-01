package br.com.biblioteca.model;

public class Editora {
    
    private String nome;
    private String codigo;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the nome to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
    public String toString(){
        return codigo + " - " + nome;  
    }
    
    
}
