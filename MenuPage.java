import javax.swing.*;
import java.awt.*;

public class MenuPage extends JPanel {
    JFrame frame = new JFrame();
    MenuPage(String name){
    JLabel welcomeLabel = new JLabel("Hello "+name+"!");
        welcomeLabel.setBounds(0,0,200,35);
        welcomeLabel.setFont(new Font(null, Font.PLAIN,20));
        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(460,430);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - frame.getWidth()) /2;
        int y = (screenSize.height - frame.getHeight())/2;
        if (name.equals("admin")) {
            frame.dispose(); // Zamknij bieżące okno
            AdminPanel adminPanel = new AdminPanel(); // Utwórz nowy panel administratora
            adminPanel.setVisible(true); // Wyświetl panel administratora
        } else {
            frame.setLocation(x, y);
            frame.setLayout(null);
            frame.setResizable(false);
            frame.setVisible(true);
        }
    }
}
