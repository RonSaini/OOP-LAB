class Complex {
    int x;
    int y;

    void set(int a, int b) {
        x = a;
        y = b;
    }

    void disp() {
        System.out.println("the number is " + x + " + i" + y);
    }

    Complex add(Complex c1, Complex c2) {
        Complex sum = new Complex();

        sum.x = c1.x + c2.x;
        sum.y = c1.y + c2.y;

        return sum;
    }

    Complex sub(Complex c1, Complex c2) {
        Complex diff = new Complex();

        diff.y = Math.abs((c1.y) - (c2.y));
        
          diff.x = Math.abs((c1.x) - (c2.x));
      

        return diff;
    }
}

class W3Q1 {
    public static void main(String[] args) {

        Complex c1 = new Complex();
        Complex c2 = new Complex();
        Complex s = new Complex();
        Complex d = new Complex();

        c1.set(6, 8);
        c2.set(10, 11);

        c1.disp();
        c2.disp();

        s = s.add(c1, c2);
        System.out.println("number after addition :  "+s.x+" + "+"i"+s.y);


        d = d.sub(c1, c2);
        System.out.print("Absolute number after subtraction : "+d.x+" + "+"i"+d.y);
    

    }
}