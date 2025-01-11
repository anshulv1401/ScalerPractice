import Example.ArrayCreator;
import Example.Foo;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {

//        List<Item> items = new ArrayList<>();
//
//        items.add(new Item("1", "Item1", 10, 10));
//        items.add(new Clothing("2", "TShift", 10, 10, 50));
//        items.add(new Clothing("3", "Pants", 10, 10, 50));
//        items.add(new Electronics("4", "Mobile", 10, 10, 9));
//        items.add(new Electronics("5", "Laptop", 10, 10, 9));
//        items.add(new Book("6", "Hand Of God", 10, 10, "Anshul"));
//        items.add(new Book("7", "A Ramayana", 10, 10, "Mohit"));
//
//        Collections.sort(items);
//
//        Inventory<Item> inventory = new Inventory<>();
//        inventory.addItems(items);
//
//        inventory.getItem("1");
//        inventory.getItem("4");
//        inventory.getItem("5");
//        inventory.getItem("7");
//        inventory.getItem("3");
//        inventory.getItem("1");
//        inventory.getItem("6");
//
//        System.out.println("------------Recently viewed------------");
//
//        for (Item item : inventory.getRecentlyViewedItems()) {
//            System.out.println(item.id + ":" + item.name);
//        }
//
//        System.out.println("------------Priority Queue------------");
//
//        OrderQueue queue = new OrderQueue(new OrderTotalAmountComparator());
//
//        queue.addOrder(new Order("1", false, 50));
//        queue.addOrder(new Order("3", false, 60));
//        queue.addOrder(new Order("2", false, 10));
//        queue.addOrder(new Order("5", true, 5));
//        queue.addOrder(new Order("6", true, 70));
//        queue.addOrder(new Order("4", true, 58));
//
//        while (!queue.isEmpty())
//        {
//            Order order= queue.processQueue();
//            System.out.println(order.orderId + ":" + order.getTotalAmount());
//        }

        Foo foo = new Foo();

        try {
            foo.first(() -> System.out.println("first"));
            foo.third(() -> System.out.println("third"));
            foo.second(() -> System.out.println("second"));
        } catch (Exception ex)
        {

        }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ExecutorService executor = Executors.newFixedThreadPool(2);

        ArrayCreator arrayCreator = new ArrayCreator(10);
        Future<ArrayList<Integer>> arrayList = executor.submit(arrayCreator);

        for (int val : arrayList.get())
        {
            System.out.println(val);
        }
    }
}