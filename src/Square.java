public class Square {
    private String name;
    private int location;
    private Player owner;
    private int price;

    public Square(int location, String name, int price) {
        this.location = location;
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public String getName() {
        return name;
    }

    public int getLocation() {
        return location;
    }

    public void setOwner(Player player) {
            this.owner = player;
    }

    public Player getOwner() {
        return this.owner;
    }

    public int getTax() {
        return (int) (0.1 * this.price);
    }

    public boolean hasJail() {
        return this.name.toLowerCase().contains("jail");
    }
}
