import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

// create a panel that you can draw on.
class GamePanel extends JPanel implements ActionListener, KeyListener, MouseListener{

  private int x = 50; // posição x
  private int y = 50; // posição y
  private int v = 1; // velocidade
  Timer tm = new Timer(10, this);

  public GamePanel() {
    addKeyListener(this);
    addMouseListener(this);
    setFocusable(true);
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    // System.out.println("paintComponent... "+(x+v));

    g.setColor(Color.BLUE);
    g.fillRect(x+v, 15, 100, 100);

    tm.start();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // System.out.println("actionPerformed...");
    if (x <= 0 || x >= 300) {
      v = v * -1;
    }
    x = x + v;
    repaint();
  } 

  @Override
  public void keyPressed(KeyEvent e) {
    System.out.println("keyPressed... (hora de pular)");
  }

  @Override
  public void mousePressed(MouseEvent arg0) {
    System.out.println("mousePressed... (hora de pular)"); 
  }

  // outros métodos de que precisam existir devido às interfaces mas que não são necessários
  @Override
  public void keyTyped(KeyEvent e) { }

  @Override
  public void keyReleased(KeyEvent e) { }

  @Override
  public void mouseClicked(MouseEvent arg0) { }

  @Override
  public void mouseReleased(MouseEvent arg0) { }

  @Override
  public void mouseEntered(MouseEvent arg0) { }

  @Override
  public void mouseExited(MouseEvent arg0) { }
}
 