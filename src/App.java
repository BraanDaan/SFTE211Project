import edu.bushnell.termproject.onlineadvice.OnlineAdvice;
import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Final");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1060, 720);
        OnlineAdvice advice = new OnlineAdvice();
        JPanel advicePanel = advice.MakeGUI();
        frame.add(advicePanel);
        frame.pack(); 
        frame.setVisible(true);
    }
}
