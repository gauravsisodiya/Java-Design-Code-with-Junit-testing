package autodesk;

public class Animal {
	private long id;
	private String name;
	protected Ball ball;
	
	public Animal(long id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("New Player of Class Dog is created");
		
	}
	public Animal() {
		
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
