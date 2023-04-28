public class EmptySeaPath extends MapTile{
    // Constructor Method

    public EmptySeaPath(int x, int y) { super(x,y);}

    //For class members and local variables yse lowerCamelCase
    //Override the intro_text method in the superclass MapTile

    public String intro_text(){
        return "Amidst the endless expanse of the sea, you drift aimlessly on your ship, the gentle sound of waves lulling you into a sense of calm. Suddenly, a dark shape emerges from the depths, its eyes fixated on your vessel, and you realize with growing dread that you are not alone out here.";
    }

    public void modify_player(Player player){
        //Room has no action on player
    }
}
