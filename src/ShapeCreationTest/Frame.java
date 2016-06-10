package ShapeCreationTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

import static java.awt.MouseInfo.getPointerInfo;


/**
 * Created by Danyon on 6/06/2016.
 */
public class Frame extends JPanel{
    private static JFrame frame = new JFrame("Object Placement Window");

    //Gets Screen Dimensions
    Dimension screenDimensions = Toolkit.getDefaultToolkit().getScreenSize();
    double screenWidth = screenDimensions.getWidth();
    double screenHeight = screenDimensions.getHeight();

    //Set the initial frame height and width here
    private int frameHeight = 600;
    private int frameWidth = 600;

    //Set frame Graphics
    Graphics g;

    public Frame(){
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.getContentPane().add(this,BorderLayout.CENTER);

        //Always on top to use the console
        frame.setAlwaysOnTop(true);

        frame.setResizable(false);
        centerFrame();
    }

    public JFrame getFrame(){return frame;}

    public void centerFrame(){
        frame.setBounds((int)((screenWidth/2)-(frameWidth/2)),(int)((screenHeight/2)-(frameHeight/2)),frameWidth, frameHeight);
        frame.repaint();
    }

    public void changeFrameHeight(int height){
        this.frameHeight = height;
        centerFrame();
    }
    public void changeFrameWidth(int width){
        this.frameWidth = width;
        centerFrame();
    }

    public void changeFrameDimensions(int height, int width){
        this.frameHeight = height;
        this.frameWidth = width;
        centerFrame();
    }
}


