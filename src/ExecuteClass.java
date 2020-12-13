public class ExecuteClass {
    public static void main(String[] args) {
        MyMath m = new MyMath(100,50);
        // before Sort
        System.out.println(m);

        m.sortBuble();
        // after sort
        System.out.println(m);

        System.out.println("Num 25 is " + m.binarySearch(25));
    }
}
