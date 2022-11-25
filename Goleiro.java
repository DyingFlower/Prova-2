package Penaltis;

import java.util.Random;

public class Goleiro {
	int position;
	
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public int randomizargoleiro() {
		int position;
		Random random = new Random();
		position= random.nextInt(137,154);
		this.position = position;
		return position;
	}
}
