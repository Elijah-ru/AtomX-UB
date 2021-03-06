/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atomx_1_1;

/**
 *
 * @author nous
 */
public class Particule {
    private Position pos;
    private Direction dir;
    private boolean active;
    private int poid;

    public void setPos(Position pos) {
        this.pos = pos;
    }
    public void setDir(Direction dir) {
        this.dir = dir;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
    public Position getPos() {
        return pos;
    }
    public Direction getDir() {
        return dir;
    }
    public boolean isActive() {
        return active;
    }
    public int getPoid() {
        return poid;
    }
    public void setPoid(int poid) {
        this.poid = poid;
    }
    

    public Particule(Position pos, Direction dir, int poid) {
        setPos(pos);
        setDir(dir);
        setPoid(poid);
        setActive(true);
    }
    public void nvPoid(int poidObstacle){
        setPoid(getPoid()-poidObstacle);
    }
    public void tourne(int tours){
        Direction d=this.getDir();
        if(tours%2==0){
            if(tours%4==2){
                if(d.getX()!=0)
                    d.setX(-this.getDir().getX());
                else
                    d.setY(-this.getDir().getY());
                }
            }
        else{
            if(tours%4==1){
                if(d.getX()!=0){
                    d.setY(d.getX());
                    d.setX(0);
                    }
                else{
                    d.setX(-d.getY());
                    d.setY(0);
                    }
                }
            else{//tours%4==3
                if(d.getX()!=0){
                    d.setY(-d.getX());
                    d.setX(0);
                    }
                else{
                    d.setX(d.getY());
                    d.setY(0);
                    }
                }
            }
        }

    @Override
    public String toString() {
        return "Particule{" + "pos=" + pos + ", dir=" + dir + ", active=" + active + ", poid=" + poid + '}';
    }
    public void arret(int taille){
        int x=getPos().getX(), y=getPos().getY();
        if (x>=taille || x<0 || y>=taille || y<0){
            setActive(false);
            }
        }
    
}

