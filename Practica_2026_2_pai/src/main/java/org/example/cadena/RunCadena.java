package org.example.cadena;

public class RunCadena {

    public static void main(String[] args) {

        String cadena = "hola, que tal";

//        for (int i = 0; i < cadena.length(); i++) {
//            System.out.println(cadena.charAt(i));
//        }
        String[] partes = cadena.split(" ");
        for (int i = 0; i < partes.length; i++) {
            System.out.println(partes[i]);
        }
        for (String parte : partes) {
//            System.out.println(parte);
            if ( parte.equals("hola,")) {
                System.out.println("ENCONTRE EL HOLA");
                parte = "Adios";
            }
        }
        System.out.println("==========después");
        for (int i = 0; i < partes.length; i++) {
            System.out.println(partes[i]);
        }

        for (int i = 0; i < partes.length; i++) {
            System.out.println(partes[i]);
        }

        String cadena2 = cadena;
        int indice = cadena2.indexOf("a");
        System.out.println("donde hay (a): " + indice);
        cadena2 = cadena2.substring(indice + 1, cadena2.length());
        System.out.println("segunda cadena: " + cadena2);
        int indice2 = cadena2.indexOf("a");
        System.out.println("donde esta la segunda (a): " + indice2);

        System.out.println(cadena);
        System.out.println("primera (a): " + indice);
        System.out.println("segunda (a): " + (indice + indice2));

        System.out.println(" -------------------------------- ");
        String identificacion = "2412345678";

//        for (Character c: identificacion.toCharArray()) {
//            System.out.println(c.toString());
//        }
        for (int i = 0; i < identificacion.length(); i++) {
            int num = identificacion.charAt(i);
            System.out.println("" + num);
        }

        System.out.println(cadena.toUpperCase());
        System.out.println(cadena.toLowerCase());
        System.out.println(cadena.contains("que"));
        System.out.println(cadena.startsWith("h"));
        System.out.println(cadena.endsWith("l"));
    }

}
