
public class Sheep extends Animal implements Countable {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getCountString() {
		
		return count + name;
	}
	 // implement the clonable interface
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
	
	

}
