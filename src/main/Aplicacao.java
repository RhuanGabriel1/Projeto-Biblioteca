package src.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import src.cadastros.CadastrarLivro;
import src.cadastros.CadastrarUsuario;
import src.consultas.Consulta;
import src.emprestimo.Emprestimo;

public class Aplicacao {

    public static void main(String[] args) {
        Integer opcaoMenu = 1;
        Boolean erro = false;
        
        CadastrarUsuario cadastrarUsuario;
        CadastrarLivro cadastrarLivro;
        // Consulta consulta;
        // Emprestimo emprestimo;

        try (Scanner input = new Scanner(System.in)) {
            while (opcaoMenu != 0) {
                do {
                    erro = false;
                    try {
                        System.out.println("Sair....................0");
                        System.out.println("Cadastrar usuário.......1");
                        System.out.println("Cadastrar livro.........2");
                        System.out.println("Consultar livro.........3");
                        System.out.println("Empréstimo..............4");
                        System.out.print("Devolução...............5\n-> ");
                        opcaoMenu = input.nextInt();
                    } catch (InputMismatchException e) {
                        erro = true;
                        System.out.println("Erro! Insira um número dentro do intervalo mostrado no menu.");
                        input.next();
                    }
                } while (erro || opcaoMenu < 0 && opcaoMenu > 5);
                switch (opcaoMenu) {
                    case 0:
                        break;
                    case 1:
                        cadastrarUsuario = new CadastrarUsuario();
                        cadastrarUsuario.digitarDados();
                        break;
                    case 2:
                        cadastrarLivro = new CadastrarLivro();
                        cadastrarLivro.digitarDados();
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                }
            }
        }
    }

}