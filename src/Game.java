import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner player1 = new Scanner(System.in);
        Scanner player2 = new Scanner(System.in);

        // cere de la user1 un caracter (R, S, P)
        // cere de la user2 un caracter (R, S, P)
        // daca user 1 are R si user 2 are P, user 2 castiga
        // optional: daca vreunul dintre useri introduce altceva in afara de "R, S, P", sa se afiseze o eroare
        // commit - salvare locala
        // push - urcarea proiectului pe platforma


        while (true) {

            System.out.println("Player1, please introduce a character: ");
            char player1Caracter = player1.next().charAt(0);

            System.out.println("Player2, please introduce a character: ");
            char player2Caracter = player2.next().charAt(0);
            if (player1Caracter == player2Caracter) {
                System.out.println("equal, keep playing!");
            } else if (player1Caracter == 'R' && player2Caracter == 'P') {
                System.out.println("player2 wins!");
                break;
            } else if (player1Caracter == 'S' && player2Caracter == 'P') {
                System.out.println("player1 wins!");
                break;
            } else if (player1Caracter == 'P' && player2Caracter == 'S') {
                System.out.println("player2 wins!");
                break;
            } else if (player1Caracter == 'P' && player2Caracter == 'R') {
                System.out.println("player1 wins!");
                break;
            } else if (player1Caracter == 'S' && player2Caracter == 'R') {
                System.out.println("player2 wins!");
                break;
            } else if (player1Caracter == 'R' && player2Caracter == 'S') {
                System.out.println("player1 wins!");
                break;
            } else {
                System.out.println("Invalid input!");
            }
        }

    }
}
