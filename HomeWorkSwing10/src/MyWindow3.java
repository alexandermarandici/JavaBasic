import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow3 extends JFrame {
    public MyWindow3() {
        setBounds(500, 500, 300, 120);
        setTitle("Simple Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JTextField textField = new JTextField();
        add(textField, BorderLayout.CENTER);
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(textField.getText());
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyWindow3();
    }
}
