package src.cadastros;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
//import java.util.regex.Pattern;

public class ColetarDados {

    public static Integer coletaInteger(String texto, Integer limiteMinimo, Integer limiteMaximo){
        Integer num = -1;
        Scanner input = new Scanner(System.in);
        boolean erro;
        do{
            erro = false;
            try{
                System.out.print(texto);
                num = input.nextInt();
                input.next();
            }
            catch(InputMismatchException e){
                System.out.println("Erro! Insira um número inteiro dentro do intervalo para prosseguir.");
                erro = !erro;
                input.next();
            }
        }while(erro || num < limiteMinimo && num > limiteMaximo);
        input.close();
        return num;
    }

    public static String coletaString(String texto/*, Patter regex*/){
        String str;
        Scanner input = new Scanner(System.in);
        System.out.print(texto);
        str = input.nextLine();
        return str;
    }
}
