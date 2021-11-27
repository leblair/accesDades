import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Top5 {

    static String file = "C:\\Users\\focus\\OneDrive\\Documentos\\Top5\\top5.txt";

    public static void main(String[] args) throws IOException {
        BufferedReader br = Files.newBufferedReader(Paths.get(file));
        Scanner sc = new Scanner(System.in);

        List<Player> players = readPlayers(br);

        String name = "James Gosling";
        int score = 300;
        String name2 = "Anders Hejlsberg";
        int score2 = 500;
        String name3 = "Chris Lattner";
        int score3 = 400;
        String name4 = "Brendan Eich";
        int score4 = 200;
        String name5 = "Bjarne Stroustrup";
        int score5 = 600;
        String name6 = "Guido van Rossum" ;
        int score6 = 100;

        players.add(new Player(name, score));
        players.add(new Player(name2, score2));
        players.add(new Player(name3, score3));
        players.add(new Player(name4, score4));
        players.add(new Player(name5, score5));
        players.add(new Player(name6, score6));

        writePlayers(file, players);
        br = Files.newBufferedReader(Paths.get(file));
        players = readPlayers(br);
        top5(players);

    }

    private static List<Player> readPlayers(BufferedReader br) throws IOException {
        String line = null;
        List<Player> players = new ArrayList<>();

        while ((line = br.readLine()) != null) {
            if(br.readLine() ==null){
                break;
            }
            String[] values = line.split(":");
            String name = values[0];
            String point = values[1];
            Player player = new Player(name, Integer.parseInt(point));
            players.add(player);
        }
        br.close();

        return players;
    }

    private static void writePlayers(String file, List<Player> players) throws IOException {
        List<String> lineas = new ArrayList<>();

        players = players.stream()
                .sorted(Comparator.comparing(Player::getPlayerPoint).reversed())
                .limit(5)
                .collect(Collectors.toList());

        for (Player player : players) {
            String linea = player.getPlayerName() + ":" + player.playerPoint;
            lineas.add(linea);
        }
        Files.write(Paths.get(file), lineas);
    }

    private static void top5(List<Player> players) {
        System.out.println("*** TOP 5 SCORE ***");
        for (int i = 0; i < players.size(); i++) {
            System.out.println(players.get(i));
        }
    }
}