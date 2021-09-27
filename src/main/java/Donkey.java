public class Donkey implements Drivable, Domesticatable, Tradable {
    private int mAxSpEeD;
    // Documentation
    public Donkey() {
        this.mAxSpEeD = 1;
    }

    @Override
    public String sound() {
        return "AHHHHHH!";
    }

    @Override
    public void upgradeSpeed() {
        this.mAxSpEeD += 1;
    }

    @Override
    public void downgradeSpeed() {
        this.mAxSpEeD -= 1;
    }

    @Override
    public int getMaxSpeed() {
        return this.mAxSpEeD;
    }

    @Override
    public int getPrice() {
        return 100;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.mAxSpEeD +")";
    }
}
