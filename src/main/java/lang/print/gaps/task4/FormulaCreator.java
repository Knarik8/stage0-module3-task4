package lang.print.gaps.task4;

import java.text.MessageFormat;

public class FormulaCreator {
    public static void main(String[] args) {
        byte nine = 9;
        char a = 'a';
        byte five = 5;
        char b = 'b';
        byte two = 2;
        byte seven = 7;
        byte four = 4;
        char degree = 178;
        String formula = "({0}{1}{2}-{3}{4}+{5}+{1}-{6})*(({1}+{4}-{7}{1}{4})/{5})";
        String formula1 = MessageFormat.format(formula, nine, a, degree, five, b, two, seven, four);
        System.out.print(formula1);
    }
}
