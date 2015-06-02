package composition;

/**
 * Created by vishal on 22/5/15.
 */
public class Hyundai implements Car {
    Stopable brakes;
    Accelerator accelerator;

    public Hyundai(Stopable brakes, Accelerator accelerator) {
        this.brakes=brakes;
        this.accelerator=accelerator;
    }

    @Override
    public void drive() {
        accelerator.acclerate();
        brakes.applyBrakes();
    }
}
