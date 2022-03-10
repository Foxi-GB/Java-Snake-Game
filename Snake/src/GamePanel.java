import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener{

    //variable declaration
        //SCREEN dimensions
    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
        //Object Size
    static final int UNIT_SIZE = 25; 
        //Number of objects in screen
    static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT / UNIT_SIZE); 
        //Time delay
    static final int DELAY = 75; 
        //X and Y co-ordinates
    final int x[] = new int[GAME_UNITS]; 
    final int y[] = new int[GAME_UNITS]; 
        //Staring body parts
    int bodyParts = 6;
    int applesEaten;
        //Apple Co-Ordinates
    int appleX; 
    int appleY;
        //Snake Direction
    char direction = 'R';  
    boolean running = false; 
    Timer timer;
    Random random;
   
    GamePanel(){
        random = new Random(); 
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();
    }

    public void startGame(){

    }

    public void paintComponent(Graphics g){

    }

    public void draw(Graphics g){

    }

    public void move(){

    }

    public void checkApple(){

    }

    public void checkCollisions(){

    }

    public void gameOver(Graphics g){

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
    
    public class MyKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){

        }
    }

}
