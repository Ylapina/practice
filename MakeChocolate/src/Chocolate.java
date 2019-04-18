
public class Chocolate {
	private int small;
	private int big;
	private int goal;
	public int getSmall() {
		return small;
	}
	
	public Chocolate(int small, int big, int goal) {
		super();
		this.small = small;
		this.big = big;
		this.goal = goal;
	}

	public void setSmall(int small) {
		this.small = small;
	}
	public int getBig() {
		return big;
	}
	public void setBig(int big) {
		this.big = big;
	}
	public int getGoal() {
		return goal;
	}
	public void setGoal(int goal) {
		this.goal = goal;
	}
	@Override
	public String toString() {
		return "Chocolate [small=" + small + ", big=" + big + ", goal=" + goal + "]";
	}
	
	

}
