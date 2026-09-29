public class complexNumber {

    static class Complex {
        double real;
        double imag;

        // Constructor
        Complex(double real, double imag) {
            this.real = real;
            this.imag = imag;
        }

        // Addition
        Complex add(Complex c) {
            return new Complex(real + c.real, imag + c.imag);
        }

        // Subtraction
        Complex subtract(Complex c) {
            return new Complex(real - c.real, imag - c.imag);
        }

        // Multiplication
        Complex multiply(Complex c) {
            double r = real * c.real - imag * c.imag;
            double i = real * c.imag + imag * c.real;
            return new Complex(r, i);
        }

        // Display
        void display() {
            System.out.println(real + " + " + imag + "i");
        }
    }

    public static void main(String[] args) {

        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(2, 5);

        Complex sum = c1.add(c2);
        Complex difference = c1.subtract(c2);
        Complex product = c1.multiply(c2);

        System.out.print("Addition: ");
        sum.display();

        System.out.print("Subtraction: ");
        difference.display();

        System.out.print("Multiplication: ");
        product.display();
    }
}