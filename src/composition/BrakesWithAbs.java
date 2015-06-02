package composition;

/**
 * Created by vishal on 22/5/15.
 */
public class BrakesWithAbs implements Stopable {
    @Override
    public void applyBrakes() {
        System.out.print("brakes with ABS");
    }
}
