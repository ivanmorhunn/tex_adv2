public class LeviathanRoom extends EnemyRoom{

    Leviathan enemy;
    //Leviathan leviathan = new Leviathan(Powers.Waterballs);

    public LeviathanRoom(int x, int y, Leviathan enemy) {
        super(x, y, enemy);
        this.enemy=enemy;
    }

    public String intro_text(){
        if (enemy.is_alive()) {
            return "As your ship sails through the churning waters, a massive shadow looms beneath the waves, sending shivers down your spine. Suddenly, a colossal sea serpent breaches the surface, its eyes fixed on your vessel. You ready your weapons and prepare for the ultimate battle against the LEVIATHAN.";
        }else{
            return "As you stand on the deck of your ship, facing the Leviathan's massive form towering over you, you brace yourself for the fight of your life, knowing that the fate of your crew and your vessel rests on your ability to defeat this legendary sea monster.";
        }
    }
}
