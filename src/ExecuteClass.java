public class ExecuteClass {
    public static void main(String[] args) {
        MyMath m = new MyMath(10);
        // before Sort
        System.out.println(m);

        m.sortBuble();
        // after sort
        System.out.println(m);
    }
}
