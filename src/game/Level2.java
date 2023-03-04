package game;



import javax.swing.JOptionPane;

public class Level2 {

	Game game;
	
	
	
	public Level2(Game game) {
		this.game = game;
		
	}
	public void gameStart() {
		JOptionPane.showMessageDialog(null, "LEVEL 2 IS COMING SOON1");
		
	}
	

	public void playGame() {
		
		game.level1.door.setVisible(false);
		
		
	}
}
