
public class Dice {
private Die die1;
private Die die2;

public Dice() {
	die1=new Die();
	die2=new Die();
}

public int getDie1Value() {
	return die1.geValue();
}
public int getDie2Value() {
	return die2.geValue();
}

int sum=0;
public int getSum() {
	return die1.geValue()+die2.geValue();
	
}
public void roll() {
	die1.roll();
	die2.roll();
}


public void displayTheResults() {
	int total=getSum(); 
	System.out.println();
	System.out.println("Die 1: "+die1.geValue());
	System.out.println("Die 2:"+die2.geValue());
	System.out.println("Total: "+total);
	if(total==7) {
		System.out.println("Craps!");
	}else if(total==2) {
		System.out.println(" snake eyes ");
	}

}
}
