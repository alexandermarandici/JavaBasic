/**
 * Java Basic Home work 11
 *
 * @author Alexandru Marandici
 * @todo 12.09.2022
 * @date 22.10.2022
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HomeWorkHelloSwing extends JFrame {
    final int CANVAS_WIDTH = 600;
    final int CANVAS_HEIGHT = 500;

    final int DX = 100;

    int x, y, dx;
    Color color;

    ImageIcon image;

    List<Ball> balls;

     final private Color[] COLORS = {Color.red, Color.green, Color.blue};
    private Random random = new Random();

    public static void main(String[] args) {
        new HomeWorkHelloSwing();
    }

    public HomeWorkHelloSwing() {
        setTitle("Hello Swing");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        CanvasPanel canvasPanel = new CanvasPanel();
        canvasPanel.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
        canvasPanel.setBackground(Color.white);

        initBalls();

        image = new ImageIcon("bichon.jpg");


     //   addKeyListener(new KeyAdapter() {
       //     @Override
         //   public void keyReleased(KeyEvent event) {
           //     super.keyReleased(event);
             //   System.out.println(event.getKeyCode());
               // switch (event.getKeyCode()) {
                 //   case 32:
                   //     randomXYColor();
                     //   break;
                   // case 38:
                     //   y -= 5;
                       // break;
                   // case 40:
                     //   y += 5;
                       // break;
                   // case 37:
                     //   x -= 5;
                       // break;
                   // case 39:
                     //   x += 5;
                       // break;
               // }
               // canvasPanel.repaint();
          //  }
       // });

        canvasPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent event) {
                super.mouseReleased(event);
                System.out.println(event.getX() + ":" + event.getY());
                for (int i = balls.size() - 1; i > -1; i--) {
                    if (balls.get(i).isInBall(event.getX(), event.getY())) {
                        balls.remove(i);
                        break;
                    }
                }
                canvasPanel.repaint();
            }
        });

        randomXYColor();

       Button repaint = new Button("Repaint");
       repaint.addActionListener(e -> {
           System.out.println("Repaint");
           randomXYColor();
            canvasPanel.repaint();
          });
        Button left = new Button("Left");
        left.addActionListener(e -> {
            x -= 5;
            canvasPanel.repaint();
        });
        Button right = new Button("Right");
        right.addActionListener(e -> {
            x += 5;
            canvasPanel.repaint();
        });
        Button exit = new Button("Exit");
        exit.addActionListener(e -> System.exit(0));

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(repaint);
        buttonPanel.add(left);
        buttonPanel.add(right);
        buttonPanel.add(exit);

        add(canvasPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void randomXYColor() {
        color = COLORS[random.nextInt(COLORS.length)];
        x = random.nextInt(CANVAS_WIDTH - DX);
        y = random.nextInt(CANVAS_HEIGHT - DX);
        dx = DX;
    }

    private void initBalls() {
        balls = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Color color = COLORS[random.nextInt(COLORS.length)];
            int d = random.nextInt(100);
            int x = random.nextInt(CANVAS_WIDTH - d);
            int y = random.nextInt(CANVAS_HEIGHT - d);
            balls.add(new Ball(x, y, d, color));
        }
    }

    private class CanvasPanel extends JPanel {
        public void paint(Graphics g) {
            super.paint(g);
            for (Ball ball : balls) {
                ball.paint(g);

            }
        }
    }
}
