import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
 
public class GameMain {
 
  public static void main(String[] arguments) {
 
    // cria o Jogo (JPanel)
    GamePanel panel = new GamePanel();
 
    // adiciona o Jogo dentro de uma janelinha do java (JFrame)
    JFrame.setDefaultLookAndFeelDecorated(true);
    JFrame frame = new JFrame("JFrame Color Example");
    frame.setSize(600,400);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(panel);
 
    // pede para exibir a janela (JFrame) com o jogo (JPanel)
    frame.setVisible(true);
  }
}