package inheritance;

/**
 * Created by vishal on 22/5/15.
 */
public class Car implements Drivable {
    @Override
    public void applyBrakes() {
        System.out.print("apply Brakes");
    }

    @Override
    public void accelerate() {
        System.out.print("accelerate");
    }
}
