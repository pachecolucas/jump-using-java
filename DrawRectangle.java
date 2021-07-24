import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
 
public class DrawRectangle {
 
  public static void main(String[] arguments) {
 
    MyPanel panel = new MyPanel();
 
    // create a basic JFrame
    JFrame.setDefaultLookAndFeelDecorated(true);
    JFrame frame = new JFrame("JFrame Color Example");
    frame.setSize(600,400);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
    // add panel to main frame
    frame.add(panel);
 
    frame.setVisible(true);
 
  }
}
 
// create a panel that you can draw on.
class MyPanel extends JPanel implements ActionListener {

  private int x = 50;
  private int v = 1;

  Timer tm = new Timer(5, this);

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    System.out.println("paintComponent... "+(x+v));

    g.setColor(Color.BLUE);
    g.fillRect(x+v, 15, 100, 100);

    tm.start();
  }

  public void actionPerformed(ActionEvent e) {
    System.out.println("actionPerformed...");
    if (x <= 0 || x >= 300) {
      v = v * -1;
    }
    x = x + v;
    repaint();
  } 
}
 