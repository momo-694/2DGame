package game.screen;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
    public MainFrame() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("2D Game");
        add(new MainPanel());
        pack();
        setLocationRelativeTo(null);
        setResizable(false);

        setVisible(true);
    }
}