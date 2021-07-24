import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Game extends JPanel implements ActionListener {

  private int numero = 50;

  Timer tm = new Timer(5, this);

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    // System.out.println("paintComponent...");
    
    // g.setColor(Color.RED);
    // g.fillRect(0, 0, 400, 400);

    g.setColor(Color.BLUE);
    g.fillRect(50, 15, 100, 100);

    tm.start();
  }

  public void actionPerformed(ActionEvent e) {
    System.out.println("actionPerformed...");
    repaint();
  } 

  public static void main(String[]args) {
    System.out.println("main...");
    Game g = new Game();
    JFrame j = new JFrame();
    j.setTitle("Título JFrame");
    j.setSize(600, 400);
    j.setVisible(true);
    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    j.add(g);
  }

}