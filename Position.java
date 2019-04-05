/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atomx;

/**
 *
 * @author nous
 */
public class Position {
    private int x;
    private int y;

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    public Position(int x, int y) {
        setX(x);
        setY(y);
    }
    @Override
    public String toString() {
        return "P x: " + x + ", y: " + y;
    }
    
    public void modif(Direction d){
        setX(x+d.getX());
        setY(y+d.getY());
    }
    public boolean equals(Position a){
        return this.getX()==a.getX()&&this.getY()==a.getY();
    }
    
}