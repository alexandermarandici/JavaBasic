import javax.swing.*;
import java.awt.*;

public class MyWindowFlowLayout extends JFrame {
    public MyWindowFlowLayout() {
        setBounds(500, 500, 500, 300);
        setTitle("FlowLayoutDemo");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        for (int i = 1; i <= 10; i++) {
            add(new JButton("#" + i));
        }
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyWindowFlowLayout();
    }
}
