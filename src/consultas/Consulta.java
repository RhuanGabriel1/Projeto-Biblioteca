package src.consultas;

import src.cadastros.ColetarDados;
import src.emprestimo.Livro;
import src.usuarios.Usuario;

public class Consulta implements src.interfaces.Menus.MenuConsultarLivro {

    @Override
    public Livro procurarLivro() {
        String nomeLivro = ColetarDados.coletaString("Insira o nome do livro: ");
        // coleta as informações da query do banco de dados ("select * from livro where nome = '" + nomeLivro + "';")
        // if(result != null)
        //      return new Livro(...)
        // return

        return null;
    }

    public Usuario procurarUsuario(){
        String cpfUsuario = ColetarDados.coletaString("Insira o CPF da pessoa a ser buscada: ");
        // coleta as informações da query do banco de dados ("select * from usuario where cpf = '" + cpfUsuario + "';")
        // if(result != null)
        //      return new Usuario(...)
        // return
        return null;
    }

}
