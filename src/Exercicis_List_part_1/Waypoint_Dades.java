package Exercicis_List_part_1;

import java.text.Collator;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class Waypoint_Dades implements  Comparable{

    private int id;
    private String nom;
    private int[] coordenades;
    private boolean actiu;

    private LocalDateTime dataCreacio;
    private LocalDateTime dataAnulacio;
    private LocalDateTime dataModificacio;

    public Waypoint_Dades(int id, String nom, int[] coordenades, boolean actiu, LocalDateTime dataCreacio, LocalDateTime dataAnulacio, LocalDateTime dataModificacio) {
        this.id = id;
        this.nom = nom;
        this.coordenades = coordenades;
        this.actiu = actiu;
        this.dataCreacio = dataCreacio;
        this.dataAnulacio = dataAnulacio;
        this.dataModificacio = dataModificacio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int[] getCoordenades() {
        return coordenades;
    }

    public void setCoordenades(int[] coordenades) {
        this.coordenades = coordenades;
    }

    public boolean isActiu() {
        return actiu;
    }

    public void setActiu(boolean actiu) {
        this.actiu = actiu;
    }

    public LocalDateTime getDataCreacio() {
        return dataCreacio;
    }

    public void setDataCreacio(LocalDateTime dataCreacio) {
        this.dataCreacio = dataCreacio;
    }

    public LocalDateTime getDataAnulacio() {
        return dataAnulacio;
    }

    public void setDataAnulacio(LocalDateTime dataAnulacio) {
        this.dataAnulacio = dataAnulacio;
    }

    public LocalDateTime getDataModificacio() {
        return dataModificacio;
    }

    public void setDataModificacio(LocalDateTime dataModificacio) {
        this.dataModificacio = dataModificacio;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Waypoint_Dades that = (Waypoint_Dades) o;
        return Objects.equals(nom, that.nom) && Arrays.equals(coordenades, that.coordenades);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nom);
        result = 31 * result + Arrays.hashCode(coordenades);
        return result;
    }

    @Override
    public String toString() {
        int total =0;
        for(int coord : coordenades){
            total += Math.pow(coord,2);
        }
        return "WAYPOINT " + id + ":\n" +
                "nom = " + nom + "\n" +
                "coordenades(x,y,z) = " + Arrays.toString(coordenades) +
                 " (distancia) = (" + total + ")"+  "\n" +
                "actiu = " + actiu + "\n" +
                "dataCreacio = " + dataCreacio + "\n" +
                "dataAnulacio = " + dataAnulacio + "\n" +
                "dataModificacio = " + dataModificacio;
    }


    @Override
    public int compareTo(Object o) {
        Waypoint_Dades waypoint_dades = (Waypoint_Dades) o;
        if(waypoint_dades.coordenades[0]==this.coordenades[0] &&
                waypoint_dades.coordenades[1]==this.coordenades[1] &&
                waypoint_dades.coordenades[2]==this.coordenades[2]){

            Collator comparador = Collator.getInstance();
            comparador.setStrength(Collator.TERTIARY);
            return comparador.compare(waypoint_dades.nom,this.nom);

        }else {
            int dist1 = (int) (Math.pow(waypoint_dades.getCoordenades()[0], 2)
                    + Math.pow(waypoint_dades.getCoordenades()[1], 2)
                    + Math.pow(waypoint_dades.getCoordenades()[2], 2));
            int dist2 = (int) (Math.pow(this.getCoordenades()[0], 2)
                    + Math.pow(this.getCoordenades()[1], 2)
                    + Math.pow(this.getCoordenades()[2], 2));
            return (dist1 < dist2 ? -1 : 1);
        }
    }
}
