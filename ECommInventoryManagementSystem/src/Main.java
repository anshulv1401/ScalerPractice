import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();

        items.add(new Item("1", "Item1", 10, 10));
        items.add(new Clothing("2", "TShift", 10, 10, 50));
        items.add(new Clothing("3", "Pants", 10, 10, 50));
        items.add(new Electronics("4", "Mobile", 10, 10, 9));
        items.add(new Electronics("5", "Laptop", 10, 10, 9));
        items.add(new Book("6", "Hand Of God", 10, 10, "Anshul"));
        items.add(new Book("7", "A Ramayana", 10, 10, "Mohit"));

        Collections.sort(items);

        Inventory<Item> inventory = new Inventory<>();
        inventory.addItems(items);

        inventory.getItem("1");
        inventory.getItem("4");
        inventory.getItem("5");
        inventory.getItem("7");
        inventory.getItem("3");
        inventory.getItem("1");
        inventory.getItem("6");

        for (Item item : inventory.getRecentlyViewedItems()) {
            System.out.println(item.id + ":" + item.name);
        }
    }
}