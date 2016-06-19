package autodesk;

public class GermanShepherdDog extends Dog{
	
	public GermanShepherdDog(){
		breed = new Breed(Breed.GERMAN_SHEPHERD);
	}
	
	public GermanShepherdDog(long id, String name) {
		super(id,name,new Breed(Breed.GERMAN_SHEPHERD));
		
		System.out.println("New Player of "+Breed.GERMAN_SHEPHERD+" is created");
		System.out.println("Details: Id - " + this.getId() + ", Name - " + this.getName() + ", Breed - " + this.breed.getName());
	}
	
	@Override
	public String fetchBall(Size size) {
			
		ball  = new Ball(size);
		System.out.println("***** New Ball is fetched, (" + this.getName()+ "). "+Breed.GERMAN_SHEPHERD+" loved playing with both the size of ball "+Size.Large+" and "+Size.Small+" ball.");
		return ALWAYS_LIKE;
	}

	@Override
	public String throwBall() {
		this.ball.move();
		System.out.println("***** "+Breed.GERMAN_SHEPHERD+" (" + this.getName()+ ") is throwing the ball");
		return MOVED;
	}
}
