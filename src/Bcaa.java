public class Bcaa extends Products implements SportsFood {
    //Single Responsibility Principle - класс Bcaa описывает только BCAA, а не все продукты
    private final String name = "BCAA";
    private final int price = 300;

    @Override
    public void eat() {
        System.out.println("BCAA закончился");
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
