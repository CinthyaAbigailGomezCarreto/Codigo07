package com.codigo7;

import java.util.HashMap;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<String, String> capitales = new HashMap<>();

        capitales.put("Canadá", "Ottawa");
        capitales.put("Estados Unidos", "Washington DC");
        capitales.put("México", "Ciudad de México");
        capitales.put("Belice", "Belmopán");
        capitales.put("Costa Rica", "San José");
        capitales.put("El Salvador", "San Salvador");
        capitales.put("Guatemala", "Ciudad de Guatemala");
        capitales.put("Honduras", "Tegucigalpa");
        capitales.put("Nicaragua", "Managua");
        capitales.put("Panamá", "Ciudad de Panamá");

        String c = "";

        do {
            System.out.print("Escribe el nombre de un país (Primera letra mayúscula y con acentos si es el caso) y te diré su capital: ");
            c = s.nextLine().trim();

            if (!c.equalsIgnoreCase("salir")) {
                if (capitales.containsKey(c)) {
                    System.out.println("La capital de " + c + " es: " + capitales.get(c));
                } else {
                    System.out.print("No conozco la respuesta. ");
                    System.out.print("¿Cuál es la capital de " + c + "?: ");
                    String capital = s.nextLine().trim();
                    capitales.put(c, capital);
                    System.out.println("Gracias por enseñarme nuevas capitales.");
                }
            }
        } while (!c.equalsIgnoreCase("salir"));

        s.close();
    }
}
