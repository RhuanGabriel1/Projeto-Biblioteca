package src.cadastros;

import src.usuarios.Usuario;

public class CadastrarUsuario implements src.interfaces.Menus.MenuCadastrarUsuario, src.interfaces.Menus.DigitarDados{
    private Usuario usuario;

    @Override
    public void criacaoConta() {
        // TODO Auto-generated method stub
    }

    @Override
    public void digitarDados() {
            this.usuario = new Usuario(
            ColetarDados.coletaString("CPF: "),
            ColetarDados.coletaString("Celular: "),
            ColetarDados.coletaString("Nome: "),
            ColetarDados.coletaString("Email: "));
    }

}
