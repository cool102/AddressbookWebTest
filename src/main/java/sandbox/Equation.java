package sandbox;

public class Equation {
    private double a;
    private double b;
    private double c;
    private int countOfDesisions;

    public Equation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        double d = b * b - 4 * a * c;

        if (!(0 == a)) {
            if (d > 0) {
                countOfDesisions = 2;
            } else if (d == 0) {
                countOfDesisions = 1;
            } else {
                countOfDesisions = 0;
            }
        } else {
          if (b == 0) if (c == 0) {
              countOfDesisions = -1;
          } else {
              countOfDesisions = 0;
          }
          else countOfDesisions = 1;

       }

    }

    public int returnConuntOfDesisions() {
        return countOfDesisions;
    }
}

