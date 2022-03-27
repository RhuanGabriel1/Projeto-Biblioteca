package src.usuarios;

import java.util.Scanner;
import interfaces.Menus;

public class Bibliotecario implements Menus.MenuCadastrarUsuario{

    private int id;
    private String nome;
    private String email;
    private Usuario usuario;

    public Bibliotecario(){
    }

    public Bibliotecario(int id, String nome, String email){
        this.id = id;
        this.nome = nome;
        this.email = email;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public void criacaoConta() {
        // TODO Auto-generated method stub
    }

    @Override
    public void digitarDados() {
        usuario = new Usuario(
            coletaString("CPF: "), 
            coletaString("Celular"), 
            coletaString("Nome: "),
            coletaString("Email: "));
        
    }

    private String coletaString(String texto){
        String txt;
        try(Scanner input = new Scanner(System.in)){
            System.out.println(texto);
            txt = input.nextLine();
        }
        return txt;
    }




}