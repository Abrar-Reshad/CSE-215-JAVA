
package Task1;


public class Flower extends Plant{
    
    boolean hassmell;
    boolean hasthorn;

    

    public Flower(String name, String color,boolean hassmell, boolean hasthorn) {
        super(name, color);
        this.hassmell = hassmell;
        this.hasthorn = hasthorn;
    }

    public boolean isHassmell() {
        return hassmell;
    }

    public void setHassmell(boolean hassmell) {
        this.hassmell = hassmell;
    }

    public boolean isHasthron() {
        return hasthorn;
    }

    public void setHasthron(boolean hasthron) {
        this.hasthorn = hasthron;
    }
    
    public String toString(){
        return super.toString()+"\nHasSmell: "+hassmell+", HasThorn: "+hasthorn; 
}
}
