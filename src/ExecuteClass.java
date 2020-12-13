public class ExecuteClass {
    public static void main(String[] args) {
        MyMath m = new MyMath(100,100);
        // before Sort
        System.out.println(m);

        m.sortBuble();
        // after sort
        System.out.println(m);

        System.out.println("Num 75 is " + m.binarySearch(75));
    }
}
