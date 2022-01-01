public class Main {
    public static void main(String[] args) {
        Specifications samsung = new Specifications();
        Specifications apple = new Specifications();
       
        samsung.setBrandName("HONOR");
        samsung.setBrandName("SAMSUNG");
        apple.setBrandName("Apple");
        System.out.println("brand name of the mobile is "+samsung.getBrandName());
    }
}
