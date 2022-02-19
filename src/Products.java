public abstract class Products {
    private String name;
    private int price;
    private int count;

    public String getName() {
        return name;
    }

    public Products setName(String name) {
        this.name = name;
        return this;
    }

    public int getCount() {
        return count;
    }

    public Products setCount(int count) {
        this.count += count;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public Products setPrice(int price) {
        this.price = price;
        return this;
    }

    @Override
    public String toString() {
        return name;
    }

}
