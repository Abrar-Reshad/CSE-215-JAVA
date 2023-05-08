
package Task1;


public class Herb extends Plant {
    boolean isMedicinal;
    String season;

    public Herb( String name, String color,boolean isMedicinal, String season) {
        super(name, color);
        this.isMedicinal = isMedicinal;
        this.season = season;
    }

   
    public boolean isIsMedicinal() {
        return isMedicinal;
    }

    public void setIsMedicinal(boolean isMedicinal) {
        this.isMedicinal = isMedicinal;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }
    
    
    public String toString(){
        return super.toString()+"\nIsMedicinal: "+isMedicinal+", Season: "+season;
    }
}
