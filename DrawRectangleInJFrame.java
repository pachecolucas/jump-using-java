import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class DrawRectangleInJFrame extends JFrame implements KeyListener {

  private int numero = 50;
  private Graphics g;

  public DrawRectangleInJFrame() {
    //Set JFrame title
    super("Draw A Rectangle In JFrame");
    System.out.println("DrawRectangleInJFrame...");

    //Set default close operation for JFrame
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //Set JFrame size
    setSize(400, 400);

    //Make JFrame visible 
    setVisible(true);

    // Turn events on
    addKeyListener(this);
    // setFocusable(true);
    // setFocusTraversalKeysEnabled(false);
  }

  @Override
  public void keyPressed(KeyEvent e) {
    System.out.println("keyPressed...");
    System.out.println(numero);
      // this.keyPressed(e);
      // this.repaint();
      numero++;
  }

  @Override
  public void keyTyped(KeyEvent e) {
    // System.out.println("keyTyped");
  }

  @Override
  public void keyReleased(KeyEvent e) {

    // System.out.println("keyReleased");
  }

  public void paint(Graphics g) {
    System.out.println("paint...");
    super.paint(g);
    this.g = g;
    draw();
  }

  private void draw() {

    //fill rectangle with RED
    g.setColor(Color.RED);
    g.fillRect(0, 0, 400, 400);
    
    //set color to RED
    //So after this, if you draw anything, all of it's result will be RED
    g.setColor(Color.BLUE);

    //fill rectangle with RED
    g.fillRect(numero, 150, 100, 100);
  }

  public static void main(String[]args) {
    System.out.println("main...");
    DrawRectangleInJFrame dlijf = new DrawRectangleInJFrame();
  }
}