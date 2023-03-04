package game;


import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


import game.Game.KeyListenerExample;

public class Level1 {

	Game game;
	KeyListenerExample kListener;
	
	//private JPanel bgPanel;
	public JLabel ring1, ring2, ring3, ring4, door, lake, lake2, lake3, lake4;
	
	ImageIcon imageDoor;

	
	//position of the rings and door
	private int ring1X, ring1Y, ring2X, ring2Y, ring3X, ring3Y, ring4X, ring4Y, doorX, doorY, lakeX, lakeY, lake2X, lake2Y, lake3X, lake3Y, lake4X, lake4Y;
	//does the player has found a ring
	private boolean hasRing = false;
	
	boolean ring1Found, ring2Found, ring3Found, ring4Found = false;
	
	JLabel[]tiles=new JLabel[20];
	
	
	private JLabel tile;
	private int tileX, tileY;
	
	
	public Level1(Game game, KeyListenerExample kListener) {
		this.game = game;
		this.kListener = kListener;
		
	}
	
	public void gameStart() {
	
		objects();
		drawTrees();
	}

	public void objects() {
		ring1 = new JLabel();
		ring1X = 200;
		ring1Y = 400;
		ring1.setBounds(ring1X, ring1Y , 50, 50);
		ImageIcon imageRing1 = new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("diamondRing.png")).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		ring1.setIcon(imageRing1);
		
		game.bgPanel.add(ring1);
		
		ring2 = new JLabel();
		ring2X = 150;
		ring2Y = 100;
		ring2.setBounds(ring2X, ring2Y , 50, 50);
		ImageIcon imageRing2 = new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("diamondRing.png")).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		ring2.setIcon(imageRing2);
		
		game.bgPanel.add(ring2);
		
		ring3 = new JLabel();
		ring3X = 400;
		ring3Y = 150;
		ring3.setBounds(ring3X, ring3Y , 50, 50);
		ImageIcon imageRing3 = new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("diamondRing.png")).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		ring3.setIcon(imageRing3);
		
		game.bgPanel.add(ring3);
		
		ring4 = new JLabel();
		ring4X = 350;
		ring4Y = 350;
		ring4.setBounds(ring4X,ring4Y , 50, 50);
		ImageIcon imageRing4 = new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("diamondRing.png")).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		ring4.setIcon(imageRing4);
		
		game.bgPanel.add(ring4);
		
		door= new JLabel();
		doorX = 400;
		doorY = 400;
		door.setBounds(doorX,doorY , 50, 50);
		imageDoor = new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("doorClosed.png")).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		door.setIcon(imageDoor);
		door.setVisible(false);
		game.bgPanel.add(door);
		
		lake = new JLabel();
		lakeX = 250;
		lakeY = 100;
		lake.setBounds(lakeX, lakeY, 50, 50);
		ImageIcon imageLake = new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("lake1.png")).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		lake.setIcon(imageLake);
		game.bgPanel.add(lake);
		
		lake2 = new JLabel();
		lake2X = 300;
		lake2Y = 100;
		lake2.setBounds(lake2X, lake2Y, 50, 50);
		ImageIcon imageLake2 = new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("lake2.png")).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		lake2.setIcon(imageLake2);
		game.bgPanel.add(lake2);
		
		lake3 = new JLabel();
		lake3X = 250;
		lake3Y = 150;
		lake3.setBounds(lake3X, lake3Y, 50, 50);
		ImageIcon imageLake3 = new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("lake3.png")).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		lake3.setIcon(imageLake3);
		game.bgPanel.add(lake3);
		
		lake4 = new JLabel();
		lake4X = 300;
		lake4Y = 150;
		lake4.setBounds(lake4X, lake4Y, 50, 50);
		ImageIcon imageLake4 = new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("lake4.png")).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		lake4.setIcon(imageLake4);
		game.bgPanel.add(lake4);
		
	}
	public void drawTrees() {
		
		int row = game.screenWidth/50;
		
		int x2 = 0;
		int y = 0;
		for(int i = 0; i < row-1;i++) {
			
			tile = new JLabel();
			tile.setBounds(tileX,tileY, 50, 50);
			ImageIcon imageTile = new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("tile.png")).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
			tile.setIcon(imageTile);
			game.bgPanel.add(tile);		
			tileY=0;
			tileX = tileX+50;
			
		}
		for(int i = 0; i < row-1;i++) {
			
			tile = new JLabel();
			tile.setBounds(x2,game.screenHeight-100, 50, 50);
			ImageIcon imageTile = new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("tile.png")).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
			tile.setIcon(imageTile);
			game.bgPanel.add(tile);		
			
			x2 = x2+50;
		}
		
		for(int i = 0; i < row-1;i++) {
			
			JLabel tile2 = new JLabel();
			tile2.setBounds(0,y, 50, 50);
			ImageIcon imageTile = new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("tile.png")).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
			tile2.setIcon(imageTile);
			game.bgPanel.add(tile2);		
			y = y + 50;
			
		}
		int y2 = 0;
		for(int i = 0; i < row-1;i++) {
			
			JLabel tile3 = new JLabel();
			tile3.setBounds(game.screenWidth-60,y2, 50, 50);
			ImageIcon imageTile = new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("tile.png")).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
			tile3.setIcon(imageTile);
			game.bgPanel.add(tile3);		
			y2 = y2 + 50;
			
		}
	}

	public void playGame() {
		
		//check if the player is touching the tile
		//if the tile is solid don't let the player walk any further

		
		if(game.playerY <= tileY+40 ) {
			game.playerY = game.playerY +10;
			
		}
		if(game.playerY > game.screenHeight - 150 ) {
			game.playerY = game.playerY -10;
			
		}
		if(game.playerX < 50 ) {
			game.playerX = game.playerX +10;
			
		}
		if(game.playerX == game.screenWidth - 100 ) {
			game.playerX = game.playerX -10;
			
		}
	


		if(game.playerX == ring1X && game.playerY == ring1Y) {
			
			ring1.setVisible(false);
			ring1Found = true;
			door.setVisible(true);
			
		}
		if(game.playerX == ring2X && game.playerY == ring2Y) {
			ring2Found = true;
			ring2.setVisible(false);
			
		}
		if(game.playerX == ring3X && game.playerY == ring3Y) {
			ring3Found = true;
			ring3.setVisible(false);
			
		}
		if(game.playerX == ring4X && game.playerY == ring4Y) {
			ring4Found = true;
			ring4.setVisible(false);
			
		}
		
		if(ring1Found == true && ring2Found == true && ring3Found == true && ring4Found == true) {
			hasRing = true;
			
		}
		//when the player gets to the door
		//check if the player found all the rings
		//then the door is opening
		if(game.playerX == doorX && game.playerY == doorY+50) {
			if(hasRing == true) {
				imageDoor = new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("doorOpened.png")).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
				door.setIcon(imageDoor);
			}else {
				
				System.out.println("You need all the rings to open the door");
			}
		}
		if(hasRing == true) {
			imageDoor = new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("doorOpened.png")).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
			door.setIcon(imageDoor);
		}
		if(game.playerX == doorX && game.playerY == doorY && hasRing == true) {
			System.out.println("you are reaching level 2");
			game.l1 = false;
			game.l2 = true;
			game.level2.gameStart();
		}		
		
	}
		
}
