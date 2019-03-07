package ir.hamidvand.Shooting;

import java.util.Scanner;
import static java.lang.System.in;

public class Operation {
    public static void main(String[] args) {

        WarTeamManagement operation = new WarTeamManagement();
        operation.startOperation();

        while (operation.getTestResult() >= 60) {
            reapeat();
        }
    }

    private static void reapeat() {
        Scanner scanner = new Scanner(in);
        System.out.println("The result is not desired");
        System.out.println("*************************");
        System.out.println("Do you want to repeat the operation? yes  or no");
        String response = scanner.next();
        WarTeamManagement operation = new WarTeamManagement();
        if (response.equals("yes")) {
            System.out.println("New Operation \n");
            operation.startOperation();
        } else {
            System.out.println("You cancel");
            System.exit(0);
        }
    }
}



