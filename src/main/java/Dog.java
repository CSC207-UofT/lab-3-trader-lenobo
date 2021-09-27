public class Dog implements Tradable, Domesticatable{
    private int price;

    public Dog(){
        this.price = 1;
    }

    public int getPrice(){
        return this.price;
    }

    public String sound(){
        return "WOOF!";
    }
}
