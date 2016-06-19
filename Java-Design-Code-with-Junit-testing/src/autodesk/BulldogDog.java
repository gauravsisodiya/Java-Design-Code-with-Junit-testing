package autodesk;

public class BulldogDog extends Dog{
	
	public BulldogDog(){
		breed = new Breed(Breed.BULLDOG);
	}
	
	public BulldogDog(long id, String name) {
		super(id,name,new Breed(Breed.BULLDOG));
		
		System.out.println("New Player of "+Breed.BULLDOG+" is created");
		System.out.println("Details: Id - " + this.getId() + ", Name - " + this.getName() + ", Breed - " + this.breed.getName());
	}
	
	
	@Override
	public String fetchBall(Size size) throws DogException {
			
		ball  = new Ball(size);
		if(size == Size.Large){
			System.out.println("***** New Ball is fetched, (" + this.getName()+ "). "+Breed.BULLDOG+" loved playing with "+Size.Large+" ball.");
			return LIKE;
		}else{
			System.out.println("***** New Ball is fetched, (" + this.getName()+ "). "+Breed.BULLDOG+" Don't Play with "+Size.Small+" ball.");
			throw new DogException(50,HATE);
		}
	}

	@Override
	public String throwBall() {
		this.ball.move();
		System.out.println("***** "+Breed.BULLDOG+" (" + this.getName()+ ") is throwing the ball");
		return MOVED;
	}
}
