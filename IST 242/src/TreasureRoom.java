public class TreasureRoom extends LootRoom{
    public TreasureRoom(int x, int y, Gold geld) {
        super(x,y, geld);

        //TODO Auto-generated constructor stub
    }

    public String intro_text(){
        if(pickedItem == false)
            return String.format("As you scour the deserted island for resources and provisions, you come across a small chest half-buried in the sand. Inside, you find a shiny gold coin with the number 10 engraved on it. You picked it up and put it in your pocket.");
        else
            return "";
    }

}
