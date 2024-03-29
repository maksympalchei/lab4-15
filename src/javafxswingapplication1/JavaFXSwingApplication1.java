import javafxswingapplication1.NewJFrame;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class JavaFXSwingApplication1 {
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            NewJFrame frame = new NewJFrame();
            frame.setTitle("JavaFX inside Swing");
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
