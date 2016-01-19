import java.util.ArrayList;

public class Stationery{

    protected String name;
    protected float price;
    public static int totalCount = 0;

    public Stationery(){
        this.name = "no name";
        totalCount++;
        price = 0.0f;
    }


    public void display(){
        System.out.println(this.getClass());
    }

    public float getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
