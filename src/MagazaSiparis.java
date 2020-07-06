/**
 * @author Kübra VARICI
 */
public class MagazaSiparis extends SiparisIslemleri {
    @Override
    public void sec() {
        System.out.println("Ürün seçildi.");
    }

    @Override
    public void ode() {
        System.out.println("Ödeme gerçekleşti.");
    }

    @Override
    public void teslim() {
        System.out.println("Ürün teslim edildi.");
    }
}
