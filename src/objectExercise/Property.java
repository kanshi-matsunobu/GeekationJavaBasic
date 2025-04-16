package objectExercise;

public class Property {
    private String name;
    private String ownername;
    private String type;
    private int price;

    public Property(String name, String ownername, String type, int price) {
        this.name = name;
        this.ownername = ownername;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownername;
    }
    public void setOwnerName(String ownername) {
        this.ownername = ownername;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public void printInfo() {
        System.out.println("物件名：" + name);
        System.out.println("物件所有者名：" + ownername);
        System.out.println("物件種別：" + type);
        System.out.println("物件価格：" + price + "円");
    }
}
