/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

import javax.swing.*;
import java.awt.*;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

import java.util.Random;

/**
 *
 * @author Claude
 */
public class Minefield extends JPanel {

    private int size = 750;
    private Minesweeper MSgame;
    Random rand = new Random();
    boolean dead;
    

    public Minefield(Minesweeper MSgame1) {
        setPreferredSize(new Dimension(size, size));
        addMouseListener(new MSMouseListener());
        MSgame = MSgame1;
        dead = false;
    }

    public void paint(Graphics g) {

        g.setColor(Color.GRAY);
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setColor(Color.BLACK);
        for (int i = 0; i < 15; i++) {
            g.drawLine(0, i * 50, 750, i * 50);
            g.drawLine(i * 50, 0, i * 50, 750);
        }
        g.setColor(Color.GRAY);
        Font f = new Font("Times", Font.PLAIN, 30);
        g.setFont(f);
        FontMetrics fm = g.getFontMetrics();

        int a = fm.getAscent();
        int h = fm.getHeight();
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                char curSquare = MSgame.getSquare(i, j);
                if (MSgame.getSquare(i, j) == '■' && dead == false) {
                    g.setColor(Color.BLACK);
                    String curSqStr = Character.toString(curSquare);
                    int w = fm.stringWidth(curSqStr);
                    g.drawString(curSqStr, 50 * i + 25 - w / 2, 50 * j + 25 + a - h / 2);
                }
                if (MSgame.getSquare(i, j) == '1' && dead == false) {
                    g.setColor(Color.BLACK );
                    String curSqStr = Character.toString(curSquare);
                    int w = fm.stringWidth(curSqStr);
                    g.drawString(curSqStr, 50 * i + 25 - w / 2, 50 * j + 25 + a - h / 2);
                }
                if (MSgame.getSquare(i, j) == '2' && dead == false) {
                    g.setColor(Color.BLACK);
                    String curSqStr = Character.toString(curSquare);
                    int w = fm.stringWidth(curSqStr);
                    g.drawString(curSqStr, 50 * i + 25 - w / 2, 50 * j + 25 + a - h / 2);
                }
                if (MSgame.getSquare(i, j) == '3' && dead == false) {
                    g.setColor(Color.BLACK);
                    String curSqStr = Character.toString(curSquare);
                    int w = fm.stringWidth(curSqStr);
                    g.drawString(curSqStr, 50 * i + 25 - w / 2, 50 * j + 25 + a - h / 2);
                }
                if (MSgame.getSquare(i, j) == '4' && dead == false) {
                    g.setColor(Color.BLACK);
                    String curSqStr = Character.toString(curSquare);
                    int w = fm.stringWidth(curSqStr);
                    g.drawString(curSqStr, 50 * i + 25 - w / 2, 50 * j + 25 + a - h / 2);
                }
                if (MSgame.getSquare(i, j) == '5' && dead == false) {
                    g.setColor(Color.BLACK);
                    String curSqStr = Character.toString(curSquare);
                    int w = fm.stringWidth(curSqStr);
                    g.drawString(curSqStr, 50 * i + 25 - w / 2, 50 * j + 25 + a - h / 2);
                }
                if (MSgame.getSquare(i, j) == '6' && dead == false) {
                    g.setColor(Color.BLACK);
                    String curSqStr = Character.toString(curSquare);
                    int w = fm.stringWidth(curSqStr);
                    g.drawString(curSqStr, 50 * i + 25 - w / 2, 50 * j + 25 + a - h / 2);
                }
                if (MSgame.getSquare(i, j) == '7' && dead == false) {
                    g.setColor(Color.BLACK);
                    String curSqStr = Character.toString(curSquare);
                    int w = fm.stringWidth(curSqStr);
                    g.drawString(curSqStr, 50 * i + 25 - w / 2, 50 * j + 25 + a - h / 2);
                }
                if (MSgame.getSquare(i, j) == '8' && dead == false) {
                    g.setColor(Color.BLACK);
                    String curSqStr = Character.toString(curSquare);
                    int w = fm.stringWidth(curSqStr);
                    g.drawString(curSqStr, 50 * i + 25 - w / 2, 50 * j + 25 + a - h / 2);
                }
                if (MSgame.getSquare(i, j) == 'a' && dead == false) {
                    g.setColor(Color.GRAY);
                    String curSqStr = Character.toString(curSquare);
                    int w = fm.stringWidth(curSqStr);
                    g.drawString(curSqStr, 50 * i + 25 - w / 2, 50 * j + 25 + a - h / 2);
                }
                if (MSgame.getSquare(i, j) == 'b' && dead == false) {
                    g.setColor(Color.GRAY);
                    String curSqStr = Character.toString(curSquare);
                    int w = fm.stringWidth(curSqStr);
                    g.drawString(curSqStr, 50 * i + 25 - w / 2, 50 * j + 25 + a - h / 2);
                }
                if (MSgame.getSquare(i, j) == 'c' && dead == false) {
                    g.setColor(Color.GRAY);
                    String curSqStr = Character.toString(curSquare);
                    int w = fm.stringWidth(curSqStr);
                    g.drawString(curSqStr, 50 * i + 25 - w / 2, 50 * j + 25 + a - h / 2);
                }
                if (MSgame.getSquare(i, j) == 'd' && dead == false) {
                    g.setColor(Color.GRAY);
                    String curSqStr = Character.toString(curSquare);
                    int w = fm.stringWidth(curSqStr);
                    g.drawString(curSqStr, 50 * i + 25 - w / 2, 50 * j + 25 + a - h / 2);
                }
                if (MSgame.getSquare(i, j) == 'e' && dead == false) {
                    g.setColor(Color.GRAY);
                    String curSqStr = Character.toString(curSquare);
                    int w = fm.stringWidth(curSqStr);
                    g.drawString(curSqStr, 50 * i + 25 - w / 2, 50 * j + 25 + a - h / 2);
                }
                if (MSgame.getSquare(i, j) == 'f' && dead == false) {
                    g.setColor(Color.GRAY);
                    String curSqStr = Character.toString(curSquare);
                    int w = fm.stringWidth(curSqStr);
                    g.drawString(curSqStr, 50 * i + 25 - w / 2, 50 * j + 25 + a - h / 2);
                }
                if (MSgame.getSquare(i, j) == 'g' && dead == false) {
                    g.setColor(Color.GRAY);
                    String curSqStr = Character.toString(curSquare);
                    int w = fm.stringWidth(curSqStr);
                    g.drawString(curSqStr, 50 * i + 25 - w / 2, 50 * j + 25 + a - h / 2);
                }
                if (MSgame.getSquare(i, j) == 'h' && dead == false) {
                    g.setColor(Color.GRAY);
                    String curSqStr = Character.toString(curSquare);
                    int w = fm.stringWidth(curSqStr);
                    g.drawString(curSqStr, 50 * i + 25 - w / 2, 50 * j + 25 + a - h / 2);
                }
                if (MSgame.getSquare(i, j) == ' ' && dead == false) {
                    g.setColor(Color.GRAY);
                    String curSqStr = Character.toString(curSquare);
                    int w = fm.stringWidth(curSqStr);
                    g.drawString(curSqStr, 50 * i + 25 - w / 2, 50 * j + 25 + a - h / 2);
                }
                if (dead == true){
                    g.setColor(Color.RED);
                    String curSqStr = Character.toString(curSquare);
                    int w = fm.stringWidth(curSqStr);
                    g.drawString(curSqStr, 50 * i + 25 - w / 2, 50 * j + 25 + a - h / 2);
                }

            }
        }
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
            }
        }


    }

    private class MSMouseListener implements MouseListener {
        
        boolean hasClicked = false;
        
        @Override
        public void mousePressed(MouseEvent e) {
        }

        public void mouseReleased(MouseEvent e) {
        }

        public void mouseEntered(MouseEvent e) {
        }

        public void mouseExited(MouseEvent e) {
        }
        
        public void mouseClicked(MouseEvent e) {
            int x = e.getX() / 50;
            int y = e.getY() / 50;
            if(!hasClicked) //making sure the first place clicked is blank
            {
                MSgame.setBoard(x,y); 
                hasClicked = true;
                repaint();
            }
            //replacing cell contents with something that will change color
            if (MSgame.getSquare(x, y) == ' ') {
                MSgame.setSquare(x, y, '■');
                repaint();
            }
            if (MSgame.getSquare(x, y) == 'a') {
                MSgame.setSquare(x, y, '1');
                repaint();
            }
            if (MSgame.getSquare(x, y) == 'b') {
                MSgame.setSquare(x, y, '2');
                repaint();
            }
            if (MSgame.getSquare(x, y) == 'c') {
                MSgame.setSquare(x, y, '3');
                repaint();
            }
            if (MSgame.getSquare(x, y) == 'd') {
                MSgame.setSquare(x, y, '4');
                repaint();
            }
            if (MSgame.getSquare(x, y) == 'e') {
                MSgame.setSquare(x, y, '5');
                repaint();
            }
            if (MSgame.getSquare(x, y) == 'f') {
                MSgame.setSquare(x, y, '6');
                repaint();
            }
            if (MSgame.getSquare(x, y) == 'g') {
                MSgame.setSquare(x, y, '7');
                repaint();
            }
            if (MSgame.getSquare(x, y) == 'h') {
                MSgame.setSquare(x, y, '8');
                repaint();
            }
            if (MSgame.getSquare(x, y) == '☼') {
                dead = true;
                repaint();
                MSgame.gameEnd();
            }
            //A battery of if statements that clears out a section of blanks
            for (int h = 0; h < 10; h++) {
                for (int i = 0; i < 15; i++) {
                    for (int j = 0; j < 15; j++) {
                        if (MSgame.getSquare(i, j) == '■') {
                            try {
                                if (MSgame.getSquare(i + 1, j) == ' ') {
                                    MSgame.setSquare(i + 1, j, '■');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i + 1, j + 1) == ' ') {
                                    MSgame.setSquare(i + 1, j + 1, '■');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i, j + 1) == ' ') {
                                    MSgame.setSquare(i, j + 1, '■');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i - 1, j + 1) == ' ') {
                                    MSgame.setSquare(i - 1, j + 1, '■');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i + 1, j - 1) == ' ') {
                                    MSgame.setSquare(i + 1, j - 1, '■');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i - 1, j) == ' ') {
                                    MSgame.setSquare(i - 1, j, '■');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i - 1, j - 1) == ' ') {
                                    MSgame.setSquare(i - 1, j - 1, '■');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i, j - 1) == ' ') {
                                    MSgame.setSquare(i, j - 1, '■');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i + 1, j) == 'a') {
                                    MSgame.setSquare(i + 1, j, '1');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i + 1, j + 1) == 'a') {
                                    MSgame.setSquare(i + 1, j + 1, '1');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i, j + 1) == 'a') {
                                    MSgame.setSquare(i, j + 1, '1');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i - 1, j + 1) == 'a') {
                                    MSgame.setSquare(i - 1, j + 1, '1');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i + 1, j - 1) == 'a') {
                                    MSgame.setSquare(i + 1, j - 1, '1');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i - 1, j) == 'a') {
                                    MSgame.setSquare(i - 1, j, '1');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i - 1, j - 1) == 'a') {
                                    MSgame.setSquare(i - 1, j - 1, '1');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i, j - 1) == 'a') {
                                    MSgame.setSquare(i, j - 1, '1');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i + 1, j) == 'b') {
                                    MSgame.setSquare(i + 1, j, '2');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i + 1, j + 1) == 'b') {
                                    MSgame.setSquare(i + 1, j + 1, '2');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i, j + 1) == 'b') {
                                    MSgame.setSquare(i, j + 1, '2');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i - 1, j + 1) == 'b') {
                                    MSgame.setSquare(i - 1, j + 1, '2');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i + 1, j - 1) == 'b') {
                                    MSgame.setSquare(i + 1, j - 1, '2');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i - 1, j) == 'b') {
                                    MSgame.setSquare(i - 1, j, '2');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i - 1, j - 1) == 'b') {
                                    MSgame.setSquare(i - 1, j - 1, '2');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i, j - 1) == 'b') {
                                    MSgame.setSquare(i, j - 1, '2');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i + 1, j) == 'c') {
                                    MSgame.setSquare(i + 1, j, '3');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i + 1, j + 1) == 'c') {
                                    MSgame.setSquare(i + 1, j + 1, '3');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i, j + 1) == 'c') {
                                    MSgame.setSquare(i, j + 1, '3');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i - 1, j + 1) == 'c') {
                                    MSgame.setSquare(i - 1, j + 1, '3');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i + 1, j - 1) == 'c') {
                                    MSgame.setSquare(i + 1, j - 1, '3');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i - 1, j) == 'c') {
                                    MSgame.setSquare(i - 1, j, '3');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i - 1, j - 1) == 'c') {
                                    MSgame.setSquare(i - 1, j - 1, '3');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i, j - 1) == 'c') {
                                    MSgame.setSquare(i, j - 1, '3');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i + 1, j) == 'd') {
                                    MSgame.setSquare(i + 1, j, '4');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i + 1, j + 1) == 'd') {
                                    MSgame.setSquare(i + 1, j + 1, '4');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i, j + 1) == 'd') {
                                    MSgame.setSquare(i, j + 1, '4');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i - 1, j + 1) == 'd') {
                                    MSgame.setSquare(i - 1, j + 1, '4');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i + 1, j - 1) == 'd') {
                                    MSgame.setSquare(i + 1, j - 1, '4');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i - 1, j) == 'd') {
                                    MSgame.setSquare(i - 1, j, '4');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i - 1, j - 1) == 'd') {
                                    MSgame.setSquare(i - 1, j - 1, '4');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i, j - 1) == 'd') {
                                    MSgame.setSquare(i, j - 1, '4');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i + 1, j) == 'e') {
                                    MSgame.setSquare(i + 1, j, '5');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i + 1, j + 1) == 'e') {
                                    MSgame.setSquare(i + 1, j + 1, '5');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i, j + 1) == 'e') {
                                    MSgame.setSquare(i, j + 1, '5');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i - 1, j + 1) == 'e') {
                                    MSgame.setSquare(i - 1, j + 1, '5');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i + 1, j - 1) == 'e') {
                                    MSgame.setSquare(i + 1, j - 1, '5');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i - 1, j) == 'e') {
                                    MSgame.setSquare(i - 1, j, '5');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i - 1, j - 1) == 'e') {
                                    MSgame.setSquare(i - 1, j - 1, '5');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }
                            try {
                                if (MSgame.getSquare(i, j - 1) == 'e') {
                                    MSgame.setSquare(i, j - 1, '5');
                                }
                            } catch (java.lang.ArrayIndexOutOfBoundsException c) {
                            }

                        }
                    }
                }
            }
        }
    }
}
