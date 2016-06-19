package autodesk;

public class LabradorDog extends Dog{
	
	public LabradorDog(){
		breed = new Breed(Breed.LABRADOR);
	}
	
	public LabradorDog(long id, String name) {
		super(id,name,new Breed(Breed.LABRADOR));
		
		System.out.println("New Player of "+Breed.LABRADOR+" is created");
		System.out.println("Details: Id - " + this.getId() + ", Name - " + this.getName() + ", Breed - " + this.breed.getName());
	}
	
	@Override
	public String fetchBall(Size size) throws DogException  {
			
		ball  = new Ball(size);
		if(size == Size.Small){
			System.out.println("***** New Ball is fetched, (" + this.getName()+ "). "+Breed.LABRADOR+" loved playing with "+Size.Small+" ball.");
			return LIKE;
		}else{
			System.out.println("***** New Ball is fetched, (" + this.getName()+ "). "+Breed.LABRADOR+" Don't Play with "+Size.Large+" ball.");
			throw new DogException(20,HATE);
			
		}

	}

	@Override
	public String throwBall() {
		this.ball.move();
		System.out.println("***** "+Breed.LABRADOR+" (" + this.getName()+ ") is throwing the ball");
		return MOVED;
	}
}
