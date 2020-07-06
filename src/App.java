/**
 * @author Kübra VARICI
 */
public class App {
    public static void main(String[] args) {
        System.out.println("--------- Online Sipariş --------");
        SiparisIslemleri onlineSiparis = new OnlineSiparis();
        onlineSiparis.islemIlerlet();

        System.out.println("--------- Mağaza Sipariş --------");
        SiparisIslemleri magazaSiparis = new MagazaSiparis();
        magazaSiparis.hediyeMi = true;
        magazaSiparis.islemIlerlet();
    }
}
