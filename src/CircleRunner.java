public class CircleRunner {
    public static void main(String[] args)
    {
        Circle circle = new Circle(5.9);
        String info = circle.getInfo();
        System.out.println(info);

        circle.setRadius(2.4);
        info = circle.getInfo();
        System.out.println(info);
    }
}
