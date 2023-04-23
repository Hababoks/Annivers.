import java.util.Scanner;

public class Main {
//    Пользователь вводит, сколько лет он состоит в браке.
//    Программа должна вывести, какая годовщина свадьбы будет у пользователя следующей
//    (бумажная, ситцевая, чугунная, серебряная и.д.).
//    Не обязательно указывать все годовщины, достаточно 10-15.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Сколько лет состоите в браке?: ");
        int num = scn.nextInt();
        String mes = switch (num) {
            case 1 -> Anniversary.ONEYEAR.name() + Anniversary.ONEYEAR.getDescription();
            case 2 -> Anniversary.TWOYEARS.name() + Anniversary.TWOYEARS.getDescription();
            case 3 -> Anniversary.THREEYEARS.name() + Anniversary.THREEYEARS.getDescription();
            case 4 -> Anniversary.FOURYEARS.name() + Anniversary.FOURYEARS.getDescription();
            case 5 -> Anniversary.FIVEYEARS.name() + Anniversary.FIVEYEARS.getDescription();
            case 6 -> Anniversary.SIXYEARS.name() + Anniversary.SIXYEARS.getDescription();
            case 7 -> Anniversary.SEVENYEARS.name() + Anniversary.SEVENYEARS.getDescription();
            case 8 -> Anniversary.EIGHTYEARS.name() + Anniversary.EIGHTYEARS.getDescription();
            case 9 -> Anniversary.NINEYEARS.name() + Anniversary.NINEYEARS.getDescription();
            case 10 -> Anniversary.TENYEARS.name() + Anniversary.TENYEARS.getDescription();
            case 11 -> Anniversary.ELEVENYEARS.name() + Anniversary.ELEVENYEARS.getDescription();
            case 12 -> Anniversary.TWELVEYEARS.name() + Anniversary.TWELVEYEARS.getDescription();
            default -> "Отсутствует данное значение";};

        System.out.println(mes);

        }
        }

