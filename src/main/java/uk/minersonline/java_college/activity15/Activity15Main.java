package uk.minersonline.java_college.activity15;

import java.util.Scanner;

public class Activity15Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name for player 1> ");
        String name1 = scanner.nextLine();
        Player player1 = new Player(name1);

        System.out.println("Enter name for player 2> ");
        String name2 = scanner.nextLine();
        Player player2 = new Player(name2);

        int currentPlayer = 1;
        boolean won = false;

        while (!won) {
            // <great>
            String currentName = "";
            if (currentPlayer == 1) {
                currentName = player1.getName();
            } else {
                currentName = player2.getName();
            }

            System.out.println("It is "+currentName+"'s turn.");
            System.out.println("You can enter the following commands:");
            System.out.println("1. \"p\" for punching.");
            System.out.println("2. \"k\" for kicking.");
            // </great>

            // <command detection>
            boolean validCommand = false;
            while (!validCommand) {
                String command = scanner.nextLine();
                if (currentPlayer == 1) {
                    if (command.equals("p")) {
                        validCommand = true;
                        player1.punch(player2);
                    } else if (command.equals("k")) {
                        validCommand = true;
                        player1.kick(player2);
                    }
                } else {
                    if (command.equals("p")) {
                        validCommand = true;
                        player2.punch(player1);
                    } else if (command.equals("k")) {
                        validCommand = true;
                        player2.kick(player1);
                    }
                }
                if (!validCommand) {
                    System.out.println("Invalid command \"" + command + "\"");
                    System.out.println("You can enter the following commands:");
                    System.out.println("1. \"p\" for punching.");
                    System.out.println("2. \"k\" for kicking.");
                }

                if (currentPlayer == 1) {
                    System.out.println(player2.getName()+" now has "+player2.getHealth()+" health.");
                } else {
                    System.out.println(player1.getName()+" now has "+player1.getHealth()+" health.");
                }
            }
            // </command detection>

            // <wim detection>
            if (currentPlayer == 1) {
                if (player2.getHealth() < 0) {
                    System.out.println(player1.getName() + " has won the game!");
                    won = true;
                }
            } else {
                if (player1.getHealth() < 0) {
                    System.out.println(player2.getName() + " has won the game!");
                    won = true;
                }
            }
            // </win detection>

            // <next turn>
            if (!won) {
                if (currentPlayer == 1) {
                    currentPlayer = 2;
                } else {
                    currentPlayer = 1;
                }
            }
            // </next turn>
        }
    }
}
