package autodesk;

public class Dog extends Animal implements Player {
	
	public static final String LIKE = "Like playing";
	public static final String HATE = "hate playing";
	public static final String ALWAYS_LIKE = "Always Like playing";
	
	public static final String MOVED = "Moved the ball";
	
	
	protected Breed breed;
	
	public Dog() {
		super();
	}

	public Dog(long id, String name, Breed breed) {
		super(id,name);
		this.breed = breed;
		
		System.out.println("New Player of Base Class Dog is created");
		System.out.println("Details: Id - " + this.getId() + ", Name - " + this.getName() + ", Breed - " + this.breed.getName());
	}
	
	public Breed getBreed() {
		return breed;
	}
	public void setBreed(Breed breed) {
		this.breed = breed;
	}

	@Override
	public String fetchBall(Size size) throws DogException {
			
		ball  = new Ball(size);
		System.out.println("***** New Ball is fetched by Generic Dog (" + this.getName()
				+ ").");
		return LIKE;
	}

	@Override
	public String throwBall() {
		this.ball.move();
		System.out.println("***** Throw ball method is called by Generic Dog(" + this.getName()
				+ ").");
		return MOVED;
	}

}
