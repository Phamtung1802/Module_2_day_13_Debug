import java.util.Scanner;

public class Triangle {
    private int a,b,c;

    public Triangle() {
        System.out.println("Nhap 3 canh Tam Giac");
        Scanner scanner=new Scanner(System.in);
        this.a= scanner.nextInt();
        System.out.println(a);
        this.b=scanner.nextInt();
        System.out.println(b);
        this.c=scanner.nextInt();
        System.out.println(c);
        isValidTriangle();
        System.out.println("tam giac");
    }


    private void isValidTriangle() throws IllegalTriangleException{
        if (!isTriangle(this.a, this.b, this.c)) {
            throw new IllegalTriangleException("khong phai tam giac");
        }
    }

    private boolean isTriangle(int side1,int side2,int side3){
        if((side1+side2<side3)||(side2+side3<side1)||(side1+side3<side2)){
            return false;
        }
        return true;
    }

}
