package MethodContainer;

public class Methods {
    protected static void pr(String s) {
        System.out.print(s);
    }

    protected static void prln(String s) {
        System.out.println(s);
    }

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private double gajiKotor;
    private double pajak;
    private double gajiBersih;

    public double getGajiKotor() {
        return gajiKotor;
    }

    public void setGajiKotor(double gajiKotor) {
        this.gajiKotor = gajiKotor;
    }

    public double getPajak() {
        return pajak;
    }

    public void setPajak(double pajak) {
        this.pajak = pajak;
    }

    public double getGajiBersih() {
        return gajiBersih;
    }

    public void setGajiBersih(double gajiBersih) {
        this.gajiBersih = gajiBersih;
    }
}