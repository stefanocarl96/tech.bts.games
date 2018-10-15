package tech.bts.games.games;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        tech.bts.games.games.Game game1 = new tech.bts.games.games.Game("Chess",2, 20.0 );
        tech.bts.games.games.Game game2 = new tech.bts.games.games.Game("Domino",2, 10.0 );
        tech.bts.games.games.Game game3 = new tech.bts.games.games.Game("Parchis",4, 15.0 );

        List<tech.bts.games.games.Game> games = Arrays.asList(game1, game2, game3);

        for (tech.bts.games.games.Game game : games ) {
            System.out.println(game.getName() + ", " + game.getNumPlayers() + " players, " + game.getPrice() + "$");
        }
    }

}