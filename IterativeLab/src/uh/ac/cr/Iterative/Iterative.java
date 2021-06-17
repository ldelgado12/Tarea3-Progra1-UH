package uh.ac.cr.Iterative;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Iterative {

    int answer;
    int amount;

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static PrintStream out = System.out;


    public void start() throws IOException {
        int opcion;
        do {
            ShowMenu();
            opcion = answer;
            procesarOpcion(opcion);
        } while (opcion != 5);

    }

    public void ShowMenu() throws java.io.IOException{

        System.out.println("Por favor seleccione alguna de las siguientes opciones:");
        System.out.println("1. la cantidad de veces que pide el usuario-while");
        System.out.println("2. la cantidad de veces que pide el usuario-for");
        System.out.println("3. Escoje cuando detenerse, do while");
        System.out.println("4. Escoje cuando detenerse, while");
        System.out.println("5. Salir");
        System.out.println("Ingrese el numero de la operacion que desea");
        answer = Integer.parseInt(in.readLine());

    }

    public void procesarOpcion(int pOpcion) throws IOException {
        switch (pOpcion)
        {
            case 1:
                howManyWhile();
                break;
            case 2:
                howManyFor();
                break;
            case 3:
                stopDoWhile();
                break;
            case 4:
                stopWhile();
                break;
            case 5:
                System.out.println("Gracias");
                break;
            default:
                System.out.println("Opcion Invalida");
        }
    }

    public void howManyWhile() throws IOException{

        System.out.println("Ingrese la cantidad de veces que desea imprimir 'Hello world'");
        amount = Integer.parseInt(in.readLine());
        int i =1;
        while (i<=amount){
            System.out.println("Numero " + i + " - Hello world");
            i++;
        }


    }

    public void howManyFor() throws IOException{

        System.out.println("Ingrese la cantidad de veces que desea imprimir 'Hello world'");
        amount = Integer.parseInt(in.readLine());

        for (int actualAmount = 1; actualAmount <= amount; actualAmount++){
            System.out.println("Numero " + actualAmount+" - Hello World");
        }
    }

    public void stopDoWhile() throws IOException{

        int opcion;
        do{
            System.out.println("Hello World");
            System.out.println("");
            System.out.println("si desea volver a leer 'Hello world'? precione 1");
            System.out.println("si no desea continuar, precione 0");
            opcion= Integer.parseInt(in.readLine());
        }while (opcion != 0);

    }

    public void stopWhile() throws IOException{

        int opcion=0;
        while (opcion == 0){
            System.out.println("Hello World");
            System.out.println("");
            System.out.println("si desea volver a leer 'Hello world'? precione 0");
            System.out.println("si no desea continuar, precione cualquier numero diferente a 0");
            opcion= Integer.parseInt(in.readLine());
        }

    }
}
