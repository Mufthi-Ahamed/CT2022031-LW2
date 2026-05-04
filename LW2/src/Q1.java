public class Q1 {
    public static void main(String[] args) {
        double A=2, B=3, C=4, X=5, Y=2, r=7;

        double ans1 = Math.sqrt(Math.pow(B,2)+4*A*C);
        double ans2 = Math.sqrt(X+4*Math.pow(Y,3));
        double ans3 = Math.cbrt(X*Y);
        double area = Math.PI*r*r;

        System.out.println("result:"+ans1);
        System.out.println("result:"+ans2);
        System.out.println("result:"+ans3);
        System.out.println("area:"+area);
    }
}
