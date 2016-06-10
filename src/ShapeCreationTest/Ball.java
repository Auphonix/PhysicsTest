package ShapeCreationTest;

import java.awt.*;

/**
 * Created by Danyon on 10/06/2016.
 */
public class Ball {
    private Graphics g;

    public Ball(Graphics g, double posX, double posY, double height, double width){
        System.out.println(posX +" AND " + posY +" AND "+ height +" AND "+ width);
        draw(g, posX, posY, height, width);
    }

    public void draw(Graphics g, double x, double y,  double height, double width){
        g.setColor(Color.BLACK);
        g.fillOval((int)x,(int)y,(int)width,(int)height);
    }
}
