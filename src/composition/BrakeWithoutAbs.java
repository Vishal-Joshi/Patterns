package composition;

/**
 * Created by vishal on 22/5/15.
 */
public class BrakeWithoutAbs implements Stopable {
    @Override
    public void applyBrakes() {
        System.out.print("braked without abs");
    }
}
