package uk.minersonline.java_college.activity15;

import java.util.Scanner;

public class Activity15Main {
    private static Action doCommand(Player player) {
        Scanner scanner = new Scanner(System.in);
        boolean validCommand = false;
        Action action = null;
        while (!validCommand) {
            String command = scanner.nextLine();
            if (command.equals("p")) {
                validCommand = true;
                action = player.punch();
            } else if (command.equals("k")) {
                validCommand = true;
                action = player.kick();
            }

            if (!validCommand) {
                System.out.println("Invalid command \"" + command + "\"");
                System.out.println("You can enter the following commands:");
                System.out.println("1. \"p\" for punching.");
                System.out.println("2. \"k\" for kicking.");
            }
        }
        return action;
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
        Action action = null;

        while (!won) {
            Player currentPlayer = players[turn];
            if (action != null) {
                currentPlayer.calculateAction(action);
                won = checkWin(action.getSender(), currentPlayer);
            }
            if (!won) {
                System.out.println("It is "+currentPlayer.getName()+"'s turn.");
                System.out.println("You can enter the following commands:");
                System.out.println("1. \"p\" for punching.");
                System.out.println("2. \"k\" for kicking.");

                action = doCommand(currentPlayer);
                turn = 1 - turn;
            }
        }
    }
}
