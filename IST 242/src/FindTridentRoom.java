public class FindTridentRoom extends LootRoom{
    public FindTridentRoom(int x, int y, Trident geld) {
        super(x,y, geld);
        //TODO Auto-generated constructor stub
    }

    public String intro_text(){
        if(pickedItem == false)
            return String.format("You explore the murky depths, your eyes scanning the ocean floor for anything of value. Suddenly, a glint catches your attention, and you swim towards it, discovering a magnificent TRIDENT OF NEPTUNE, crackling with power and ready to unleash its wrath upon your foes.\n");
        else
            return "";
    }
}
