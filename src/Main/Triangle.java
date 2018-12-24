package Main;

import java.util.Scanner;

public class Triangle extends Shape {

    private Point x1 = new Point(),x2 = new Point(),x3=new Point();

    public void Draw (){
        System.out.println("Рисую треугольник");
        System.out.println("Введите координаты трех точек");
        Scanner scan = new Scanner(System.in);
        x1.setX(scan.nextInt());
        x1.setY(scan.nextInt());
        x2.setX(scan.nextInt());
        x2.setY(scan.nextInt());
        x3.setX(scan.nextInt());
        x3.setY(scan.nextInt());
        System.out.println(x1.getX()+" "+x1.getY()+" "+x2.getX()+" "+x2.getY()+" "+x3.getX()+" "+x3.getY());
    }
}
