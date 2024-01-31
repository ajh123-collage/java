package uk.minersonline.java_college.activity15;

import java.util.Scanner;

public class Activity15Main {
    private static void doCommand(Player player, Player other) {
        Scanner scanner = new Scanner(System.in);
        boolean validCommand = false;
        while (!validCommand) {
            String command = scanner.nextLine();
            if (command.equals("p")) {
                validCommand = true;
                player.punch(other);
            } else if (command.equals("k")) {
                validCommand = true;
                player.kick(other);
            }

            if (!validCommand) {
                System.out.println("Invalid command \"" + command + "\"");
                System.out.println("You can enter the following commands:");
                System.out.println("1. \"p\" for punching.");
                System.out.println("2. \"k\" for kicking.");
            }

            System.out.println(other.getName()+" now has "+other.getHealth()+" health.");
            System.out.println(player.getName()+" has "+player.getHealth()+" health.");
        }
    }

    private static boolean checkWin(Player player, Player other) {
        if (other.getHealth() <= 0) {
            System.out.println(player.getName() + " has won the game!");
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name for player 1> ");
        String name1 = scanner.nextLine();
        Player player1 = new Player(name1);

        System.out.println("Enter name for player 2> ");
        String name2 = scanner.nextLine();
        Player player2 = new Player(name2);

        Player currentPlayer = player1;
        Player nextPlayer = player2;
        boolean won = false;

        while (!won) {
            System.out.println("It is "+currentPlayer.getName()+"'s turn.");
            System.out.println("You can enter the following commands:");
            System.out.println("1. \"p\" for punching.");
            System.out.println("2. \"k\" for kicking.");

            doCommand(currentPlayer, nextPlayer);
            won = checkWin(currentPlayer, nextPlayer);

            if (!won) {
                if (currentPlayer == player1) {
                    currentPlayer = player2;
                    nextPlayer = player1;
                } else {
                    currentPlayer = player1;
                    nextPlayer = player2;
                }
            }
        }
    }
}
