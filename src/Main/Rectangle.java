package Main;

import java.util.Scanner;

public class Rectangle extends Shape {

    private Point x1 = new Point();
    private Point x2 = new Point();

    public Rectangle(){
        Point x1 = new Point();
        Point x2 = new Point();
    }

    public void Draw (){
        System.out.println("Рисую прямоугольник");
        System.out.println("Введите координаты левой верхней точки, ширину и высоту");
        Scanner scan = new Scanner(System.in);
        x1.setX(scan.nextInt());
        x1.setY(scan.nextInt());
        int width = scan.nextInt();
        int height = scan.nextInt();
        x2.setX(x1.getX()+width-1);
        x2.setY(x1.getY()+height-1);
        System.out.println(x1.getX()+" "+x1.getY()+" "+x2.getX()+" "+x2.getY());
    }
}
