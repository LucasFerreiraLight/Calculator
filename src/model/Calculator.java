package model;

public class Calculator {

    //Addition function
    Addition add = new Addition();
    public double additionNumber(double number01, double number02){

        add.setNumber01(number01);
        add.setNumber02(number02);

        return add.getNumber01() + add.getNumber02();
    }

    //Subtraction function
    Subtraction sub = new Subtraction();
    public double subtractionNumber(double number01, double number02){

        sub.setNumber01(number01);
        sub.setNumber02(number02);

        return sub.getNumber01() - sub.getNumber02();
    }

    // Multiplication function
    Multiplication multi = new Multiplication();
    public double multiplyNumber(double number01, double number02){

        multi.setNumber01(number01);
        multi.setNumber02(number02);

        return multi.getNumber01() * multi.getNumber02();

    }

    //Division function
    Division div = new Division();
    public double divisionNumber(double number01, double number02){

        div.setNumber01(number01);
        div.setNumber02(number02);

        return div.getNumber01() / div.getNumber02();
    }

}
