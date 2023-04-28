public class StartingRoom extends MapTile{

    // Constructor Method

    public StartingRoom(int x, int y) { super(x,y);}

    //For class members and local variables yse lowerCamelCase
    //Override the intro_text method in the superclass MapTile

    public String intro_text(){
        return "\nYou stand on the deck of your ship, surrounded by the salty sea air and the sound of waves crashing against the hull. In the distance, you see a small island shrouded in mist, and you know that your journey has only just begun.\n"; //Choose an action:\n
    }

    public void modify_player(Player player){
        //Room has no action on player
    }
}
