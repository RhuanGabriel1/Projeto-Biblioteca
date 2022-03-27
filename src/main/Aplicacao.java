package src.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aplicacao {

    public static void main(String[] args) {
        Integer opcaoMenu = 1;
        Boolean erro = false;

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

                        break;
                    case 2:
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