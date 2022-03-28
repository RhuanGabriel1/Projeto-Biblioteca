package src.cadastros;

import src.emprestimo.Livro;


public class CadastrarLivro implements src.interfaces.Menus.MenuCadastrarLivro{
    private Livro livro;

    @Override
    public void criacaoLivro() {
        // TODO
    }

    @Override
    public void coletaDadosLivro(){
        this.livro = new Livro(
            ColetarDados.coletaString("Nome: "),
            ColetarDados.coletaInteger("Ano: ", -2000, 2022),
            ColetarDados.coletaString("Autor: "),
            ColetarDados.coletaString("Editora: ")
        );
    }
}
