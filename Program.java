import java.util.ArrayList;
import java.util.List;


public class Program {
    public static void main(String[] args) {

        Toy toy1 = new Toy(0, "Конструктор", 20);
        Toy toy2 = new Toy(1, "Робот", 20);
        Toy toy3 = new Toy(2, "Кукла", 60);


        List<Toy> toys = new ArrayList<Toy>();
        toys.add(toy3);
        toys.add(toy2);
        toys.add(toy1);

        ToyStore toyStore = new ToyStore(toys);
        toyStore.saveToyForLottery();



    }


}