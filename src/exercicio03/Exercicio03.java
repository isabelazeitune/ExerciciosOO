package exercicio03;

public class Exercicio03 {

    public static void main(String[] args) {
        Livro livro1 = new Livro("tituloDoLivro", "autorDoLivro", 100);
        //erro ao tentar alterar o nome:
        //Livro livro1 = new Livro("novoTitulo", "novoAutor", "101");

        livro1.titulo;
        livro1.getTitulo();
    }
}
