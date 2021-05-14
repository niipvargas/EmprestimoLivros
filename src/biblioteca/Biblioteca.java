package biblioteca;

import java.util.Date;

public class Biblioteca {

    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa ("Iani Pinheiro", "122.345-32");
        Pessoa p2 = new Pessoa ("Ismael Garcia", "233.765-67");
        
        Livro l1 = new Livro ("Doze", "Maria Silva", "Galera");
        Livro l2 = new Livro ("O segredo de Isabella", "Maria Silva", "Galera");
        
        Date d1 = new Date(2021, 05, 14);
        
        
        Emprestimo e1 = new Emprestimo(p1, l2, d1);
        
        System.out.println(e1.getPessoa().getNome());
        System.out.println(e1.getLivro().getTitulo());
        System.out.println(e1.getDt_emprestimo());
      
    }
    
}
