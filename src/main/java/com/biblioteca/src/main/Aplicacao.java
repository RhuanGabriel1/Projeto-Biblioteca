package com.biblioteca.src.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.biblioteca.src.cadastros.CadastrarDevolucao;
import com.biblioteca.src.cadastros.CadastrarEmprestimo;
import com.biblioteca.src.cadastros.CadastrarLivro;
import com.biblioteca.src.cadastros.CadastrarUsuario;
import com.biblioteca.src.cadastros.RemoverUsuario;

public class Aplicacao {

    public static void main(String[] args) {
        Integer opcaoMenu = 1;
        Boolean erro = false;

        CadastrarUsuario cadastrarUsuario;
        CadastrarLivro cadastrarLivro;
        CadastrarEmprestimo emprestimo;
        CadastrarDevolucao devolucao;
        RemoverUsuario remover;
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
                        System.out.println("Devolução...............5");
                        System.out.print("Remover usuário.........6\n-> ");
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
                        cadastrarUsuario.criacaoConta();
                        break;
                    case 2:
                        cadastrarLivro = new CadastrarLivro();
                        cadastrarLivro.digitarDados();
                        cadastrarLivro.criacaoLivro();
                        break;
                    case 3:

                        break;
                    case 4:
                        emprestimo = new CadastrarEmprestimo();
                        emprestimo.digitarDados();
                        emprestimo.emprestar();
                        break;
                    case 5:
                        devolucao = new CadastrarDevolucao();
                        devolucao.digitarDados();
                        devolucao.devolver();
                        break;
                    case 6:
                        remover = new RemoverUsuario();
                        remover.digitarDados();
                        remover.remover();
                        break;
                }
            }
        }
    }

}