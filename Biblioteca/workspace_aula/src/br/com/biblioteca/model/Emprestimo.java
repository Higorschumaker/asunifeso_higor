package br.com.biblioteca.model;

/**
 *
 * @author Gabriel Duarte <gabriellagoa10@yahoo.com.br>
 */
public class Emprestimo {
    
    private String dataEntrega;
    private Livro livro;
    private Funcionario funcionario;
    private Aluno aluno;
    private Boolean entregue;
    
    public Emprestimo(){
        entregue = false;
    }
    /**
     * @return the dataEntrega
     */
    public String getDataEntrega() {
        return dataEntrega;
    }

    /**
     * @param dataEntrega the dataEntrega to set
     */
    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    /**
     * @return the livro
     */
    public Livro getLivro() {
        return livro;
    }

    /**
     * @param livro the livro to set
     */
    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    /**
     * @return the funcionario
     */
    public Funcionario getFuncionario() {
        return funcionario;
    }

    /**
     * @param funcionario the funcionario to set
     */
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    /**
     * @return the aluno
     */
    public Aluno getAluno() {
        return aluno;
    }

    /**
     * @param aluno the aluno to set
     */
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    /**
     * @return the entregue
     */
    public Boolean getEntregue() {
        return entregue;
    }

    /**
     * @param entregue the entregue to set
     */
    public void setEntregue(Boolean entregue) {
        this.entregue = entregue;
    }   
    

    @Override
    public String toString() {
        return "Funcionário: " + funcionario.getNome() + "\n" + "Aluno: " + aluno.getNome() + "\n" + 
               "Livro: " + livro.getNome() +  "\nData Entrega: " + getDataEntrega() + "\n";
    }
    
    public String toStringArq() {
        return "Funcionário: " + funcionario.getNome() + "%nAluno: " + aluno.getNome() + "%nLivro: " 
                + livro.getNome() +  "%nData Entrega: " + getDataEntrega() + "%n";
    }
}