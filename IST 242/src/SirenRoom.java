public class SirenRoom extends EnemyRoom{

    Siren enemy;

    public SirenRoom(int x, int y, Siren enemy) {
        super(x, y, enemy);
        this.enemy=enemy;
    }

    public String intro_text(){
        if (enemy.is_alive()) {
            return "As you approach the rocky shore, a haunting melody fills the air, drawing you towards the source. Soon, you spot a beautiful woman perched on a jagged outcropping, singing a hypnotic tune. As you draw closer, the woman's true form is revealed - a DEADLY SIREN with razor-sharp claws and a thirst for blood.";
        }else{
            return "As the enchanting melody of the Siren's song fades away, you regain control of your senses and let out a relieved sigh, grateful to have overcome the bewitching allure and emerged victorious from the perilous encounter.";
        }
    }
}
