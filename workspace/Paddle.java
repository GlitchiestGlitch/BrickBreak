import java.awt.*;
//Anthony Lam, 12/5/24, BrickBreak Methods for paddle are made here
public class Paddle {

	//your code here!
	//don't forget you need instance variables:
	private int x ,y ,width ,height;
	private int xVelocity;
	//constructor(s):
	public Paddle(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	//methods:
	public int getY(){
		return(y);
	}
	public int getX(){
		return(x);
	}
	public int getWidth(){
		return(width);
	}
	public int getHeight(){
		return(height);
	}
	public void setX(int x){
		this.x = x;
	}
	public int getVelocity(){
		return(xVelocity);
	}
	public void setVelocity(int xVelocity){
		this.xVelocity = xVelocity;
	}

	//Pre-condition - There is not precondition to call the method
	//Post-condition - Will on screen move the paddle and prevents the paddle from leaving the screen
	public void move(){
		x = x + xVelocity;
		if (x > 585){
			x = 585;
			xVelocity = 0;
		}
		if (x < 0){
			x = 0;
			xVelocity = 0;
		}
	}
	//Pre-condition - Make sure g is not null
	//Post-condition - Will set the shape of the paddle to a rectangle
	public void draw(Graphics g){
		g.fillRect(x, y, width, height);
	}
}
