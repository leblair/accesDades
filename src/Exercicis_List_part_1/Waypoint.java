package Exercicis_List_part_1;

import Llibreries.Varies.Cadena;

import java.text.Collator;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Waypoint {


    public static ComprovacioRendiment inicialitzarComprovacioRendiment() {
        ComprovacioRendiment comprovacioRendimentTmp = new ComprovacioRendiment();
        return comprovacioRendimentTmp;
    }

    public static ComprovacioRendiment comprovarRendimentInicialitzacio(int numObjACrear,
                                                                        ComprovacioRendiment comprovacioRendimentTmp) {
        DateTimeFormatter time = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

        long start = System.nanoTime();
        for (int i = 0; i < numObjACrear; i++) {
            comprovacioRendimentTmp.llistaArrayList.add(new Waypoint_Dades(0, "Orbita de la Terra", new int[]{0, 0, 0}, true, LocalDateTime.parse("15-08-1954 00:01", time), null, null));
        }
        long end = System.nanoTime();
        System.out.println("Temps per a insertar " + numObjACrear + " waypoints en l'ArrayList: " + TimeUnit.MILLISECONDS.convert((end - start), TimeUnit.NANOSECONDS));

        start = System.nanoTime();
        for (int i = 0; i < numObjACrear; i++) {
            comprovacioRendimentTmp.llistaLinkedList.add(new Waypoint_Dades(0, "Orbita de la Terra", new int[]{0, 0, 0}, true, LocalDateTime.parse("15-08-1954 00:01", time), null, null));
        }
        end = System.nanoTime();
        System.out.println("Temps per a insertar " + numObjACrear + " waypoints en el LinkedList: " + TimeUnit.MILLISECONDS.convert((end - start), TimeUnit.NANOSECONDS));
        return comprovacioRendimentTmp;
    }

    public static ComprovacioRendiment comprovarRendimentInsercio(ComprovacioRendiment comprovacioRendimentTmp) {
        DateTimeFormatter time = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

        Waypoint_Dades newWaypoint = new Waypoint_Dades(0, "Orbita de la Terra", new int[]{0, 0, 0},
                true, LocalDateTime.parse("15-08-1954 00:01", time),
                null, null);

        long start = System.nanoTime();
        comprovacioRendimentTmp.llistaArrayList.add(0, new Waypoint_Dades(0, "Orbita de la Terra", new int[]{0, 0, 0},
                true, LocalDateTime.parse("15-08-1954 00:01", time),
                null, null));

        long end = System.nanoTime();
        System.out.println("Temps per a insertar 1 waypoint en el ArrayList: " + (end - start));

        start = System.nanoTime();
        comprovacioRendimentTmp.llistaLinkedList.add(0, new Waypoint_Dades(0, "Orbita de la Terra", new int[]{0, 0, 0},
                true, LocalDateTime.parse("15-08-1954 00:01", time),
                null, null));

        end = System.nanoTime();
        System.out.println("Temps per a insertar 1 waypoint en el LinkedList: " + (end - start));

        //Middle add

        start = System.nanoTime();
        int mid = comprovacioRendimentTmp.llistaArrayList.size() / 2;
        comprovacioRendimentTmp.llistaArrayList.add(mid, new Waypoint_Dades(0, "Orbita de la Terra", new int[]{0, 0, 0},
                true, LocalDateTime.parse("15-08-1954 00:01", time),
                null, null));

        end = System.nanoTime();
        System.out.println("Temps per a insertar 1 waypoint al mig (pos. " + mid + ") de l'ArrayList: " + (end - start));

        start = System.nanoTime();
        comprovacioRendimentTmp.llistaLinkedList.add(mid, new Waypoint_Dades(0, "Orbita de la Terra", new int[]{0, 0, 0},
                true, LocalDateTime.parse("15-08-1954 00:01", time),
                null, null));

        end = System.nanoTime();
        System.out.println("Temps per a insertar 1 waypoint al mig (pos. " + mid + ") del LinkedList: " + (end - start));

        //Final add

        start = System.nanoTime();
        comprovacioRendimentTmp.llistaArrayList.add(new Waypoint_Dades(0, "Orbita de la Terra", new int[]{0, 0, 0},
                true, LocalDateTime.parse("15-08-1954 00:01", time),
                null, null));
        end = System.nanoTime();
        System.out.println("Temps per a insertar 1 waypoint al final del ArrayList: " + (end - start));

        start = System.nanoTime();
        comprovacioRendimentTmp.llistaLinkedList.add(new Waypoint_Dades(0, "Orbita de la Terra", new int[]{0, 0, 0},
                true, LocalDateTime.parse("15-08-1954 00:01", time),
                null, null));
        end = System.nanoTime();
        System.out.println("Temps per a insertar 1 waypoint al final del LinkedList: " + (end - start));

        return comprovacioRendimentTmp;
    }

    public static ComprovacioRendiment modificarWaypoints(ComprovacioRendiment comprovacioRendimentTmp) {

        List<Integer> idsPerArrayList = new ArrayList<>(comprovacioRendimentTmp.llistaArrayList.size());

        //comprovacioRendimentTmp.llistaArrayList.set();

        for (int i = 0; i < comprovacioRendimentTmp.llistaArrayList.size(); i++) {
            idsPerArrayList.add(i);
        }
        System.out.println("S'ha inicialitzat la llista idsPerArrayList amb " + comprovacioRendimentTmp.llistaArrayList.size() + " elements.");
        System.out.println("El 1r element te el valor: " + idsPerArrayList.get(0));
        System.out.println("L'ultim element te el valor: " + idsPerArrayList.get(9));

        for (int i = 0; i < comprovacioRendimentTmp.llistaArrayList.size(); i++) {
            System.out.println("ABANS DEL CANVI: comprovacioRendimentTmp.llistaArrayList.get(" + i + ").getId(): " +
                    comprovacioRendimentTmp.llistaArrayList.get(i).getId());
            comprovacioRendimentTmp.llistaArrayList.get(i).setId(i);
            System.out.println("DESPRES DEL CANVI: comprovacioRendimentTmp.llistaArrayList.get(" + i + ").getId(): " +
                    comprovacioRendimentTmp.llistaArrayList.get(i).getId() + "\n");
        }

        System.out.println("\n---- APARTAT 3.1 (bucle for) -----");
        for (Waypoint_Dades element : comprovacioRendimentTmp.llistaArrayList) {
            System.out.println("ID = " + element.getId() + ", nom = " + element.getNom());
        }

        System.out.println("\n---- APARTAT 3.2 (Iterator) -----");
        Iterator<Waypoint_Dades> it = comprovacioRendimentTmp.llistaArrayList.iterator();

        while (it.hasNext()) {
            Waypoint_Dades element = it.next();
            System.out.println("ID = " + element.getId() + ", nom = " + element.getNom());
        }

        System.out.println("\n---- APARTAT 4 -----");
        System.out.println("Preparat per esborrar el contingut de llistaLinkedList que te " + comprovacioRendimentTmp.llistaLinkedList.size() + " elements.");
        comprovacioRendimentTmp.llistaLinkedList.clear();
        System.out.println("Esborrada. Ara llistaLinkedList te " + comprovacioRendimentTmp.llistaLinkedList.size() + " elements.");
        comprovacioRendimentTmp.llistaLinkedList.addAll(comprovacioRendimentTmp.llistaArrayList) ;
        System.out.println("Copiats els elements de llistaArrayList que ara te " + comprovacioRendimentTmp.llistaLinkedList.size() + " elements.");

        System.out.println("\n---- APARTAT 5.1 (bucle for) -----");
        for (Waypoint_Dades element : comprovacioRendimentTmp.llistaLinkedList) {
            if (element.getId() > 5) {
                element.setNom("Orbita de Mart");
                System.out.println("Modificat el waypoint amb id = " + element.getId());
            }
        }
        System.out.println("\n---- APARTAT 5.1 (bucle for) -----");
        for (int i = 0; i < comprovacioRendimentTmp.llistaArrayList.size(); i++) {
            System.out.println("El waypoint amb id = " + comprovacioRendimentTmp.llistaArrayList.get(i).getId()
                    + " te el nom = " + comprovacioRendimentTmp.llistaArrayList.get(i).getNom());
        }

        System.out.println("\n---- APARTAT 5.2 (Iterator) -----");

        it = comprovacioRendimentTmp.llistaArrayList.iterator();

        while (it.hasNext()) {
            Waypoint_Dades element = it.next();
            if (element.getId() < 5) {
                element.setNom("Punt Lagrange entre la Terra i la Lluna");
                System.out.println("Modificat el waypoint amb id = " + element.getId());
            }
        }
        System.out.println("\n---- APARTAT 5.2 (comprovacio) -----");

        it = comprovacioRendimentTmp.llistaArrayList.iterator();

        while (it.hasNext()) {
            Waypoint_Dades element = it.next();
            System.out.println("El waypoint amb id = " + element.getId() +
                    " te el nom = " + element.getNom());
        }

        return comprovacioRendimentTmp;
    }

    public static ComprovacioRendiment esborrarWaypoints(ComprovacioRendiment comprovacioRendimentTmp) {

        //BUCLE PER ESBORRAR IDS MENOR A 6 DE ARRAYLIST
        /*for(Waypoint_Dades element: comprovacioRendimentTmp.llistaArrayList){
            if(element.getId()<6){
                comprovacioRendimentTmp.llistaArrayList.remove(element);
            }
        }*/

        //NO ES POT BORRAR PERQUE ES UNA MODIFICACIO CONCURRENT
        //Y UN THREAD NO POT BORRAR QUAN UN ALTRE ESTÁ FENT UNA ITERACIO

        //BORRAR IDS MAJORS A 4 AMB ITERATOR A LINKED LIST

        Iterator<Waypoint_Dades> it = comprovacioRendimentTmp.llistaLinkedList.iterator();

        while (it.hasNext()) {
            Waypoint_Dades obj = it.next();
            if (obj.getId() > 4) {
                it.remove();
                System.out.println("Esborrat el waypoint amb id = " + obj.getId());
            }
        }

        System.out.println("---- APARTAT 2 (comprovacio) ----");
        for (Waypoint_Dades element : comprovacioRendimentTmp.llistaLinkedList) {
            System.out.println("El waypoint amb id = " + element.getId() +
                    " te el nom = " + element.getNom());
        }

        System.out.println("\n---- APARTAT 3 (listIterator) ----");
        ListIterator<Waypoint_Dades> li = comprovacioRendimentTmp.llistaLinkedList.listIterator();

        while (li.hasNext()) {
            Waypoint_Dades obj = li.next();
            if (obj.getId() == 2) {
                li.remove();
                System.out.println("Esborrat el waypoint amb id = " + obj.getId());
            }
        }

        System.out.println("\n---- APARTAT 3 (comprovacio) ----");
        // li = comprovacioRendimentTmp.llistaLinkedList.listIterator();
        //NO hay que volver a asignarle el listiterator, no funcionara

        while (li.hasPrevious()) {
            Waypoint_Dades obj = li.previous();
            System.out.println("El waypoint amb id = " + obj.getId() +
                    " te el nom = " + obj.getNom());
        }
        return comprovacioRendimentTmp;
    }

    public static void visualitzarWaypointsOrdenats(ComprovacioRendiment comprovacioRendimentTmp) {
        Collections.sort(comprovacioRendimentTmp.llistaArrayList);
        for (Waypoint_Dades waypoint : comprovacioRendimentTmp.llistaArrayList) {
            System.out.println(waypoint);
        }
    }

    public static ComprovacioRendiment modificarCoordenadesINomDeWaypoints(ComprovacioRendiment comprovacioRendimentTmp) {
       /* Aquest mètode ha de recórrer llistaArrayList i pels waypoints amb ID parell treure
       per pantalla elseu nom i coordenades i demanar-ne de nous.
       Per a insertar el nou nom al waypoint feu servir el seu setter.*/
        Scanner sc = new Scanner(System.in);
        Scanner coords = new Scanner(System.in).useDelimiter("\n");

        String newCoords = null;
        String arrayCoords;
        int[] intCoords;
        boolean three = false, coordsOk = false;
        Iterator<Waypoint_Dades> it = comprovacioRendimentTmp.llistaArrayList.iterator();

        while (it.hasNext()) {

            Waypoint_Dades waypoint_dades = it.next();

            if (waypoint_dades.getId() % 2 == 0) {
                System.out.println("------ Modificar el waypoint amb id = " + waypoint_dades.getId() + " ------");

                System.out.println("Nom actual:" + waypoint_dades.getNom());
                System.out.println("Nom nou:");
                waypoint_dades.setNom(sc.next());
                while (!coordsOk) {
                    three = false;
                    while (!three) {
                        System.out.println("Coordenades actuals: " + Arrays.toString(waypoint_dades.getCoordenades()));
                        System.out.println("Coordenades noves:");
                        newCoords = coords.nextLine();
                        if (newCoords.split(" ").length == 3) {
                            System.out.println("bien");
                            three = true;
                        } else {
                            System.out.println("ERROR: Introduir 3 parametres separats per 1 espai en blanc. Has introduit " +
                                    newCoords.split(" ").length + " parametres");
                            coords.next();
                        }

                        //System.out.println(Arrays.toString(arrayCoords));
                    }
                    intCoords = new int[]{0, 0, 0};
                    int pos = 0;
                    for (String coord : newCoords.split(" ")) {
                        if (Cadena.stringIsInt(coord)) {//si es int, guardar en nuevo array
                            intCoords[pos] = Integer.parseInt(coord);
                            pos++;
                        } else {
                            System.out.println("ERROR: coordenada " + coord + " no vàlida.");
                        }
                    }
                    if (pos == 3) {
                        waypoint_dades.setCoordenades(intCoords);
                        coordsOk = true;
                    }
                }

                //waypoint_dades.setCoordenades();
            }
        }
        return comprovacioRendimentTmp;
    }

    public static void waypointsACertaDistanciaMaxDeLaTerra(ComprovacioRendiment comprovacioRendimentTmp) {
        /*
        Scanner sc = new Scanner(System.in);
        String distMax;
        int dTerra;
        ArrayList<Waypoint_Dades> waypointsOrdenats = new ArrayList<Waypoint_Dades>();
        int dist = 0;


        System.out.print("Distància màxima de la Terra: ");
        distMax = sc.nextLine();
        while (Cadena.stringIsInt(distMax) == false) {
            System.out.println("ERROR: la distància màxima de la Terra " + distMax + " no és correcta.");

            System.out.print("Distància màxima de la Terra: ");
            distMax = sc.nextLine();
        }

        dTerra = Integer.parseInt(distMax);

        waypointsOrdenats.addAll(comprovacioRendimentTmp.llistaArrayList);

        Collections.sort(waypointsOrdenats);

        for (Waypoint_Dades waypointTmp : waypointsOrdenats) {
            dist = (int)Math.pow(waypointTmp.getCoordenades()[0], 2) + (int)Math.pow(waypointTmp.getCoordenades()[1], 2) + (int)Math.pow(waypointTmp.getCoordenades()[2], 2);

            if (dist <= dTerra) {
                System.out.println(waypointTmp);
            } else {
                break;
            }
        }*/
        Scanner sc = new Scanner(System.in);
        String distMax = null   ;
        List<Waypoint_Dades> newList = new ArrayList<>(comprovacioRendimentTmp.llistaArrayList);
        Collections.sort(newList);

        boolean ok = false;
        while (!ok){
            System.out.println("Distancia maxima de la Terra: ");
            distMax = sc.nextLine();
            if(Cadena.stringIsInt(distMax)){
                ok =true;
            }else {
                sc.next();
                System.out.println("No es un nombre, entra un nombre:");
            }
        }
        ok = false;
        int dist =0;
        int [] arrayCoords;
        for(Waypoint_Dades wp : newList){
            arrayCoords = wp.getCoordenades();
            dist =  (int)(Math.pow(arrayCoords[0],2) + Math.pow(arrayCoords[1],2) + Math.pow(arrayCoords[2],2));
            if(dist<=Integer.parseInt(distMax)){
                System.out.println(wp       );
            }else {
                break;
            }
        }
    }


}
