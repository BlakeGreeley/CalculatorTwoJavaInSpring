public class Program {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.setNum1(31.25);
        c.setNum2(2);
        c.setOperator('*');
        c.performOperation();
        c.getResults();
    }
}