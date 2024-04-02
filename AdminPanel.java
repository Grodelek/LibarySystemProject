import javax.swing.*;
import java.awt.*;

public class AdminPanel extends JPanel {
    JFrame frame = new JFrame();
    AdminPanel(){
        JLabel adminMenuLabel = new JLabel("Welcome to Admin Panel");
        adminMenuLabel.setBounds(50,75,400,50);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(adminMenuLabel);

        frame.setSize(460,430);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - frame.getWidth()) /2;
        int y = (screenSize.height - frame.getHeight())/2;
        frame.setLocation(x, y);
        //Dodac przyciski Add Book, Delete Book, itp
    }
}
