package game;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;




public class Game extends JFrame{
	
	//KeyListener
	KeyListenerExample kListener = new KeyListenerExample();
	//Levels
	Level1 level1 = new Level1(this, kListener);
	Level2 level2 = new Level2(this);
	
	//size
	int screenWidth = 600;
	int screenHeight = 600;
	
	//which is the current level
	boolean l1 = true;
	boolean l2 = false;
	
	//background Panel
	public JPanel bgPanel;
	//Player
	public JLabel player;
	
	public ImageIcon imageIcon;
		
	//position of the player
	public int playerX, playerY;
	
	//tiles for background
	public JLabel tile;
	int tileX, tileY;
	
	
	String down1 = "palmtreeguy-down1.png";
	String down2 = "palmtreeguy-down2.png";
	String up1 = "palmtreeguy-up1.png";
	String up2 = "palmtreeguy-up2.png";
	String left1 = "palmtreeguy-left1.png";
	String left2 = "palmtreeguy-left2.png";
	String right1 = "palmtreeguy-right1.png";
	String right2 = "palmtreeguy-right2.png";
	
	String currentImage = down1;
	String currentImageUp = up1;
	String currentImageLeft = left1;
	String currentImageRight = right1;
	
	
	public Game(String title) {
		super(title);	
		
		//set up the game
		initGame();
		setLayout(null);	  
		
		addKeyListener(kListener);	
		
		setSize(screenWidth, screenHeight);		
		setLocationRelativeTo(null);
		setResizable(false);
			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	private void initGame() {
		
		
		
		bgPanel = new JPanel();
		bgPanel.setBackground(Color.decode("#f2f68e"));
		bgPanel.setBounds(0, 0, 600, 600);
	
		bgPanel.setLayout(null);
		add(bgPanel);
		

		JOptionPane.showMessageDialog(null, "WELCOME TO THE GAME! You can use the A, S, D,W keys to move around");
			
		//call player method
		player();
		
		if(l1 == true) {
			level1.gameStart();
		}
		if(l2 == true) {
			level2.gameStart();
		}
		
				
	}
	public void player() {
		
		playerX = 100;
		playerY = 300;
		
		player = new JLabel();
		player.setBounds(playerX, playerY , 50, 50);
		//imageIcon = new ImageIcon(new ImageIcon("icons/palmtreeguy.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));		
			
		imageIcon = new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("palmtreeguy.png")).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
	
		player.setIcon(imageIcon);	
		bgPanel.add(player);	
	}

	public void drawTiles() {
		int col = screenHeight/50;
		int row = screenWidth/50;
		int x = 0;
		int y = 0;
		for(int i = 0; i < row;i++) {
			for(int j = 0; j < col;j++) {
				tile = new JLabel();
				tile.setBounds(x,y, 50, 50);
				ImageIcon imageTile = new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("tile.png")).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
				tile.setIcon(imageTile);
				bgPanel.add(tile);				
				y = y+50;				
			}
			y=0;
			x = x+50;
		}
		
	}
	
	class KeyListenerExample  implements KeyListener {
		
		
	    public void keyTyped(KeyEvent e) {	       
	    }

	    public void keyPressed(KeyEvent e) {
	           	
	    
	    	//check which is the current level and call the playGame() method
	    	
	    	if(l1 == true) {
	    		level1.playGame();
	    		
	    	}
	    	if(l2 == true) {
	    		level2.playGame();
	    	}
	    	
	    	//player is moving when keys are pressed
	        if (e.getKeyCode() == KeyEvent.VK_A) {
	         	        	
	        	playerX = playerX -10;
	        	player.setBounds(playerX, playerY , 50, 50);
	        	if(currentImageLeft.equals(left1)) {
	        		currentImageLeft = left2;
	        		imageIcon = new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource(currentImageLeft)).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		    		player.setIcon(imageIcon);	
	        	}
	        	else if(currentImageLeft.equals(left2)){
	        		currentImageLeft = left1;
	        		imageIcon = new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource(currentImageLeft)).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		    		player.setIcon(imageIcon);	
	        	}
	        
	        }
	        if (e.getKeyCode() == KeyEvent.VK_D) {
	         
	        	playerX = playerX +10;
	        	player.setBounds(playerX, playerY , 50, 50);
	        	if(currentImageRight.equals(right1)) {
	        		currentImageRight = right2;
	        		imageIcon = new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource(currentImageRight)).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		    		player.setIcon(imageIcon);	
	        	}
	        	else if(currentImageRight.equals(right2)){
	        		currentImageRight = right1;
	        		imageIcon = new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource(currentImageRight)).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		    		player.setIcon(imageIcon);	
	        	}
	          	          
	        }
	        if (e.getKeyCode() == KeyEvent.VK_W) {
	          
	        	
	        
	        	
	        	playerY = playerY -10;
	        	player.setBounds(playerX, playerY , 50, 50);
	        	
	        	if(currentImageUp.equals(up1)) {
	        		currentImageUp = up2;
	        		imageIcon = new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource(currentImageUp)).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		    		player.setIcon(imageIcon);	
	        	}
	        	else if(currentImageUp.equals(up2)){
	        		currentImageUp = up1;
	        		imageIcon = new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource(currentImageUp)).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		    		player.setIcon(imageIcon);	
	        	}
	    		
	    		
	           
	        }
	        if (e.getKeyCode() == KeyEvent.VK_S) {
	          
	        	playerY = playerY +10;
	        	player.setBounds(playerX, playerY , 50, 50);
	        	if(currentImage.equals(down1)) {
	        		currentImage = down2;
	        		imageIcon = new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource(currentImage)).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		    		player.setIcon(imageIcon);	
	        	}
	        	else if(currentImage.equals(down2)){
	        		currentImage = down1;
	        		imageIcon = new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource(currentImage)).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		    		player.setIcon(imageIcon);	
	        	}
	          
	        }
	        if (e.getKeyCode() == KeyEvent.VK_M) {
	        	 System.out.println(playerX + " and " + playerY);
		          
		        }
	    }

	    public void keyReleased(KeyEvent e) {

	    	
	    }
	}  
}
