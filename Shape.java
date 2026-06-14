//run time polymorphism
class Shape1{
    public static void area(){
        System.out.println("display area:");
        return ;
    }
}
    class Triangle extends Shape1 {
        public static void area(int L,int H){
            System.out.println(0.5*L*H);
        }    
        
    }
    class Circle extends Shape1 {
        public static void area(int r){
            System.out.println(3.14*r*r);

        }
    }
    class Shape {
        public static void main(String[] args) {
        Shape1 s1=new Shape1();
        s1.area();
        Triangle t1=new Triangle();
        t1.area(3,2);
        Circle c1=new Circle();
        c1.area(3);
    }
     }
