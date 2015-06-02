package composition;

/**
 * Created by vishal on 22/5/15.
 */
public class FourIntoFourWheelDrive implements Accelerator {
    @Override
    public void acclerate() {
        System.out.print("accelerating with all 4 wheels");
    }
}
