public class Inheritance {

    public static void main(String[] args) {
        Copy copy = new Copy(5,3,2);
        System.out.println(copy.l+ " "+ copy.h+" "+copy.w);
        Square square = new Square(5,3,2,1);
    }
}
class Square extends Copy{
    double weight;
    Square(double l , double h , double w , double weight) {
        super(l,h,w);
        System.out.println(l*w*h*weight);
    } 
}

class Copy {
    double l = 5;
    double h = 5;
    double w = 5;

    Copy(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    Copy(double side){
        this.l = side;
        this.h = 0;
        this.w = side;

    }
    Copy(double l , double h , double w){
        this.l = l; 
        this.h = h;
        this.w = w;
    }
}