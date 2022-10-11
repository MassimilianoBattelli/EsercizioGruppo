class ComplexNumber {
    private final double real;
    private final double imaginary;

    public static void main(String[] args) {
        ComplexNumber n1 = new ComplexNumber(4, 8);
        System.out.println((int)n1.real + "+" + (int)n1.imaginary + "i");
        ComplexNumber n2 = new ComplexNumber(10, 12);
        if(n1.plus(n2).real == 14 && n1.plus(n2).imaginary == 20){
            System.out.println("Il metodo sum funziona");
        }
        else {
            System.out.println("Il metodo sum non funziona");
        }
    }

    public ComplexNumber(final double real, final double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getImaginary() {
        return 0;
    }

    public double getReal() {
        return 0;
    }
    
    public ComplexNumber plus(final ComplexNumber other) {
        return null;
    }
    
    public ComplexNumber sub(final ComplexNumber other) {
        return null;
    }

    public ComplexNumber times(final ComplexNumber other) {
        return null;
    }

    public ComplexNumber div(final ComplexNumber other) {
        final double commonDenominator = other.getReal() * other.getReal() + other.getImaginary() * other.getImaginary();
        final double realNumerator = this.getReal() * other.getReal() + this.getImaginary() * other.getImaginary();
        final double imaginaryNumerator = other.getReal() * this.getImaginary() - this.getReal() * other.getImaginary();
        return new ComplexNumber(realNumerator / commonDenominator, imaginaryNumerator / commonDenominator);
    }
}
