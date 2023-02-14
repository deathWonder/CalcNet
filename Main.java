public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b);

        calc.println.accept(c);

//        Код не работал, потому что в методе devide была возможность деления на 0. Добавил проверку,
//             в случае если делитель равен 0, возвращает сообщение и минимальное число.
    }

}
