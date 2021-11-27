package Exercicis_List_part_1;

import java.util.*;

public class ComprovacioRendiment {
    int[] coordenadesTmp = null;
    List<Waypoint_Dades> llistaArrayList;
    List<Waypoint_Dades> llistaLinkedList;

    Waypoint_Dades wtmp;
    public Deque<Waypoint_Dades> pilaWaypoints;
    public ArrayList<Ruta_Dades> llistaRutes;

    public LinkedHashMap<Integer, Ruta_Dades> mapaLinkedDeRutes;


    public ComprovacioRendiment() {
        this.coordenadesTmp = new int[]{0, 0, 0};
        this.llistaArrayList = new ArrayList<Waypoint_Dades>();
        this.llistaLinkedList = new LinkedList<Waypoint_Dades>();
        this.wtmp = null;
        this.pilaWaypoints = new ArrayDeque<>();
        this.llistaRutes = new ArrayList<Ruta_Dades>();
        this.mapaLinkedDeRutes = new LinkedHashMap<Integer, Ruta_Dades>();
    }

}
