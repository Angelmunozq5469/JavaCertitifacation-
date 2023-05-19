package lamdaexpressionjava;

import java.util.function.IntPredicate;

public class prericate {
    public static void main(String[] args) {
        IntPredicate lessThan18 = i->i<18;

        System.out.println(lessThan18.test(12));
        
    }
}
