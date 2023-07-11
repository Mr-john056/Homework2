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
        System.out.println();
    }

    public static void task2 () {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Задача 2");
        System.out.println("dog = "+ (dog + 4));
        System.out.println("cat = "+ (cat + 4));
        System.out.println("paper = " + (paper + 4));
        System.out.println();
    }

    public static void task3 () {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Задача 3");
        System.out.println("dog = "+ (dog - 3.5));
        System.out.println("cat = "+ (cat - 1.6));
        System.out.println("paper = " + (paper - 7639));
        System.out.println();
    }

    public static void task4 () {
        var friend = 19;
        System.out.println("Задача 4");
        System.out.println("friend = "+ (friend));
        System.out.println("friend = "+ (friend + 2));
        System.out.println(("friend = "+ (friend + 2) / 7));
        System.out.println();
    }

    public static void task5 () {
        var frog = 3.5;
        System.out.println("Задача 5");
        System.out.println("frog = " + (frog * 10));
        System.out.println(("frog = " + (frog * 10) / 3.5));
        System.out.println("frog = " + (((frog * 10) / 3.5) + 4));
        System.out.println();
    }

    public static void task6 () {
        var weightOneBoxer = 78.2;
        var weightTwoBoxer = 82.7;
        var summWeightBoxer = weightOneBoxer + weightTwoBoxer;
        var differenceWeightBoxer = weightTwoBoxer - weightOneBoxer;
        System.out.println("Задача 6");
        System.out.println("Общая масса двух бойцов: "+ summWeightBoxer);
        System.out.println("Разница между массами бойцов: "+ differenceWeightBoxer);
        System.out.println();
    }

    public static void task7 () {
        var weightOneBoxer = 78.2;
        var weightTwoBoxer = 82.7;
        var differenceWeightBoxer = weightTwoBoxer - weightOneBoxer;
        var divisionWeightBoxer = weightTwoBoxer % weightOneBoxer;
        System.out.println("Задача 7");
        System.out.println("Разница массы спортсменов(способ 1):" + differenceWeightBoxer);
        System.out.println("Разница массы спортсменов(способ 2)" + divisionWeightBoxer);
        System.out.println();
    }

    public static void task8 () {
        var totalTime = 640;
        var timePerEmployee = 8;
        var totalNumberEmployees = totalTime / timePerEmployee;
        var summEmployees = totalNumberEmployees + 94;
        var summTotalTime = summEmployees * timePerEmployee;
        System.out.println("Задача 8");
        System.out.println("Всего работников в компании - " + totalNumberEmployees + " человек");
        System.out.println("Если в компании работает " + summEmployees + " человек, то всего " + summTotalTime + " часов работы может быть поделено между сотрудниками");
    }
}