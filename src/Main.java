public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Задача 1");
        System.out.println("dog = "+ dog);
        System.out.println("cat = "+ cat);
        System.out.println("paper = " + paper);
    }

    public static void task2 () {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Задача 2");
        System.out.println("dog = "+ (dog + 4));
        System.out.println("cat = "+ (cat + 4));
        System.out.println("paper = " + (paper + 4));
    }

    public static void task3 () {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Задача 3");
        System.out.println("dog = "+ (dog - 3.5));
        System.out.println("cat = "+ (cat - 1.6));
        System.out.println("paper = " + (paper - 7639));
    }

    public static void task4 () {
        var friend = 19;
        System.out.println("Задача 4");
        System.out.println("friend = "+ (friend));
        System.out.println("friend = "+ (friend + 2));
        System.out.println(("friend = "+ (friend + 2) / 7));
    }

    public static void task5 () {
        var frog = 3.5;
        System.out.println("Задача 5");
        System.out.println("frog = " + (frog * 10));
        System.out.println(("frog = " + (frog * 10) / 3.5));
        System.out.println("frog = " + (((frog * 10) / 3.5) + 4));
    }

    public static void task6 () {
        var weightOneBoxer = 78.2;
        var weightTwoBoxer = 82.7;
        var summWeightBoxer = weightOneBoxer + weightTwoBoxer;
        var differenceWeightBoxer = weightTwoBoxer - weightOneBoxer;
        System.out.println("Задача 6");
        System.out.println("Общая масса двух бойцов: "+ summWeightBoxer);
        System.out.println("Разница между массами бойцов: "+ differenceWeightBoxer);
    }

    public static void task7 () {
        System.out.println("Задача 7");
        // Пишем код для задачи 1
    }

    public static void task8 () {
        System.out.println("Задача 8");
        // Пишем код для задачи 2
    }
}