package Exercicis_List_part_1;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author gmartinez
 */
public class Krona {
    /*
    SISTEMA DE NAVEGACIÓ BASAT EN WAYPOINTS.
    ES DONEN D'ALTA DIVERSOS WAYPOINTS DE L'ESPAI (ORBITA MARCIANA, PUNT LAGRANGE TERRA-LLUNA, PHOBOS, SATURN, LLUNA,...).
    ES PODEN MEMORITZAR DIVERSES RUTES AFEGINT DIVERSOS WAYPOINTS A CADA RUTA.

    */

    public static void bloquejarPantalla() {
        Scanner in = new Scanner(System.in);
        System.out.print("\nToca 'C' per a continuar ");
        while (in.hasNext()) {
            if ("C".equalsIgnoreCase(in.next())) break;
        }
    }


    public static void menuKrona() throws IOException {
        String opcio;
        Scanner sc = new Scanner(System.in);
        StringBuilder menu = new StringBuilder("");

        ComprovacioRendiment comprovacioRendimentTmp = null;

        do {
            menu.delete(0, menu.length());

            menu.append(System.getProperty("line.separator"));
            menu.append("RV-18A Krona ");
            menu.append(System.getProperty("line.separator"));
            menu.append(System.getProperty("line.separator"));

            menu.append("1. Inicialitzar el procés de comprovació d'un ArrayList i un LinkedList de waypoints");
            menu.append(System.getProperty("line.separator"));
            menu.append("2. Comprovar rendiment d'inicialització d'un ArrayList i un LinkedList de waypoints");
            menu.append(System.getProperty("line.separator"));
            menu.append("3. Comprovar rendiment d'inserció en un ArrayList i en un LinkedList de waypoints");
            menu.append(System.getProperty("line.separator"));
            menu.append("4. Modificació dels waypoints de l'ArrayList i del LinkedList");
            menu.append(System.getProperty("line.separator"));
            menu.append("5. Esborrar waypoints de l'ArrayList i del LinkedList");
            menu.append(System.getProperty("line.separator"));
            menu.append("6. Modificar coordenades i noms dels waypoints de l'Arraylist amb ID parell.");
            menu.append(System.getProperty("line.separator"));
            menu.append("7. Visualitzar els waypoints de l'ArrayList ordenats.");
            menu.append(System.getProperty("line.separator"));
            menu.append(System.getProperty("line.separator"));
            menu.append("8. Llistar els waypoints de l'ArrayList que es trobin a certa distancia de la Terra.");
            menu.append(System.getProperty("line.separator"));
            menu.append(System.getProperty("line.separator"));

            menu.append("10. Inicialitzar una ruta.");
            menu.append(System.getProperty("line.separator"));
            menu.append("11. Visualitzar una ruta");
            menu.append(System.getProperty("line.separator"));
            menu.append("12. Invertir una ruta");
            menu.append(System.getProperty("line.separator"));
            menu.append("13. Existeix el waypoint Orbita de Jupiter REPETIDA a la ruta?");
            menu.append(System.getProperty("line.separator"));

            menu.append("14. Llistar els waypoints d'una ruta.");
            menu.append(System.getProperty("line.separator"));
            menu.append("15. Crear una ruta.");
            menu.append(System.getProperty("line.separator"));
            menu.append("16. Modificar una ruta.");
            menu.append(System.getProperty("line.separator"));
            menu.append("17. Llistar les rutes que tinguin un waypoint diferent.");
            menu.append(System.getProperty("line.separator"));
            menu.append("18. Donar de baixa una ruta.");
            menu.append(System.getProperty("line.separator"));
            menu.append("19. Esborra la BD d'una ruta.");
            menu.append(System.getProperty("line.separator"));

            menu.append("20. Inicialitzar llista de Rutes.");
            menu.append(System.getProperty("line.separator"));

            menu.append("30. Crear un Map de rutes i visualitzar-lo");
            menu.append(System.getProperty("line.separator"));
            menu.append("31. Visualitza totes les rutes del MAP que tinguin un waypoint concret.");
            menu.append(System.getProperty("line.separator"));
            menu.append("32. Esborrar totes les rutes del MAP que tinguin un waypoint conret");
            menu.append(System.getProperty("line.separator"));
            menu.append("33. Visualitzar les dades d'una ruta");
            menu.append(System.getProperty("line.separator"));
            menu.append("34. Ordenar les rutes del MAP per ID");
            menu.append(System.getProperty("line.separator"));
            menu.append("35. Ordenar les rutes del MAP per waypoints i per ID (el ID de mes gran a mes petit)");
            menu.append(System.getProperty("line.separator"));

            menu.append("50. Tornar al menú pare (PNS-24 Puma)");
            menu.append(System.getProperty("line.separator"));


            System.out.print(MenuConstructorPantalla.constructorPantalla(menu));

            opcio = sc.next();


            switch (opcio) {
                case "1":
                    comprovacioRendimentTmp = Waypoint.inicialitzarComprovacioRendiment();
                    bloquejarPantalla();
                    break;
                case "2":
                    comprovacioRendimentTmp = Waypoint.comprovarRendimentInicialitzacio(10, comprovacioRendimentTmp);
                    bloquejarPantalla();
                    break;
                case "3":
                    comprovacioRendimentTmp = Waypoint.comprovarRendimentInsercio(comprovacioRendimentTmp);
                    bloquejarPantalla();
                    break;
                case "4":
                    comprovacioRendimentTmp = Waypoint.modificarWaypoints(comprovacioRendimentTmp);
                    bloquejarPantalla();
                    break;
                case "5":
                    comprovacioRendimentTmp = Waypoint.esborrarWaypoints(comprovacioRendimentTmp);
                    bloquejarPantalla();
                    break;
                case "6":
                    comprovacioRendimentTmp = Waypoint.modificarCoordenadesINomDeWaypoints(comprovacioRendimentTmp);
                    bloquejarPantalla();
                    break;
                case "7":
                    Waypoint.visualitzarWaypointsOrdenats(comprovacioRendimentTmp);
                    bloquejarPantalla();
                    break;
                case "8":
                    Waypoint.waypointsACertaDistanciaMaxDeLaTerra(comprovacioRendimentTmp);
                    bloquejarPantalla();
                    break;
                case "10":
                    comprovacioRendimentTmp = new ComprovacioRendiment();
                    comprovacioRendimentTmp = Ruta.inicialitzarRuta(comprovacioRendimentTmp);

                    bloquejarPantalla();
                    break;
                case "11":
                    Ruta.visualitzarRuta(comprovacioRendimentTmp);
                    bloquejarPantalla();
                    break;
                case "12":
                    Ruta.invertirRuta(comprovacioRendimentTmp);
                    bloquejarPantalla();
                    break;
                case "13":
                    bloquejarPantalla();
                    break;
                case "15":

                    bloquejarPantalla();
                    break;
                case "20":
                    comprovacioRendimentTmp = Ruta.inicialitzaLListaRutes(comprovacioRendimentTmp);
                    bloquejarPantalla();
                    break;
                case "30":
                    Ruta.crearLinkedHashMapDeRutes(comprovacioRendimentTmp);
                    bloquejarPantalla();
                    break;
                case "31":
                    Ruta.visualitzarRutesDelMapAmbUnWaypointConcret(comprovacioRendimentTmp);
                    bloquejarPantalla();
                    break;
                case "32":
                    Ruta.esborrarRutesDelMapAmbUnWaypointConcret(comprovacioRendimentTmp);
                    bloquejarPantalla();
                    break;
                case "33":
                    Ruta.visualitzarUnaRutaDelMap(comprovacioRendimentTmp);
                    bloquejarPantalla();
                    break;
                case "34":
                    Ruta.ordenarRutesMapPerID(comprovacioRendimentTmp);
                    bloquejarPantalla();
                    break;
                case "35":
                    Ruta.ordenarRutesMapPerWaypointsAndID(comprovacioRendimentTmp);
                    bloquejarPantalla();
                    break;
                case "50":
                    break;
                default:
                    System.out.println("COMANDA NO RECONEGUDA");
            }
        } while (!opcio.equals("50"));
    }

}