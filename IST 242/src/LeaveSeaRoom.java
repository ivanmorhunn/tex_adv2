public class LeaveSeaRoom extends MapTile{

    // Constructor Method

    public LeaveSeaRoom(int x, int y) { super(x,y);}

    //For class members and local variables yse lowerCamelCase
    //Override the intro_text method in the superclass MapTile

    public String intro_text(){
        return "The salty breeze whips through your hair as you set sail on your ship, leaving the safety of the harbor behind. The open sea stretches out before you, endless and mysterious, and you can't help but feel a sense of exhilaration mixed with trepidation as you chart your course towards adventure.\n";
    }

    public void modify_player(Player player) {
        player.hp = 0;
        //System.exit(0); // immediately terminate the game
        //The room should end the game
    }
}

