public class Creatine extends Products implements SportsFood {
    private final String name = "Креатин";
    private final int price = 200;

    @Override
    public void eat() {
        System.out.println("Креатин закончился");
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name;
    }
}
