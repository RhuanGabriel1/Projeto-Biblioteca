package com.biblioteca.src.cadastros;

import com.biblioteca.src.consultas.Consulta;
import com.biblioteca.src.usuarios.Usuario;

public class RemoverUsuario implements com.biblioteca.src.interfaces.Menus.RemoveUsuario, com.biblioteca.src.interfaces.Menus.DigitarDados {
    Usuario usuario;
    @Override
    public void remover(){
        // Query do banco de dados
        // "delete from usuario where cpf = '" + this.usuario.getCpf() + "';"
    }

    @Override
    public void digitarDados(){
        Consulta consulta = new Consulta();
        this.usuario = consulta.procurarUsuario();
    }
}
