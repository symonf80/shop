public class BoxingGloves extends Products implements Boxing, SportsEquipment {
    //Interface Segregation Principle - применяем разные интерфейсы вместо одного большого
    //Dependency Inversion Principle - разделив интерфейсы мы не зависим от их общей функциональности,
    // мы можем поменять один интерфейс на другой
    private final String name = "Боксерские перчатки";
    private final int price = 1000;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void carry() {
        System.out.println("Перчатки взял с собой");
    }

    @Override
    public void typeOf() {
        System.out.println("Перчатки есть");
    }
}
