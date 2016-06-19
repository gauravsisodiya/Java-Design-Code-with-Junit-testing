package autodesk;

import java.util.concurrent.atomic.AtomicInteger;

public class Game {
	private static final AtomicInteger count = new AtomicInteger(0); 
	
	long id;
	String name;

	public Game() {
	}

	public Game(String name) {
		this.id = count.getAndIncrement();
		this.name = name;
		System.out.println("New Game Type object for Ball is created of " + this.name);
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
