package autodesk;

import java.util.concurrent.atomic.AtomicInteger;

public class Breed {
	private static final AtomicInteger count = new AtomicInteger(0); 

	public static final String GERMAN_SHEPHERD = "GermanShepherd";
	public static final String LABRADOR = "Labrador";
	public static final String BULLDOG = "Bulldog";
						
	private long id;
	private String name;
	
	public Breed() {
		
	}
	
	public Breed(String breed) {
		
		this.id = count.getAndIncrement();
		this.name = breed;
		System.out.println("New Breed object is created for " + this.name);
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
	public void setName(String breed) {
		this.name = breed;
	}
	
}
