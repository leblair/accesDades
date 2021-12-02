package Exercicis_List_part_1;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Kristall {
    public static void bloquejarPantalla() {
        Scanner in = new Scanner(System.in);
        System.out.print("\nToca 'C' per a continuar ");
        while (in.hasNext()) {
            if ("C".equalsIgnoreCase(in.next())) break;
        }
    }

    public static void menuKristall() throws Exception {
        String str = "";
        int option;
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("1. Comparar 2 fitxers\n" +
                    "2. N de linies i caracters d'una llista d'arxius (I)\n" +
                    "3. N de linies i caracters d'una llista d'arxius (II)" +
                    "4. N de repeticions de caracters en un fitxer" +
                    "5. Links d'una URL a un fitxer" +
                    "50. Tornar al menu pare");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    menu1();
                    bloquejarPantalla();
                    break;
                case 2:
                    bloquejarPantalla();
                    break;
                case 3:
                    bloquejarPantalla();
                    break;
                case 4:
                    bloquejarPantalla();
                    break;
                case 5:
                    bloquejarPantalla();
                    break;
                case 50:
                    exit = true;
                    break;
            }

        }
    }

    public static void menu1() {
        File fileA = new File("C:\\Users\\focus\\OneDrive\\Documentos\\prueba\\a.txt");
        File fileB = new File("C:\\Users\\focus\\OneDrive\\Documentos\\prueba\\b.txt");
        FileReader fr;
        BufferedReader br;
        String linea = "";
        String lineab = "";
        FileReader fb;
        BufferedReader bb;
        int numLine = 0,cont =0;

        try {
            fb = new FileReader(fileB);
            bb = new BufferedReader(fb);
            fr = new FileReader(fileA);
            br = new BufferedReader(fr);
            while ((linea = br.readLine()) != null) {
                lineab = bb.readLine();
                cont++;
                if(!linea.equals(lineab)){
                    System.out.println("Falla la linia " + cont);
                    System.out.println("Linia de " + fileA.getName() + ":" + linea);
                    System.out.println("Linia de " + fileB.getName() + ":" + lineab);
                    numLine++;
                }
            }
            fb.close();
            fr.close();
            System.out.println("Numero de linies diferents: " + numLine);
            System.out.println("Fi de la comparació.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
