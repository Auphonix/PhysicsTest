package ShapeCreationTest;

import com.sun.java.swing.action.ExitAction;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Scanner;

/**
 * Created by Danyon on 10/06/2016.
 */
public class Game extends Spawn{

    //Create scanner
    private static Scanner scanner = new Scanner(System.in);

    //Create new frame
    Frame gameFrame;

    public Game() {
        //Create new frame object
        gameFrame = new Frame();
        //Set mouse listener on frame.
        gameFrame.getFrame().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {
                int getX = e.getX();
                int getY = e.getY();
                createCircleAtMouse(gameFrame.getGraphics(), getX, getY);
            }

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        });

        //menuOption variable
        int menuOption = 0;

        //temp dimensions
        int height;
        int width;

        //Main menu
        do {
            displayMenu();
            menuOption = scanner.nextInt();
            switch (menuOption) {
                case 1: //Change the height alone
                    changeHeight();
                    break;
                case 2: //Change the width alone
                    changeWidth();
                    break;
                case 3: //Change both the width and height
                    changeDimensions();
                    break;
                case 4: //Quit Application
                    System.out.println("Thanks for playing");
                default:
                    break;
            }
        } while (menuOption != 4);

        System.exit(0);
    }

    public static void main(String[] args) {
        Game game = new Game();
    }

    public void displayMenu() {
        System.out.println("\tMAIN MENU");
        System.out.println("----------------------------");
        System.out.println("1. Change Height");
        System.out.println("2. Change Width");
        System.out.println("3. Change Height + Width");
        System.out.println("4. Quit");
        System.out.println("----------------------------");
        System.out.print("Your option: ");
    }

    //Change the Height alone
    public void changeHeight() {
        int height = 0;
        try {
            System.out.print("Enter new height");
            height = scanner.nextInt();
        } catch(Exception e){}
        gameFrame.changeFrameHeight(height);
    }

    //Change the frame width alone
    public void changeWidth() {
        int width = 0;
        try {
            System.out.print("Enter new width");
            width = scanner.nextInt();
        } catch(Exception e){}
        gameFrame.changeFrameWidth(width);
    }

    public void changeDimensions() {
        int width = 0;
        int height = 0;

        try {
            System.out.print("Enter new height");
            height = scanner.nextInt();
        } catch(Exception e){}
        try {
            System.out.print("Enter new width");
            width = scanner.nextInt();
        } catch(Exception e){}
        gameFrame.changeFrameDimensions(height, width);
    }
}
