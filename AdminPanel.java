import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class AdminPanel extends JPanel {
    JFrame frame = new JFrame();
    JButton addBookButton = new JButton("Add Book");
    JButton addBackButton = new JButton("Back");
    JButton deleteBookButton = new JButton("Delete Book");
    JLabel bookIdLabel = new JLabel("BookID:");
    JLabel bookTitleLabel = new JLabel("Book Title:");
    JLabel bookAuthorLabel = new JLabel("Book Author:");
    JTextField bookIdField = new JTextField();
    JTextField bookTitleField = new JTextField();
    JTextField bookAuthorField = new JTextField();

    AdminPanel(){
        JLabel adminMenuLabel = new JLabel("Welcome to Admin Panel");
        adminMenuLabel.setBounds(20,10,400,50);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(adminMenuLabel);
        bookIdLabel.setBounds(50,100,75,25);
        bookTitleLabel.setBounds(50,150,75,25);
        bookAuthorLabel.setBounds(50,200,75,25);
        bookIdField.setBounds(125,100,25,25);
        bookTitleField.setBounds(125,150,200,25);
        bookAuthorField.setBounds(125,200,200,25);
        addBookButton.setBounds(125,250,100,25);
        addBookButton.setFocusable(false);
        deleteBookButton.setBounds(225,250,100,25);
        deleteBookButton.setFocusable(false);
        addBackButton.setBounds(325,250,100,25);
        addBackButton.setFocusable(false);

        frame.add(bookIdLabel);
        frame.add(bookTitleLabel);
        frame.add(bookAuthorLabel);
        frame.add(bookIdField);
        frame.add(bookTitleField);
        frame.add(bookAuthorField);
        frame.add(addBookButton);
        frame.add(deleteBookButton);
        frame.add(addBackButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(460,430);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - frame.getWidth()) /2;
        int y = (screenSize.height - frame.getHeight())/2;
        frame.setLocation(x, y);
        //Wykonac obsluge zdarzen
        //tutaj dodac powrot do menu
        addBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == addBackButton) {
                    frame.getContentPane().removeAll();
                    HashMap<String,String> loginInfo = new HashMap<>();
        LoginPage loginPage = new LoginPage(loginInfo);
                    frame.getContentPane().add(loginPage);
                    frame.revalidate();
                    frame.repaint();
                    frame.dispose();
                }
            }
        });
    }
}
