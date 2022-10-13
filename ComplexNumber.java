class ComplexNumber {
    private final double real;
    private final double imaginary;

    public static void main(String[] args) {
        
        ComplexNumber n1 = new ComplexNumber(4, 8);
        System.out.println((int)n1.real + "+" + (int)n1.imaginary + "i");
        ComplexNumber n2 = new ComplexNumber(10, 12);

        if(n1.plus(n2).getReal() == 14 && n1.plus(n2).getImaginary() == 20){
            System.out.println("Il metodo sum funziona");
        }
        else {
            System.out.println("Il metodo sum non funziona");
        }
        if(n1.sub(n2).getReal() == -6 && n1.sub(n2).getImaginary() == -4){
            System.out.println("Il metodo sub funziona");
        }
        else {
            System.out.println("Il metodo sub non funziona");
        }
        if(n1.times(n2).getReal() == -56 && n1.times(n2).getImaginary() == 128){
            System.out.println("Il metodo times funziona");
        }else{
            System.out.println("Il metodo times non funziona");
        }
    }

    public ComplexNumber(final double real, final double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public String toString() {
        return Double.toString(this.real) + '+' + Double.toString(this.imaginary) + 'i';
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
