public class FindHarpoonRoom extends LootRoom{
    public FindHarpoonRoom(int x, int y, Harpoon geld) {
        super(x,y, geld);
        //TODO Auto-generated constructor stub
    }

    public String intro_text(){
        if(pickedItem == false)
            return String.format("You spot a discarded HARPOON lying on the deck of a wrecked ship, its sharp tip gleaming in the sunlight. You pick it up and feel the weight of the weapon in your hand, knowing it could be the key to your survival in the treacherous waters ahead.\n");
        else
            return "";
    }
}
