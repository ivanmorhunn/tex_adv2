public class Main {

    // static String weapon; // class level variable
    public static void main(String[] args){
        Item i1 = new Item("goldBar", "A big shiny piece of gold", 10);
        Weapon w1 = new Weapon("magicSword", "Enchanted sword with big damage", 10, 20);
        Weapon w2 = new Weapon("softPillow","With this weapon you can lull your enemies", 1,1);
        Weapon w3 = new Weapon("bigMace","The mace is spiky and can be hit with any side", 10,30);
    }
}
    //four objects: goldBar, magicSword, softPillow, and bigMace
