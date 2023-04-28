public class Item {

    protected String name;
    protected String description;
    protected int value;

    public Item(String name, String description, int value){
        this.name = name;
        this.description = description;
        this.value = value;
    }

    public String toString(){
        return String.format("%s \n=====\n %s \nValue: %d \n",  this.name, this.description, this.value);
    }

    public void setName(String nameStr) {
        this.name = nameStr;
    }

    public String getName() {
        return this.name;
    }
}
