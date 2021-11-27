package Exercicis_List_part_1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;

public class Ruta_Dades {

    private int id;
    private String nom;
    private ArrayList<Integer> waypoints;

    private boolean actiu;
    private LocalDateTime dataCreacio;
    private LocalDateTime dataAnulacio;
    private LocalDateTime dataModificacio;

    public Ruta_Dades(int id, String nom, ArrayList<Integer> waypoints, boolean actiu, LocalDateTime dataCreacio, LocalDateTime dataAnulacio, LocalDateTime dataModificacio) {
        this.id = id;
        this.nom = nom;
        this.waypoints = waypoints;
        this.actiu = actiu;
        this.dataCreacio = dataCreacio;
        this.dataAnulacio = dataAnulacio;
        this.dataModificacio = dataModificacio;
    }
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public boolean isActiu() {
        return actiu;
    }

    public LocalDateTime getDataCreacio() {
        return dataCreacio;
    }

    public ArrayList<Integer> getWaypoints() {
        return waypoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ruta_Dades that = (Ruta_Dades) o;
        return nom.equals(that.nom) &&
                waypoints.equals(that.waypoints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, waypoints);
    }

    @Override
    public String toString() {
        return "Ruta_Dades{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", waypoints=" + waypoints +
                ", actiu=" + actiu +
                ", dataCreacio=" + dataCreacio +
                ", dataAnulacio=" + dataAnulacio +
                ", dataModificacio=" + dataModificacio +
                '}';
    }
}
