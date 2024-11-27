import edu.bushnell.Advice;
import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Final");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 720);
        Advice advice = new Advice();
        JPanel advicePanel = advice.makeGUI();
        frame.add(advicePanel);
        frame.pack(); 
        frame.setVisible(true);
    }
}
