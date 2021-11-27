package Exercicis_List_part_1;

import Llibreries.Varies.Cadena;
import Llibreries.Varies.Data;

import java.time.LocalDateTime;
import java.util.*;

public class Ruta {
    public static List<Waypoint_Dades> crearRutaInicial() {
        List<Waypoint_Dades> llistaWaypointLinkedList = null;
        llistaWaypointLinkedList = new LinkedList<Waypoint_Dades>();
        llistaWaypointLinkedList.add(new Waypoint_Dades(0, "Òrbita de la Terra", new int[] {0,0,0}, true, LocalDateTime.parse("21-10-2020 01:10", Data.formatter), LocalDateTime.parse("25-10-2020 00:30", Data.formatter), LocalDateTime.parse("22-10-2020 23:55", Data.formatter)));
        llistaWaypointLinkedList.add(new Waypoint_Dades(1, "Punt Lagrange Terra-LLuna", new int[] {1,1,1}, true, LocalDateTime.parse("21-10-2020 01:00", Data.formatter), LocalDateTime.parse("25-10-2020 00:30", Data.formatter), LocalDateTime.parse("22-10-2020 23:55", Data.formatter)));
        llistaWaypointLinkedList.add(new Waypoint_Dades(2, "Òrbita de la LLuna", new int[] {2,2,2}, true, LocalDateTime.parse("21-10-2020 00:50", Data.formatter), LocalDateTime.parse("25-10-2020 00:30", Data.formatter), LocalDateTime.parse("22-10-2020 23:55", Data.formatter)));
        llistaWaypointLinkedList.add(new Waypoint_Dades(3, "Òrbita de Mart", new int[] {3,3,3}, true, LocalDateTime.parse("21-10-2020 00:40", Data.formatter), LocalDateTime.parse("25-10-2020 00:30", Data.formatter), LocalDateTime.parse("22-10-2020 23:55", Data.formatter)));
        llistaWaypointLinkedList.add(new Waypoint_Dades(4, "Òrbita de Júpiter", new int[] {4,4,4}, true, LocalDateTime.parse("21-10-2020 00:30", Data.formatter), LocalDateTime.parse("25-10-2020 00:30", Data.formatter), LocalDateTime.parse("22-10-2020 23:55", Data.formatter)));
        llistaWaypointLinkedList.add(new Waypoint_Dades(5, "Punt Lagrange Júpiter-Europa", new int[] {5,5,5}, true, LocalDateTime.parse("21-10-2020 00:20", Data.formatter), LocalDateTime.parse("25-10-2020 00:30", Data.formatter), LocalDateTime.parse("22-10-2020 23:55", Data.formatter)));
        llistaWaypointLinkedList.add(new Waypoint_Dades(6, "Òrbita de Europa", new int[] {6,6,6}, true, LocalDateTime.parse("21-10-2020 00:10", Data.formatter), LocalDateTime.parse("25-10-2020 00:30", Data.formatter), LocalDateTime.parse("22-10-2020 23:55", Data.formatter)));
        llistaWaypointLinkedList.add(new Waypoint_Dades(7, "Òrbita de Venus", new int[] {7,7,7}, true, LocalDateTime.parse("21-10-2020 00:01", Data.formatter), LocalDateTime.parse("25-10-2020 00:30", Data.formatter), LocalDateTime.parse("22-10-2020 23:55", Data.formatter)));
        return llistaWaypointLinkedList;
    }

