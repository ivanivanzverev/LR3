package Main;

        import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();

        Scanner scan = new Scanner(System.in);

        for(;;) {
            System.out.println("Введите название желаемой фигуры на русском языке с большой буквы"+"\nВведите пробел для выхода");
            String name = scan.nextLine();
            //System.out.println(name);
            switch (name){
                case "Треугольник": triangle.Draw(); break;
                case "Круг": circle.Draw(); break;
                case "Прямоугольник": rectangle.Draw(); break;
                case " ": System.exit(0);
                default: System.out.println("Некорректный ввод, повторите попытку");
            }
        }
    }
}
