package apps.ucu.task3;

public class Main {
    public static void main(String[] args) {
        MyImage image1 = new ProxyImage("image1.png");
        MyImage image2 = new ProxyImage("image2.png");

        image1.display();
        image2.display();
    }
}
