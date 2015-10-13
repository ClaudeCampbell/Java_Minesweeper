/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

import java.awt.GridLayout;
import javax.swing.*;

import java.util.Random;
/**
 *
 * @author Claude
 */
public class Minesweeper extends JFrame {

        private char[][] board;
        Random rand = new Random();
        public boolean hasClicked = false;

    
    public void setSquare(int x, int y, char c) 
    {
        board[x][y] = c;
    }
    
    public char getSquare(int x, int y) 
    {
        return board[x][y];
    }
    public void gameEnd()
    {
        JOptionPane.showMessageDialog(this, "Oops.");
        System.exit(0);
    }
    public char[][] initBoard()
    {
        board = new char[15][15]; // initialize board

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {                
                board[i][j] = ' '; // blank char
            }
        }
        
        return board;
    }
    public char[][] setBoard(int X, int Y)
    {
        for(int i = 0; i < 35; i++){
            int x = rand.nextInt(15);
            int y = rand.nextInt(15);
            if (board[x][y] == ' ')
            {
                board[x][y] = '☼';
            }
            else 
            {
                i=i-1;
            }

        board[X][Y] = ' ';   //making sure the first place clicked is blank
        board[X-1][Y] = ' ';
        board[X][Y-1] = ' ';
        board[X-1][Y-1] = ' ';
        board[X+1][Y] = ' ';
        board[X][Y+1] = ' ';
        board[X+1][Y+1] = ' ';
        board[X+1][Y-1] = ' ';
        board[X-1][Y+1] = ' ';
        }            
        for (int i = 0; i < 15; i++) {
             for (int j = 0; j < 15; j++) { 
                    if(board[i][j] != '☼')
                    {

                     int a = 0;
                     try{
                     if(board[i+1][j] == '☼')
                         a++;} catch(java.lang.ArrayIndexOutOfBoundsException c){} 
                     try{
                     if(board[i+1][j+1] == '☼')
                         a++;} catch(java.lang.ArrayIndexOutOfBoundsException c){}
                     try{
                     if(board[i][j+1] == '☼')
                         a++;} catch(java.lang.ArrayIndexOutOfBoundsException c){} 
                     try{
                     if(board[i+1][j-1] == '☼')
                         a++;} catch(java.lang.ArrayIndexOutOfBoundsException c){} 
                     try{
                     if(board[i-1][j] == '☼')
                         a++;} catch(java.lang.ArrayIndexOutOfBoundsException c){}
                     try{
                     if(board[i][j-1] == '☼')
                         a++;} catch(java.lang.ArrayIndexOutOfBoundsException c){} 
                     try{
                     if(board[i-1][j-1] == '☼')
                         a++;} catch(java.lang.ArrayIndexOutOfBoundsException c){} 
                     try{
                     if(board[i-1][j+1] == '☼')
                         a++;} catch(java.lang.ArrayIndexOutOfBoundsException c){} 

                         
                     

                     if(a == 1)
                         board[i][j] = 'a';
                     if(a == 2)
                         board[i][j] = 'b';
                     if(a == 3)
                         board[i][j] = 'c';
                     if(a == 4)
                         board[i][j] = 'd';
                     if(a == 5)
                         board[i][j] = 'e';
                     if(a == 6)
                         board[i][j] = 'f';
                     if(a == 7)
                         board[i][j] = 'g';
                     if(a == 8)
                         board[i][j] = 'h';
                    }
             }   
        }
        return board;
    }
    
    
    public Minesweeper()
    {
        super("MineSweeper");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        board = initBoard(); // initialize board

        
        getContentPane().add(new Minefield(this));
        pack();
        
        setLocationRelativeTo(null);

        setVisible(true); // Show the JFrame.
    }
    
        public static void main(String[] args) {
        Minesweeper newGame = new Minesweeper();
        //JOptionPane.showMessageDialog(newGame, "This is a test.");
    }
}
