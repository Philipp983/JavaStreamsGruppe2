package ls_streams;

public class Items {
    String name;
    int price;
    public Items(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.name.equals(((Items) obj).name);
    }

    @Override
    public String toString() {
        return "Items [name=" + name + ", price=" + price + "]";
    }
}
