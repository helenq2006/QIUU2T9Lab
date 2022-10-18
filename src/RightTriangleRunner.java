public class RightTriangleRunner {
    public static void main(String[] args)
    {
        RightTriangle triangle1 = new RightTriangle(3.0,5.0);
        RightTriangle triangle2 = new RightTriangle(5.2,7.15);
        double hypotenuse1 = triangle1.hypotenuse();
        double hypotenuse2 = triangle2.hypotenuse();

        System.out.println(hypotenuse1);
        System.out.println(hypotenuse2);
    }
}
