public class Proteins extends Products implements SportsFood {
    //Open Closed Principle - имплментируя интерфейс SportFood мы добавляем
    // классу функциональности, не изменяя его код

    private final String name = "Протеин";
    private final int price = 100;

    @Override
    public void eat() {
        System.out.println("Протеин закончился");
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
