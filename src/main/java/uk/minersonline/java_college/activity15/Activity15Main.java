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
        Player[] players = new Player[2];

        System.out.print("Enter name for player 1> ");
        String name1 = scanner.nextLine();
        players[0] = new Player(name1);

        System.out.print("Enter name for player 2> ");
        String name2 = scanner.nextLine();
        players[1] = new Player(name2);

        boolean won = false;
        int turn = 0;

        while (!won) {
            Player currentPlayer = players[turn];
            System.out.println("It is "+currentPlayer.getName()+"'s turn.");
            System.out.println("You can enter the following commands:");
            System.out.println("1. \"p\" for punching.");
            System.out.println("2. \"k\" for kicking.");

            int next = turn + 1;
            if (next >= players.length) {
                next = 0;
            }

            doCommand(currentPlayer, players[next]);
            won = checkWin(currentPlayer, players[next]);

            if (!won) {
                turn = 1 - turn;
            }
        }
    }
}
