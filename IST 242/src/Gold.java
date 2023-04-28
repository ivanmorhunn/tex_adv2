public class Gold extends Item {

    public int amt;
    // Constructor method
    public Gold(int amt) {
        super("Gold", String.format("A round coin with %s stamped on the front.", String.valueOf(amt)), amt);
        this.amt = amt;
    }
    public Gold(String name, int amt) {
        super("Gold", String.format("A round coin with %s stamped on the front.", String.valueOf(amt)), amt);
        this.amt = amt;
    }
}