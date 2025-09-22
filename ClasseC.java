//Alterei aqui pra causar conflito

public class C {
    private String C1;
    private int C2;

    public String getC1() { return C1; }
    public void setC1(String C1) { this.C1 = C1; }

    public int getC2() { return C2; }
    public void setC2(int C2) { this.C2 = C2; }

    public void MC1() {
        System.out.println("Método MC1 executado");
    }

    public void MC2() {
        System.out.println("Método MC2 executado");
    }
    public void MC3() {
    System.out.println("Método MC3 executado");

// Colocando isso aqui para causar conflito com o git web
}
}
