package ShapeCreationTest;

import java.awt.*;

/**
 * Created by Danyon on 10/06/2016.
 */
public abstract class Spawn {

    //Choose how tall and wide the ball will be
    double ballSizeX = 50;
    double ballSizeY = 50;

    //Create a 2D circle at center at mouse location
    public void createCircleAtMouse(Graphics g, double x, double y){
        double posX = setX(x);
        double posY = setY(y);
        Ball b = new Ball(g, posX, posY, ballSizeY, ballSizeX);
    }

    //Make sure mouse is at center of the ball - x
    private double setX(double posX){
        posX -= (ballSizeX/2);
        return posX;
    }

    //make sure mouse is at center of the ball - y
    private double setY(double posY){
        posY -= (ballSizeY);
        return posY;
    }
}
