
/**
 * Java Basic Home work 10
 *
 * @author Alexandru Marandici
 * @todo 10.10.2022
 * @date 12.10.2022
 */
import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {
    public MyWindow() {
        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        JButton button1 = new JButton("EXIT");
        JButton button2 = new JButton("ENTER");
        JButton button3 = new JButton("BACK");
        JButton button4 = new JButton("FORTH");
        add(button1, BorderLayout.NORTH);
        add(button2, BorderLayout.SOUTH);
        add(button3, BorderLayout.WEST);
        add(button4, BorderLayout.EAST);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyWindow();
    }
}
