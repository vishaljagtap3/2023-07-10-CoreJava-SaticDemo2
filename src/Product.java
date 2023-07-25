import java.sql.Connection;
import java.util.Random;

public class Product {

    private int srNo;
    private String title;
    private int price;
    private static String vendor;
    private static int nextSrNo;

    static {
        System.out.println("static block executed...");

        /*Random random = new Random();
        int randomInt = random.nextInt();
        nextSrNo = Math.abs(randomInt);*/
        nextSrNo = Math.abs(new Random().nextInt());
        vendor = "BitCode";
    }

    public Product(String title, int price) {
        this.srNo = nextSrNo;
        nextSrNo++;
        this.title = title;
        this.price = price;
    }

    public int getSrNo() {
        return srNo;
    }

    public void setSrNo(int srNo) {
        this.srNo = srNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static String getVendor() {
        return vendor;
    }

    public static void setVendor(String vendor) {
        Product.vendor = vendor;
    }

    public void display() {
        System.out.println(srNo + " " + title + " " + price);
    }
}
