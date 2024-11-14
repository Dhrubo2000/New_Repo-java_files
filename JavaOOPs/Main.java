public class Main {
    public static void main(String[] args) {

        Number n = new Number(2, 3);
        n.a = 10;
        n.b = 8;
        n.display(3, 4);
        // n.display();

    }
}

class Number {

    int a, b;

    
    Number(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void display(int a, int b){
        System.out.println(this.a + "+" + this.b+"i");
        System.out.println(a + "+" + b+"i");
    }

    // public void display(){
    //     System.out.println(this.a + "+" + this.b+"i");
    //     System.out.println(a + "+" + b+"i");
    // }



}
