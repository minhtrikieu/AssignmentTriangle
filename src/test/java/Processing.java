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
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkEquilateral(){
        if(checkTriangle() == true){
            if(a == b && b == c){
                return true;
            }
        }
        return false;
        }
    public boolean checkIsosceles(){
        if(checkTriangle() == true){
            if(a == b || b == c || a == c){
                return true;
            }
        }
        return false;
    }
    public boolean checkRightangled(){
        if(checkTriangle() == true){
            if((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2) || (Math.pow(b, 2) + Math.pow(c, 2)) == Math.pow(a, 2)
                    || (Math.pow(c, 2) + Math.pow(a, 2)) == Math.pow(b, 2)){
                return true;
            }
        }
        return false;
    }
    public boolean checkAcute(){
        if(checkTriangle() == true){
            if ((Math.pow(a, 2) + Math.pow(b, 2) > Math.pow(c, 2)) || (Math.pow(a, 2) + Math.pow(c, 2)) > Math.pow(b, 2) ||
                    (Math.pow(c, 2) + Math.pow(b, 2)) > Math.pow(a, 2)){
                return true;
            }
        }
        return false;
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
