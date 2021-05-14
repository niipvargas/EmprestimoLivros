package biblioteca;

import java.util.Date;


public class Emprestimo {

    private Pessoa pessoa;
    private Livro livro;
    private Date dt_emprestimo;

    public Emprestimo(Pessoa pessoa, Livro livro, Date dt_emprestimo) {
        this.pessoa = pessoa;
        this.livro = livro;
        this.dt_emprestimo = dt_emprestimo;
    }  

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Date getDt_emprestimo() {
        return dt_emprestimo;
    }

    public void setDt_emprestimo(Date dt_emprestimo) {
        this.dt_emprestimo = dt_emprestimo;
    }
    
    
    
}
