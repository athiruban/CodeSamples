/*
    Clone creates a separate copy of the object. This is similar to call by copy.
*/

package javaclone;

class Color {
    private String color;
    public Color(String c){
        this.color = c;
    }
}

class ColoredCircle implements Cloneable {
    private int centerX;
    private int centerY;
    private Color color;

    public ColoredCircle(int x, int y, Color c) {
        this.centerX = x;	
	this.centerY = y;
	this.color   = c;
    }

    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException e) {
            // This should never happen
        }
        return null;
    }
    
    public int getX(){
    	return this.centerX;
    }
    
    public int getY(){
    	return this.centerY;
    }
    
    public void setX(int x){
    	this.centerX = x;
    }
    
    public void setY(int y){
    	this.centerY = y;
    }
}

public class CloneMain {
    public static void main(String [] args) {
	Color c = new Color("RED");
        ColoredCircle c1 = new ColoredCircle(200,200,c);
        c1.setX(300);

        ColoredCircle c2 = (ColoredCircle) c1.clone();
        System.out.println("circle 2 x: " + c2.getX());
        c1.setX(400);
        System.out.println("circle 2 x: " + c2.getX());
    }
}