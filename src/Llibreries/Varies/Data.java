package Llibreries.Varies;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Data {
    public static DateTimeFormatter formatter =DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

    //DateTimeFormatter fechaVar = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        public static DateTimeFormatter fecha() {
            DateTimeFormatter fecha = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
            return fecha;
        }

        public static String imprimirData(LocalDateTime dataTmp) {
            if(!(dataTmp==null)) {return fecha().format(dataTmp);}
            else {return "NULL";}
        }



    }

