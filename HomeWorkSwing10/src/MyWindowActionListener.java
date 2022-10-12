import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindowActionListener extends JFrame {
    public MyWindowActionListener() {
        setBounds(500, 500, 300, 120);
        setTitle("Simple Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton button = new JButton("Enter");
        add(button, BorderLayout.CENTER);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setText("Thank");
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyWindowActionListener();
    }
}
