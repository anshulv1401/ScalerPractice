public class Order implements Comparable<Order> {
    String orderId;
    Boolean isExpress;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Boolean getExpress() {
        return isExpress;
    }

    public void setExpress(Boolean express) {
        isExpress = express;
    }

    public Order(String orderId, Boolean isExpress) {
        this.orderId = orderId;
        this.isExpress = isExpress;
    }

    @Override
    public int compareTo(Order o) {
        if (this.isExpress == o.isExpress)
            return this.orderId.compareTo(o.orderId);
        else if (this.isExpress)
            return -1;
        else
            return 1;
    }
}
