package Products;

public class Products {
    private String name;
    private int costInCents;

    public Products(String name, int costInCents) {
        this.name = name;
        this.costInCents = costInCents;
    }

    public String getName() {
        return name;
    }

    public int getCostInCents() {
        return costInCents;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }
}
