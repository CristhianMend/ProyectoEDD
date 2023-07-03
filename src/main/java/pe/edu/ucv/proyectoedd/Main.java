package pe.edu.ucv.proyectoedd;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * @author Grupo 3
 */
public class Main {
    
    public static JFrame frame1;
    public static JFrame frame2;
    public static JFrame frame3;
    public static JFrame currentFrame;

    public static void mostrarFrame1() {
        currentFrame.setVisible(false);
        frame1.setVisible(true);
        currentFrame = frame1;
    }

    public static void mostrarFrame2() {
        currentFrame.setVisible(false);
        frame2.setVisible(true);
        currentFrame = frame2;
    }

    public static void mostrarFrame3() {
        currentFrame.setVisible(false);
        frame3.setVisible(true);
        currentFrame = frame3;
    }

    public static void main(String[] args) {
        frame1 = new QatunaProductosApp();
        frame2 = new QatunaClientesApp();
        frame3 = new QatunaPedidosApp();
        
        currentFrame = frame1;
        
        SwingUtilities.invokeLater(() -> {
            mostrarFrame1();
        });
    }
}