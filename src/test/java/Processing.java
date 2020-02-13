public class Processing {
    int a;
    int b;
    int c;

    public Processing(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean checkTriangle() {
            return ((a + b > c) && (a + c > b) && (b + c > a));

    }

    public boolean checkEquilateral() {
            return (checkTriangle() && a == b && b == c);
    }

    public boolean checkIsosceles() {
            return (checkTriangle() && (a == b || b == c || a == c)) ;

    }

    public boolean checkRightangled() {
        return (checkTriangle() && (Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2) || (Math.pow(b, 2) + Math.pow(c, 2)) == Math.pow(a, 2)
                || (Math.pow(c, 2) + Math.pow(a, 2)) == Math.pow(b, 2));

    }

    public boolean checkAcute() {

        return checkTriangle() && (Math.pow(a, 2) + Math.pow(b, 2) > Math.pow(c, 2)) || (Math.pow(a, 2) + Math.pow(c, 2)) > Math.pow(b, 2) ||
                (Math.pow(c, 2) + Math.pow(b, 2)) > Math.pow(a, 2);

    }

    public String triangle() {
        if (a == b && b == c) {
            return ("This is Equilateral triangle");
        } else if (a == b || b == c || a == c) {
            return ("This is Isosceles triangle");
        }
        if ((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2) || (Math.pow(b, 2) + Math.pow(c, 2)) == Math.pow(a, 2)
                || (Math.pow(c, 2) + Math.pow(a, 2)) == Math.pow(b, 2)) {
            return ("This is Right-angled triangle");
        } else if ((Math.pow(a, 2) + Math.pow(b, 2) > Math.pow(c, 2)) || (Math.pow(a, 2) + Math.pow(c, 2)) > Math.pow(b, 2) ||
                (Math.pow(c, 2) + Math.pow(b, 2)) > Math.pow(a, 2)) {
            return ("This is Acute triangle");
        } else {
            return ("This is Obtuse triangle");
        }
    }
}
