
public class ChocolateApp {

	public static int main(String[] args) {
		
		
		int makeChocolate(int small, int big, int goal) {

			int bigCapacity = goal/5;

			if (bigCapacity>=big && goal-big*5<=small) 
			 return goal-big*5;  
			else if (bigCapacity<big && goal%5<=small)
			 return goal%5;

			else return -1;

			}

	}

}
