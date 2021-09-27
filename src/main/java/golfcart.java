public class golfcart implements Drivable, Tradable{ private int maxSpeed;public golfcart() {this.maxSpeed = 9999;}public void upgradeSpeed() {this.maxSpeed++;}public void downgradeSpeed() {
        this.maxSpeed--;
    }public int getMaxSpeed() {
        return this.maxSpeed;
    }@Override public int getPrice() {
        return 9999;
    }}
