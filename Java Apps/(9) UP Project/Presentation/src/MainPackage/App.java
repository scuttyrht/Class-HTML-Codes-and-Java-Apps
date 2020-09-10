package MainPackage;

import java.util.Scanner;
import MethodPackage.Methods;

public class App extends Methods {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        Methods m = new Methods();

        prln("Welcome to UP RPL! What would you like to order?\n");
        
        Boolean retry = true;

        while (retry == true) {
            prln("\n\nID\tObject\t\tPrice\t\tStock" + 
            "\nA1\tBallpoint\tRp " + m.getBallpointPrice() + "\t" + m.getBallpointStock() +
            "\nA2\tPencil\t\tRp " + m.getPencilPrice() + "\t" + m.getPencilStock() + 
            "\nA3\tEraser\t\tRp " + m.getEraserPrice() + "\t" + m.getEraserStock() + "\n" + 
            "----------------------------------------------");
            pr("Enter Object ID: ");
            String choice = read.next();

            if (choice.equals("A1")) {
                pr("How much Ballpoints would you like to buy? ");
                int qty = read.nextInt();

                if (qty > m.getBallpointStock()) {
                    pr("Sorry, but we currently have " + m.getBallpointStock() + " Ballpoints");
                    continue;
                } else {
                    m.setBallpointStock(m.getBallpointStock() - qty);
                    m.setTotalPrice(m.getTotalPrice() + (m.getBallpointPrice() * qty));
                    pr(qty + " Ballpoints have been added to your cart!\nTotal Price: Rp " + m.getTotalPrice() + 
                    "\nWould you like to order more? (Y/N) ");
                    String answer = read.next();

                    if (answer.equals("Y") || answer.equals("y")) {
                        continue;
                    } else {
                        prln("\nThanks for shopping!");
                        retry = false;
                        break;
                    }
                }
            }

            if (choice.equals("A2")) {
                pr("How much Pencil would you like to buy? ");
                int qty = read.nextInt();

                if (qty > m.getPencilStock()) {
                    pr("Sorry, but we currently have " + m.getPencilStock() + " Pencils");
                    continue;
                } else {
                    m.setPencilStock(m.getPencilStock() - qty);
                    m.setTotalPrice(m.getTotalPrice() + (m.getPencilPrice() * qty));
                    pr(qty + " Pencil have been added to your cart!\nTotal Price: Rp " + m.getTotalPrice() + 
                    "\nWould you like to order more? (Y/N) ");
                    String answer = read.next();

                    if (answer.equals("Y") || answer.equals("y")) {
                        continue;
                    } else {
                        prln("\nThanks for shopping!");
                        retry = false;
                        break;
                    }
                }
            }

            if (choice.equals("A3")) {
                pr("How much Eraser would you like to buy? ");
                int qty = read.nextInt();

                if (qty > m.getEraserStock()) {
                    pr("Sorry, but we currently have " + m.getEraserStock() + " Erasers");
                    continue;
                } else {
                    m.setEraserStock(m.getEraserStock() - qty);
                    m.setTotalPrice(m.getTotalPrice() + (m.getEraserPrice() * qty));
                    pr(qty + " Eraser have been added to your cart!\nTotal Price: Rp " + m.getTotalPrice() + 
                    "\nWould you like to order more? (Y/N) ");
                    String answer = read.next();

                    if (answer.equals("Y") || answer.equals("y")) {
                        continue;
                    } else {
                        prln("\nThanks for shopping!");
                        retry = false;
                        break;
                    }
                }
            }

            else {
                pr("Please enter an available ID");
                continue;
            }
        }

        read.close();
    }
}
