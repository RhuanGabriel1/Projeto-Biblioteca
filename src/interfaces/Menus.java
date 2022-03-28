package src.interfaces;

public interface Menus{

    interface MenuCadastrarUsuario{
        void criacaoConta();
        void digitarDados();
    }

    interface MenuCadastrarLivro{
        void criacaoLivro();
        void coletaDadosLivro();
    }

    interface MenuConsultarLivro{
        void procurarLivro();
    }
}
