public class KrakenRoom extends EnemyRoom{

    Kraken enemy;

    public KrakenRoom(int x, int y, Kraken enemy) {
        super(x, y, enemy);
        this.enemy=enemy;
    }

    public String intro_text(){
        if (enemy.is_alive()) {
            return "As you navigate through the treacherous waters, you catch sight of the KRAKEN looming in the distance, its massive tentacles thrashing about and creating a vortex of waves, and you realize that your ship may not be strong enough to withstand its wrath.";
        }else{
            return "With the Kraken vanquished, its massive form sinking beneath the waves, you heave a sigh of relief, knowing that you have overcome one of the greatest challenges the sea has to offer.";
        }
    }
}
