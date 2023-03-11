package HW_3;

public class Main {
    public static void main(String[] args) {
        try {
            Figure f1 = new Triangle(8, 10, 4);
            System.out.println(f1.getName());
            System.out.println(f1.perimeter());
            System.out.println(f1.area());
            }
            catch (MyException e){
                System.out.println(e.getMessage());
            }

        try {
            Figure f2 = new Rectangle(20, 11);
            System.out.println(f2.getName());
            System.out.println(f2.perimeter());
            System.out.println(f2.area());
        }
        catch (MyException e){
            System.out.println(e.getMessage());
        }
        try {
            Figure f3 = new Square(3);
            System.out.println(f3.getName());
            System.out.println(f3.perimeter());
            System.out.println(f3.area());
        }
        catch (MyException e){
            System.out.println(e.getMessage());
        }

        try {
            Figure f6 = new Rectangle(20, 110);
            System.out.println(f6.getName());
            System.out.println(f6.perimeter());
            System.out.println(f6.area());
        }
        catch (MyException e){
            System.out.println(e.getMessage());
        }

        try {
            Figure f4 = new Circle(0);
            System.out.println(f4.getName());
            System.out.println(f4.perimeter());
            System.out.println(f4.area());
        }
        catch (MyException e){
            System.out.println(e.getMessage());
            //System.gc();
        }

        try {
            Figure f5 = new Circle(1);
            System.out.println(f5.getName());
            System.out.println(f5.perimeter());
            System.out.println(f5.area());
        }
        catch (MyException e){
            System.out.println(e.getMessage());
        }


    
}

}
