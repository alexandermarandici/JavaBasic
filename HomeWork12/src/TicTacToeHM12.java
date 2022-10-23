/**
 * Java Basic Home work 6
 *
 * @author Alexandru Marandici
 * @todo 17.10.2022
 * @date 23.10.2022
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TicTacToeHM12 extends JFrame {
    private final int PANEL_SIZE = 500;
    private final int CELL_SIZE = PANEL_SIZE / 3;
    private boolean gameOver = false;

    public static void main(String[] args) {
     new TicTacToeHM12();
    }

    public TicTacToeHM12() {
        setTitle("TicTacToe");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        TicTacToe.init();

        PaintPanel paintPanel = new PaintPanel();
        paintPanel.setBackground(Color.white);
        paintPanel.setPreferredSize(new Dimension(PANEL_SIZE, PANEL_SIZE));
        paintPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int x = e.getX() / CELL_SIZE;
                int y = e.getY() / CELL_SIZE;
                if (TicTacToe.isCellValid(x, y) && !gameOver) {
                    TicTacToe.table[y][x] = 'x';
                    if (TicTacToe.isWin('x')) {
                        System.out.println("You Win");
                        gameOver = true;
                    }
                    if (TicTacToe.isTableFull()) {
                        System.out.println("Sorry Draw!");
                        gameOver = true;
                    }
                    if (!gameOver) {
                        TicTacToe.turnAI();
                        if (TicTacToe.isWin('o')) {
                            System.out.println("AI Win");
                            gameOver = true;
                        }
                        if (TicTacToe.isTableFull()) {
                            System.out.println("Sorry Draw");
                            gameOver = true;
                        }
                    }
                    paintPanel.repaint();
                }
            }
        });


        Button restart = new Button("Restart");
        restart.addActionListener(e -> {
            TicTacToe.init();
            gameOver = false;
            paintPanel.repaint();
        });
        Button exit = new Button("Exit");
        exit.addActionListener(e -> System.exit(0));

        JPanel btnPanel = new JPanel();
        btnPanel.add(restart);
        btnPanel.add(exit);

        add(paintPanel, BorderLayout.CENTER);
        add(btnPanel, BorderLayout.SOUTH);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private class PaintPanel extends JPanel {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            g.setColor(Color.gray);
            for (int i = 1; i < 3; i++) {
                g.drawLine(0, CELL_SIZE * i, PANEL_SIZE, CELL_SIZE * i);
                g.drawLine(CELL_SIZE * i, 0, CELL_SIZE * i, PANEL_SIZE);
            }
            for (int y = 0; y < 3; y++) {
                for (int x = 0; x < 3; x++) {
                    if (TicTacToe.table[y][x] == 'x') {
                        g.setColor(Color.blue);
                        g.drawLine(x * CELL_SIZE, y * CELL_SIZE,(x + 1) * CELL_SIZE, (y + 1) * CELL_SIZE);
                        g.drawLine((x + 1) * CELL_SIZE, y * CELL_SIZE, x * CELL_SIZE,(x + 1) * CELL_SIZE);
                    }
                    if (TicTacToe.table[x][x] == 'o') {
                        g.setColor(Color.red);
                        g.drawOval(x * CELL_SIZE + 20, y * CELL_SIZE + 20,
                                CELL_SIZE - 40, CELL_SIZE - 40);
                    }
                }
            }
        }
    }
}