import java.awt.*;
//Anthony Lam, 12/5/24, BrickBreak Methods for ball are made here

public class Ball {
	//your code here!
	//don't forget you need instance variables:
	private int x; int y; int size; 
	private int xVelocity = 0; 
	private int yVelocity = 0;
	//constructor(s):
	public Ball(int x, int y, int size){
		this.x = x;
		this.y = y;
		this.size = size;
		xVelocity = 2;
		yVelocity = -2;
	}
	//methods:
	public void setX(int x){
		this.x = x;
	}
	public void setY(int y){
		this.y = y;
	}
	public void setXVelocity(int xVelocity){
		this.xVelocity = xVelocity;
	}
	public void setYVelocity(int yVelocity){
		this.yVelocity = yVelocity;
	}
	public int getYpos(){
		return(y);
	}
	public int getXpos(){
		return(x);
	}
	public int getSize(){
		return(size);
	}
	public void reverseY(){
		yVelocity = yVelocity * -1;
	}
	public void reverseX(){
		xVelocity = xVelocity * -1;
	}
	//Pre-condition - There is not precondition to call the method
	//Post-condition - Will on screen move the ball and prevents the ball from leaving the screen
	public void move(){
		x += xVelocity;
		y += yVelocity;
	}
	//Pre-condition - Make sure g is not null
	//Post-condition - Will set the shape of the ball to a circle
	public void draw(Graphics g){
		g.fillOval(x, y, size, size);

	}
}
