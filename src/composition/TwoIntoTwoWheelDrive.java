package composition;

/**
 * Created by vishal on 22/5/15.
 */
public class TwoIntoTwoWheelDrive implements Accelerator {
    @Override
    public void acclerate() {
        System.out.print("Two into two wheel drive");
    }
}
