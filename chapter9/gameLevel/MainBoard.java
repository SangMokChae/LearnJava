package gameLevel;

public class MainBoard {
	public static void main(String[] args) {
		Player player = new Player();
		player.Play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.Play(2);
//		player.getLevel().go(2); °°À½
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.Play(3);
	}
}
