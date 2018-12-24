package Main;

import java.util.Scanner;

public class Circle extends Shape {

    private int radius; Point center = new Point();

    public void Draw (){
        System.out.println("Рисую Круг");
        System.out.println("Введите координаты центра и радиус круга");
        Scanner scan = new Scanner(System.in);
        center.setX(scan.nextInt());
        center.setY(scan.nextInt());
        radius=scan.nextInt();
        System.out.println(center.getX()+" "+center.getY()+" "+radius);
    }
}

