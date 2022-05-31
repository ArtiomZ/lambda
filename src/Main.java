public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);
        calc.println.accept(c);
    }
}
// Ошибка возникает из-за того, что в результате функции  calc.minus.apply(1, 1);  в переменную b присваивается 0.
// Затем, функция  calc.devide.apply(a, b);  призваная поделить a на b, делит на b, то есть на ноль. Выбрасывается
// исключение деления на ноль: ArithmeticException.
// Можно поймать это исключение с помощью try/catch в функции devide.
// Также в фукнции devide можно просто сделать проверку переменной b. if (b == 0) {error} else { a / b }
// Как переменная abs и ее тернарный оператор поможет в решении задачи деления на ноль я не понял. Можно из devide вызывать
// abs  this.abs.apply(y);   и проверять не находится ли в (y) ноль, а затем выполнять деление. Но это глупо, если мы просто
// можем сделать проверку if (b != 0)