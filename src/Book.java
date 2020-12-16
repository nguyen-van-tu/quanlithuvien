public class Book {
    private String name , outhor ;
    private int price , number ;
    private int weight ;
    private int totalPrice = price*number;

    public Book() {
    }

    public Book(String name, String outhor, int price, int number, int weight) {
        this.name = name;
        this.outhor = outhor;
        this.price = price;
        this.number = number;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOuthor() {
        return outhor;
    }

    public void setOuthor(String outhor) {
        this.outhor = outhor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    @Override
    public String toString() {
        return
                "Tên cuốn sách: " + name + '\'' +
                ", Tác giả: " + outhor + '\'' +
                ", Giá: " + price +
                ", Số cuốn: " + number +
                ", Khối lượng: " + weight +
                '}';
    }

}
