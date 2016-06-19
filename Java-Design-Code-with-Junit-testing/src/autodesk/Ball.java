package autodesk;

import java.util.concurrent.atomic.AtomicInteger;

public class Ball {
	private static final AtomicInteger count = new AtomicInteger(0); 
	long id;
	Game gameType;
	Size size;
	String color;
	private double rx, ry;        
	private double vx, vy;        
	private final double radius;  

	public Ball() {
		this.rx = 0.0;
        this.ry = 0.0;
        this.vx = 0.015 - Math.random() * 0.03;
        this.vy = 0.015 - Math.random() * 0.03;
        this.radius = 0.025 + Math.random() * 0.05;
	}

	public Ball(Size size) {
		this.rx = 0.0;
        this.ry = 0.0;
        this.vx = 0.015 - Math.random() * 0.03;
        this.vy = 0.015 - Math.random() * 0.03;
        this.radius = 0.025 + Math.random() * 0.05;
        
		this.id = count.getAndIncrement();
		this.size = getBallSize(size);
		this.gameType = getType();
		
	}

	private Size getBallSize(Size size) {
		if(size.equals(Size.Small)){
			return Size.Small;
		}else{
			return Size.Large;
		}
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Game getGameType() {
		return gameType;
	}

	public void setGameType(Game gameType) {
		this.gameType = gameType;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}
	
	private Game getType(){
		if(this.size == Size.Small){
			return new Game("Tennis");
		}else{
			return new Game("Soccer");
		}
	}
    private void bounceOffVerticalWall() {
        vx = -vx;
    }

    private void bounceOffHorizontalWall() {
        vy = -vy;
    }
	public void move() {
		if (Math.abs(rx + vx) + radius > 1.0) bounceOffVerticalWall();
        if (Math.abs(ry + vy) + radius > 1.0) bounceOffHorizontalWall();
        rx = rx + vx;
        ry = ry + vy;
		System.out.println("Ball has been moved.");
	}

}
