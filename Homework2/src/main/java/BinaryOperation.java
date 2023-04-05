abstract class BinaryOperation implements Operation {
    @Override
    public double calculate(double a, double b) {
        return apply(a, b);
    }

    protected abstract double apply(double a, double b);
}

class Addition extends BinaryOperation {
    @Override
    protected double apply(double a, double b) {
        return a + b;
    }
}

class Subtraction extends BinaryOperation {
    @Override
    protected double apply(double a, double b) {
        return a - b;
    }
}

class Multiplication extends BinaryOperation {
    @Override
    protected double apply(double a, double b) {
        return a * b;
    }
}

class Division extends BinaryOperation {
    @Override
    protected double apply(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }
}