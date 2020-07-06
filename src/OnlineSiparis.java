/**
 * @author Kübra VARICI
 */
public class OnlineSiparis extends SiparisIslemleri {
    @Override
    public void sec() {
        System.out.println("Ürün sepete eklendi.");
    }

    @Override
    public void ode() {
        System.out.println("Online ödeme gerçekleşti.");
    }

    @Override
    public void teslim() {
        System.out.println("Ürün kargoya verildi.");
    }
}
