import javax.swing.*;

public class MyWindow1 extends JFrame {
    public MyWindow1() {
        setBounds(500, 500, 500, 300);
        setTitle("BoxLayoutDemo");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
        for (int i = 1; i <= 10; i++) {
            add(new JButton("#" + i));
        }
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyWindow1();
    }

}