    public static ComprovacioRendiment inicialitzarRuta(ComprovacioRendiment comprovacioRendimentTmp) {
        List<Waypoint_Dades> llistaWaypointLinkedList;
        Waypoint_Dades wtmp;
        llistaWaypointLinkedList = crearRutaInicial();

        for (Waypoint_Dades waypointTmp : llistaWaypointLinkedList) {
            comprovacioRendimentTmp.pilaWaypoints.push(waypointTmp);
        }

        wtmp = new Waypoint_Dades(4, "Òrbita de Júpiter REPETIDA", new int[] {4,4,4}, true, LocalDateTime.parse("21-10-2020 00:30", Data.formatter), LocalDateTime.parse("25-10-2020 00:30", Data.formatter), LocalDateTime.parse("22-10-2020 23:55", Data.formatter));
        comprovacioRendimentTmp.pilaWaypoints.addFirst(wtmp);
        comprovacioRendimentTmp.wtmp = wtmp;

        return comprovacioRendimentTmp;
    }

    public static void visualitzarRuta(ComprovacioRendiment comprovacioRendimentTmp){

        System.out.println("La ruta està formada pels waypoints:");

        for (Waypoint_Dades waypointTmp : comprovacioRendimentTmp.pilaWaypoints) {
            System.out.println(waypointTmp.toString());
        }
    }

