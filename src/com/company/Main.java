package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Calculator calc = Calculator.instance.get(); // не понял зачем именно так создавать объект класса
        // когда можно было просто написать Calculator calc = new Calculator(); в чем смысл?
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b);//Ошибка в результате деления на ноль.
        // Исправил переменную devide в классе Calculator
        calc.println.accept(c);


    }
}
