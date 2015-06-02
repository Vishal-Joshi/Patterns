package composition;

/**
 * Created by vishal on 22/5/15.
 */
public class Main {

    public static void main(String[] args){
        Stopable brakesWithoutAbs = new BrakeWithoutAbs();
        Accelerator accelerator = new TwoIntoTwoWheelDrive();
        Hyundai hyundai = new Hyundai(brakesWithoutAbs, accelerator);
        hyundai.drive();
    }
}
