
package Task1;

public class Plant {
    
    String name;
    String color;

    public Plant(String name, String color) {
        this.name = name;
        this.color = color;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public String toString(){
        return "\nName: "+name+", Color: "+color;
    }
}
