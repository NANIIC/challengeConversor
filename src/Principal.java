import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Principal {
    private static String monedaAConvertir;
    private static double cantidad;

    public static void main(String[] args) {
        System.out.println(" ↓◄►↓◄►↓◄►↓◄►↓◄►↓◄►↓◄►↓◄►↓◄►↓◄►↓◄►↓◄►↓ ");
        System.out.println("• Bienvenido/a al Conversor de Monedas ☺ • ");
        System.out.println("");
        Scanner lectura = new Scanner((System.in));
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting().create();
        while (true) {
            System.out.println("            MENU ");
            System.out.println("");
            System.out.println("1 • Dólar → Peso argentino");
            System.out.println("2 • Peso Argentino → Dólar");
            System.out.println("3 • Dólar → Real brasileño");
            System.out.println("4 • Real brasileño → Dólar");
            System.out.println("5 • Dólar → Peso colombiano");
            System.out.println("6 • Peso colombiano → Dólar");
            System.out.println("7 • Salir");
            System.out.println("");
            System.out.println("Ingrese el número de la opción elegida ");
            System.out.println("       Elija una opción válida ");
            System.out.println(" ↓◄►↓◄►↓◄►↓◄►↓◄►↓◄►↓◄►↓◄►↓◄►↓◄►↓◄►↓◄►↓ ");
            ConsultaConversor consulta = new ConsultaConversor();
            var busqueda = lectura.nextInt();

            if(busqueda == 7){
                System.out.println("Hasta pronto ☻");
                break;
            }
            if(busqueda > 7){
                System.out.println("Número inválido");
            }

            switch(busqueda){
                case 1:
                    System.out.println("Ingrese la cantidad de Dolares a convertir a Peso argentino:");
                     cantidad = lectura.nextDouble();
                     break;
                case 2:
                    System.out.println("Ingrese la cantidad de Pesos argentinos a convertir a Dolar:");
                    cantidad = lectura.nextDouble();
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad de Dolares a convertir a Real brasilero");
                    cantidad = lectura.nextDouble();
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad de Reales brasileros a convertir a Dolar");
                    cantidad = lectura.nextDouble();
                    break;
                case 5:
                    System.out.println("Ingrese la cantidad de Dolares a convertir a Peso colombiano");
                    cantidad = lectura.nextDouble();
                    break;
                case 6:
                    System.out.println("Ingrese la cantidad de Pesos colombianos a convertir a Dolar");
                    cantidad = lectura.nextDouble();
                    break;

            }
            try {
               var numeroOpc = Integer.valueOf(lectura.nextLine());
                Moneda moneda = consulta.buscaMoneda(monedaAConvertir);
                System.out.println(moneda);

            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Finalizando la aplicación");
            }

        }



    }
}
