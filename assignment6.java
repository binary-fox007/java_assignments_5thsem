public class assignment6 {
    public static void main(String[] args) {
        int outerScopeVariable = 10;

        System.out.println("Outer Scope Variable: " + outerScopeVariable);

        {
            int innerScopeVariable = 20;

            System.out.println("Inner Scope Variable: " + innerScopeVariable);

            // The inner scope can access the outer scope variable
            int sum = outerScopeVariable + innerScopeVariable;
            System.out.println("Sum in Inner Scope: " + sum);
        }
    }
}
