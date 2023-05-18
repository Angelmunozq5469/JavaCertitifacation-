package lamdaexpressionjava;

interface matematicas{
    int operaciones (int a, int b);
}

public class lamda {

    public static void main(String[] args) {
        matematicas adiccion = (a,b) -> a + b;
        System.out.println("resultado" + adiccion.operaciones(5, 4));
    }
}
