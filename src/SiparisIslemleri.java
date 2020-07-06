/**
 * @author Kübra VARICI
 */
public abstract class SiparisIslemleri {
    public boolean hediyeMi;

    public abstract void sec();

    public abstract void ode();

    public final void hediyePaketle() {
        System.out.println("Hediye paketlendi.");
    }

    public abstract void teslim();

    public final void islemIlerlet() {
        sec();
        ode();
        if (hediyeMi) {
            hediyePaketle();
        }
        teslim();
    }
}