    public static void invertirRuta(ComprovacioRendiment comprovacioRendimentTmp){
        Deque<Waypoint_Dades> pilaWaypointsInversa = new ArrayDeque<Waypoint_Dades>();

        while (!comprovacioRendimentTmp.pilaWaypoints.isEmpty()) {
            pilaWaypointsInversa.push(comprovacioRendimentTmp.pilaWaypoints.pop());

        }

        while (!pilaWaypointsInversa.isEmpty()) {
            System.out.println(pilaWaypointsInversa.pop());
        }
    }
    public static ComprovacioRendiment inicialitzaLListaRutes(ComprovacioRendiment comprovacioRendimentTmp) {
        Ruta_Dades ruta_0;
        Ruta_Dades ruta_1;
        Ruta_Dades ruta_2;
        Ruta_Dades ruta_3;
        Ruta_Dades ruta_4;


        ruta_0 = new Ruta_Dades(0, "ruta 0: Terra --> Punt Lagrange Júpiter-Europa", new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5)), true, LocalDateTime.parse("28-10-2020 16:30", Data.formatter), null, LocalDateTime.parse("28-10-2020 16:30", Data.formatter));
        ruta_1 = new Ruta_Dades(1, "ruta 1: Terra --> Òrbita de Mart (directe)", new ArrayList<Integer>(Arrays.asList(0, 3)), true, LocalDateTime.parse("28-10-2020 16:31", Data.formatter), null, LocalDateTime.parse("28-10-2020 16:31", Data.formatter));
        ruta_2 = new Ruta_Dades(2, "ruta 2.1: Terra --> Òrbita de Venus", new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7)), true, LocalDateTime.parse("28-10-2020 16:32", Data.formatter), null, LocalDateTime.parse("28-10-2020 16:32", Data.formatter));
        ruta_3 = new Ruta_Dades(3, "ruta 3: Terra --> Mart (directe) --> Òrbita de Júpiter ", new ArrayList<Integer>(Arrays.asList(0, 3, 4)), true, LocalDateTime.parse("28-10-2020 16:33", Data.formatter), null, LocalDateTime.parse("28-10-2020 16:33", Data.formatter));
        ruta_4 = new Ruta_Dades(4, "ruta 2.2: Terra --> Òrbita de Venus (REPETIDA)", new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7)), true, LocalDateTime.parse("28-10-2020 16:32", Data.formatter), null, LocalDateTime.parse("30-10-2020 19:49", Data.formatter));

        comprovacioRendimentTmp.llistaRutes.add(ruta_0);
        comprovacioRendimentTmp.llistaRutes.add(ruta_1);
        comprovacioRendimentTmp.llistaRutes.add(ruta_2);
        comprovacioRendimentTmp.llistaRutes.add(ruta_3);
        comprovacioRendimentTmp.llistaRutes.add(ruta_4);

        System.out.println("Insertades les rutes:");
        for(Ruta_Dades rutaTmp : comprovacioRendimentTmp.llistaRutes) {
            System.out.println(rutaTmp.getNom() + ": waypoints" + rutaTmp.getWaypoints());
        }

        return comprovacioRendimentTmp;
    }


    //30
    public static void crearLinkedHashMapDeRutes (ComprovacioRendiment comprovacioRendimentTmp) {
        long tempsInicial;
        long tempsFinal;
        int temps1aForma;
        int temps2aForma;
        int temps3aForma;
        LinkedHashMap<Integer, Ruta_Dades> mapaLinkedDeRutes;
        int clauDelMap;
        mapaLinkedDeRutes = new LinkedHashMap<Integer, Ruta_Dades>();
        for(Ruta_Dades rutaTmp : comprovacioRendimentTmp.llistaRutes) {
            mapaLinkedDeRutes.put(rutaTmp.getId(), rutaTmp);
        }
        tempsInicial = System.nanoTime();
        Set setTmp = mapaLinkedDeRutes.entrySet();
        Iterator it1 = setTmp.iterator();
        System.out.println("1a forma de visualitzar el contingut del map (map --> set + iterador del set):");
        while(it1.hasNext()) {
            Map.Entry me = (Map.Entry)it1.next();
            System.out.println("Clau del map = " + me.getKey() + ": \n" + me.getValue().toString());
        }
        tempsFinal = System.nanoTime();
        temps1aForma = (int)((tempsFinal - tempsInicial)/1000);
        tempsInicial = System.nanoTime();
        System.out.println();
        System.out.println("2a forma de visualitzar el contingut del map (iterator de les claus del map):");
        Iterator<Integer> it2 = mapaLinkedDeRutes.keySet().iterator();
        while (it2.hasNext()) {
            clauDelMap = it2.next();
            System.out.println(clauDelMap + ": " + mapaLinkedDeRutes.get(clauDelMap));
        }
        tempsFinal = System.nanoTime();
        temps2aForma = (int)((tempsFinal - tempsInicial)/1000);
        tempsInicial = System.nanoTime();
        System.out.println();
        System.out.println("3a forma de visualitzar el contingut del map (for-each del map --> set):");
        for (Map.Entry<Integer, Ruta_Dades> dada : mapaLinkedDeRutes.entrySet()) {
            System.out.println(dada.getKey() + ": " + dada.getValue().toString());
        }
        tempsFinal = System.nanoTime();
        temps3aForma = (int)((tempsFinal - tempsInicial)/1000);
        System.out.println();
        System.out.println("TEMPS PER 1a FORMA (map --> set + iterador del set): " + temps1aForma);
        System.out.println("TEMPS PER 2a FORMA (iterator de les claus del map): " + temps2aForma);
        System.out.println("TEMPS PER 3a FORMA (for-each del map --> set): " + temps3aForma);
        comprovacioRendimentTmp.mapaLinkedDeRutes.putAll(mapaLinkedDeRutes);

    }

    public static void visualitzarRutesDelMapAmbUnWaypointConcret(ComprovacioRendiment comprovacioRendimentTmp) {
        boolean existeixenErrors;
        Scanner sc = new Scanner(System.in);
        String entradaPerTeclat = "";
        int waypointABuscar = -1;
        Ruta_Dades rutaTmp;
        do {
            existeixenErrors = false;
            System.out.print("Escriu el nº del waypoint que vols buscar: ");
            entradaPerTeclat = sc.nextLine();
            if (Cadena.stringIsInt(entradaPerTeclat)) {
                waypointABuscar = Integer.parseInt(entradaPerTeclat);
            } else {
                System.out.println("ERROR: has introduit " + entradaPerTeclat + " com a ruta. Els ID de les rutes són integers.");
                existeixenErrors = true;
            }
        } while (existeixenErrors);

        System.out.println("RUTES QUE CONTENEN EL WAYPOINT "+ entradaPerTeclat + ":");

        Set setTmp = comprovacioRendimentTmp.mapaLinkedDeRutes.entrySet();
        Iterator it1 = setTmp.iterator();
        while(it1.hasNext()) {
            Map.Entry me = (Map.Entry)it1.next();
            rutaTmp = (Ruta_Dades)me.getValue();
            if (rutaTmp.getWaypoints().contains(waypointABuscar)) {
                System.out.println(rutaTmp);
            }
        }
    }

    public static void esborrarRutesDelMapAmbUnWaypointConcret(ComprovacioRendiment comprovacioRendimentTmp) {
        boolean existeixenErrors;
        Scanner sc = new Scanner(System.in);
        String entradaPerTeclat = "";
        int waypointABuscar = -1;
        Ruta_Dades rutaTmp;
        do {
            existeixenErrors = false;

            System.out.print("Escriu el nº del waypoint que vols buscar: ");
            entradaPerTeclat = sc.nextLine();

            if (Cadena.stringIsInt(entradaPerTeclat)) {
                waypointABuscar = Integer.parseInt(entradaPerTeclat);
            } else {
                System.out.println("ERROR: has introduit " + entradaPerTeclat + " com a waypoint. Els ID dels waypoints són integers.");
                existeixenErrors = true;
            }
        } while (existeixenErrors);

        System.out.println("RUTES ESBORRADES QUE CONTENEN EL WAYPOINT "+ entradaPerTeclat + ":");

        Set setTmp = comprovacioRendimentTmp.mapaLinkedDeRutes.entrySet();
        Iterator it1 = setTmp.iterator();
        while(it1.hasNext()) {
            Map.Entry me = (Map.Entry)it1.next();

            rutaTmp = (Ruta_Dades)me.getValue();

            if (rutaTmp.getWaypoints().contains(waypointABuscar)) {
                System.out.println(rutaTmp);
                it1.remove();
            }
        }
    }

    public static void visualitzarUnaRutaDelMap(ComprovacioRendiment comprovacioRendimentTmp) {
        boolean existeixenErrors;
        Scanner sc = new Scanner(System.in);
        String entradaPerTeclat = "";
        int rutaABuscar = -1;
        do {
            existeixenErrors = false;

            System.out.print("Escriu el ID de la ruta que vols buscar: ");
            entradaPerTeclat = sc.nextLine();

            if (Cadena.stringIsInt(entradaPerTeclat)) {
                rutaABuscar = Integer.parseInt(entradaPerTeclat);
            } else {
                System.out.println("ERROR: has introduit " + entradaPerTeclat + " com a ruta. Els ID de les rutes són integers.");
                existeixenErrors = true;
            }
        } while (existeixenErrors);

        if (comprovacioRendimentTmp.mapaLinkedDeRutes.containsKey(rutaABuscar)) {
            System.out.println(comprovacioRendimentTmp.mapaLinkedDeRutes.get(rutaABuscar));
        }
    }

    public static void ordenarRutesMapPerID(ComprovacioRendiment comprovacioRendimentTmp) {
        SortedMap<Integer, Ruta_Dades> mapaTreeRutes = new TreeMap<Integer, Ruta_Dades>();
        mapaTreeRutes.putAll(comprovacioRendimentTmp.mapaLinkedDeRutes);

        for (Map.Entry<Integer, Ruta_Dades> dada : mapaTreeRutes.entrySet()) {
            System.out.println(dada.getKey() + ": " + dada.getValue().toString());
        }
    }

    public static void ordenarRutesMapPerWaypointsAndID(ComprovacioRendiment comprovacioRendimentTmp) {
        SortedMap<Integer, Ruta_Dades> mapaTreeRutes;
        mapaTreeRutes = new TreeMap((comprovacioRendimentTmp.mapaLinkedDeRutes));
        mapaTreeRutes.putAll(comprovacioRendimentTmp.mapaLinkedDeRutes);
        for (Map.Entry<Integer, Ruta_Dades> dada : mapaTreeRutes.entrySet()) {
            System.out.println(dada.getKey() + ": " + dada.getValue().toString());
        }
    }

}
