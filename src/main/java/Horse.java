/* A sample class that implements the given interfaces.
 */
public class Horse implements Drivable, Domesticatable, Tradable {
    private int maxSpeed;

    public Horse() {
        this.maxSpeed = 1;
    }

    @Override
    public String sound() {
        return "Neigh!";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }



    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
