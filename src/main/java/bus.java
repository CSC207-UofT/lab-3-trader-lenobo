public class bus implements Drivable, Tradable {

    private int maxSpeed;

    public bus() {
        this.maxSpeed = 10;
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return 420420;
    }

    @Override
    public int getPrice() {
        return 91021;
    }
}
