public class Akun {
    protected String username;
    protected double saldo;

    public Akun(String username, double saldo) {
        this.username = username;
        this.saldo = saldo;
    }
}
    class AkunPremium extends Akun {
    private double batasKredit;

    public AkunPremium(String username, double saldo, double batasKredit) {
        super(username, saldo);
        this.batasKredit = batasKredit;
    }

    public void cekLimit() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Batas Kredit: " + batasKredit);
    }
}
