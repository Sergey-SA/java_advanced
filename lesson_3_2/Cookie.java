package staff;

public class Cookie extends Staff {

    private String brend;

    public Cookie(String name, int weight, int price, String brend) {
        super(name, weight, price);
        this.brend = brend;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    @Override
    public String toString() {
        return ("Cookie = [" + super.toString() + ", brend = " + brend + "}");
    }
}
