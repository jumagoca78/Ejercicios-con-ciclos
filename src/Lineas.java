import java.awt.Graphics;

public class Lineas extends javax.swing.JFrame {
    
    @Override
    public void paint(Graphics g) {
         // initialization
        for (int counter = 1;counter <= 10;++counter) { // repetition condition
            g.drawLine(100, 110, 350, 100+counter*10);
            
        }
    }

    public static void main(String args[]) {
        Lineas imagen = new Lineas();
        imagen.setSize(500, 400);
        imagen.setVisible(true);
    }
}




