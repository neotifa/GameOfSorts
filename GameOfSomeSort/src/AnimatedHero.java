import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class AnimatedHero extends JPanel implements ActionListener, KeyListener {

    final static int DEFAULT_HEIGHT = 400;
    final static int DEFAULT_WIDTH = 600;

    private int height = DEFAULT_HEIGHT;
    private int width = DEFAULT_WIDTH;

    private Timer tm = new Timer(88, this);
    int x = 0, y = 0, velX = 0, velY = 0;

    public AnimatedHero() {
        this.tm.start();
        this.addKeyListener(this);
        this.setFocusable(true);
        this.setFocusTraversalKeysEnabled(false);

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        ImageIcon hero = new ImageIcon("images/Hero_Front_1.png");
        ImageIcon heroWalkBack1 = new ImageIcon("images/Hero_Walk_Back1.png");
        ImageIcon heroWalkBack2 = new ImageIcon("images/Hero_Walk_Back2.png");
        ImageIcon heroWalkFront1 = new ImageIcon("images/Hero_Walk_Front1.png");
        ImageIcon heroWalkFront2 = new ImageIcon("images/Hero_Walk_Front2.png");
        ImageIcon heroWalkLeft1 = new ImageIcon("images/Hero_Walk_Left1.png");
        ImageIcon heroWalkLeft2 = new ImageIcon("images/Hero_Walk_Left2.png");
        ImageIcon heroWalkRight1 = new ImageIcon("images/Hero_Walk_Right1.png");
        ImageIcon heroWalkRight2 = new ImageIcon("images/Hero_Walk_Right2.png");

        if (this.velX == 0 && this.velY == 0) {
            hero.paintIcon(this, g, this.x, this.y);
        }
        if (this.velY == 1) {
            this.switchImage(heroWalkFront1, heroWalkFront2, g, this.y);
        }
        if (this.velY == -1) {
            this.switchImage(heroWalkBack1, heroWalkBack2, g, this.y);
        }
        if (this.velX == 1) {
            this.switchImage(heroWalkRight1, heroWalkRight2, g, this.x);
        }
        if (this.velX == -1) {
            this.switchImage(heroWalkLeft1, heroWalkLeft2, g, this.x);
        }
    }

    public void switchImage(ImageIcon img1, ImageIcon img2, Graphics g, int c) {
        if (Math.abs(c) % 2 == 1) {
            img1.paintIcon(this, g, this.x, this.y);
        }
        if (Math.abs(c) % 2 == 0) {
            img2.paintIcon(this, g, this.x, this.y);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.x < 0) {
            this.velX = 0;
            this.x = 0;
        } else if (this.x > this.width - 32) {
            this.velX = 0;
            this.x = this.width - 32;
        }
        if (this.y < 0) {
            this.velY = 0;
            this.y = 0;
        } else if (this.y > this.height - 32) {
            this.velY = 0;
            this.y = this.height - 32;
        }

        this.x = this.x + this.velX;
        this.y = this.y + this.velY;
        this.repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int c = e.getKeyCode();
        if (c == KeyEvent.VK_LEFT) {
            this.velX = -1;
            this.velY = 0;
        }
        if (c == KeyEvent.VK_UP) {
            this.velX = 0;
            this.velY = -1;
        }
        if (c == KeyEvent.VK_RIGHT) {
            this.velX = 1;
            this.velY = 0;
        }
        if (c == KeyEvent.VK_DOWN) {
            this.velX = 0;
            this.velY = 1;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        this.velX = 0;
        this.velY = 0;
    }

    public static void main(String[] args) {

        int h = 400;
        int w = 600;

        AnimatedHero a = new AnimatedHero();
        JFrame jf = new JFrame();
        jf.setTitle("AnimatedHero");
        jf.setSize(w, h);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(a);
    }

}
