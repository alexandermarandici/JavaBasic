import javax.swing.*;

public class MyWindow2 extends JFrame {
    public MyWindow2() {
        setBounds(500, 500, 300, 300);
        setTitle("Manuel GUI");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
        JTextField field = new JTextField();
        field.setBounds(20, 20, 120, 32);
        add(field);
        JButton button = new JButton("Enter");
        button.setBounds(20, 60, 120, 32);
        add(button);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyWindow2();
    }
}
