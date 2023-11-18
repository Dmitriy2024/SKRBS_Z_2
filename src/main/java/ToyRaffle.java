public class ToyRaffle {
    public static void main(String[] args) {
        ToyStore store = new ToyStore();

        Toy toy1 = new Toy(1, "Конструктор", 50, 10);
        Toy toy2 = new Toy(2, "Робот", 50, 20);
        Toy toy3 = new Toy(3, "кукла", 50, 60);


        store.addToy(toy1);
        store.addToy(toy2);
        store.addToy(toy3);

        int numRaffles = 10;

        store.changeToyFrequency(1, 30);
        for (int i = 0; i < numRaffles; i++) {
            store.organizeRaffle();

            Toy prizeToy = store.getPrizeToy();
            if (prizeToy != null) {
                System.out.println((i + 1) + " Выпала игрушка: " + prizeToy.getName());
            }
        }
    }
}