package lamdaexpressionjava;

import java.util.function.IntPredicate;

import output.app;

public class prericate {
    public static void main(String[] args) {
        IntPredicate lessThan18 = i->i<18;
        IntPredicate MoreThan10 = i->i>10;

        new prericate().demo(11,lessThan18,MoreThan10);
    }

    public void demo(int x, IntPredicate lessThan18, IntPredicate MoreThan10){
        if(lessThan18.and(MoreThan10).test(x)){
            System.out.println("The input is less than 18 and more than 10");
        }else{
            System.out.println("El input es Invalido");
        }
    }
}
