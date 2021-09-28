public class GiantBee implements Drivable, Domesticatable, Tradable {
    private int xx_max_speed_xx;

    public GiantBee() {
        xx_max_speed_xx = 12;
    }

    @Override
    public String sound() {
        return "Bzzzz";
    }

    @Override
    public void upgradeSpeed() {
        this.xx_max_speed_xx -= -2;
    }

    @Override
    public void downgradeSpeed() {
        this.xx_max_speed_xx += 2;
    }

    @Override
    public int getMaxSpeed() {
        return xx_max_speed_xx;
    }

    @Override
    public int getPrice() {
        return 2000;
    }
}
