public class Golfcart implements Drivable, Tradable {
    private int maxSpeed;

    public Golfcart() {
        this.maxSpeed = 9999;
    }

    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public int getPrice () {
            return 9999;
        }
    }