import javax.swing.*;
import java.awt.*;

public class MenuPage {
    JFrame frame = new JFrame();
    MenuPage(String name){
    JLabel welcomeLabel = new JLabel("Hello "+name+"!");
        welcomeLabel.setBounds(0,0,100,35);
        welcomeLabel.setFont(new Font(null, Font.PLAIN,20));
        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(460,430);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - frame.getWidth()) /2;
        int y = (screenSize.height - frame.getHeight())/2;
        frame.setLocation(x, y);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
