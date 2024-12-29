import java.util.Comparator;
import java.util.PriorityQueue;

public class OrderQueue {
    PriorityQueue<Order> orderPriorityQueue = new PriorityQueue<>();

    public void addOrder(Order order)
    {
        orderPriorityQueue.add(order);
    }

    public Order processQueue()
    {
        return orderPriorityQueue.poll();
    }

    public boolean isEmpty()
    {
        return orderPriorityQueue.isEmpty();
    }
}
