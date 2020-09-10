package MethodPackage;

public class Methods {
    protected static void pr(String s) {
        System.out.print(s);
    }

    protected static void prln(String s) {
        System.out.println(s);
    }

    private double ballpointPrice = 2000.0, pencilPrice = 1000.0, eraserPrice = 500.0, totalPrice = 0.0;
    private int ballpointStock = 10, pencilStock = 10, eraserStock = 10;

    public double getBallpointPrice() {
        return ballpointPrice;
    }

    public void setBallpointPrice(double ballpointPrice) {
        this.ballpointPrice = ballpointPrice;
    }

    public double getPencilPrice() {
        return pencilPrice;
    }

    public void setPencilPrice(double pencilPrice) {
        this.pencilPrice = pencilPrice;
    }

    public double getEraserPrice() {
        return eraserPrice;
    }

    public void setEraserPrice(double eraserPrice) {
        this.eraserPrice = eraserPrice;
    }

    public int getBallpointStock() {
        return ballpointStock;
    }

    public void setBallpointStock(int ballpointStock) {
        this.ballpointStock = ballpointStock;
    }

    public int getPencilStock() {
        return pencilStock;
    }

    public void setPencilStock(int pencilStock) {
        this.pencilStock = pencilStock;
    }

    public int getEraserStock() {
        return eraserStock;
    }

    public void setEraserStock(int eraserStock) {
        this.eraserStock = eraserStock;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
