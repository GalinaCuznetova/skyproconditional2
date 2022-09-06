public class Main {
    public static void main(String[] args) {
        //Задание 3.1
        System.out.println("Задание 3.1");
        int clientOs = 1;
        switch (clientOs) {
            case 0:
                System.out.println("Установите версию для приложения IOS по ссылке...");
                break;
            case 1:
                System.out.println("Установите версию для приложения Android по ссылке...");
                break;
            default:

        }
        //Задание 3.1(2)
        System.out.println("Задание 3.1(2)");
        int clientOs1 = 1;
        if (clientOs1 == 0) {
            System.out.println("Установите версию для приложения IOS по ссылке...");
        }
        if (clientOs1 == 1) {
            System.out.println("Установите версию для приложения Android по ссылке...");
        }

        //Задание 3.2
        System.out.println("Задание 3.2");
        int clientOs3 = 0;
        int clientDeviceYear = 2014;
        switch (clientOs3) {
            case 0:
                if (clientOs3 == 0 && clientDeviceYear < 2015) {
                    System.out.println("Установите версию для приложения IOS по ссылке...");
                } else {
                    System.out.println("Установите облегченную версию для приложения IOS по ссылке...");
                }
                break;
            case 1:
                if (clientOs3 == 1 && clientDeviceYear < 2015) {
                    System.out.println("Установите версию для приложения Android по ссылке...");
                } else {
                    System.out.println("Установите облегченную версию для приложения Android по ссылке...");
                }
                break;
            default:
        }
        //Задание 3.3
        System.out.println("Задание 3.3");
        int year = 1700;
        int yearRemainder100 = year % 100;
        int yearRemainder400 = year % 400;
        int yearRemainder4 = year % 4;
            if (yearRemainder4 == 0 && yearRemainder100 != 0 || yearRemainder400 == 0) {
                System.out.println("Год  високосный");
            } else {
                System.out.println("Год не високосный");
            }
        //задание 3.4
        System.out.println("Задание 3.4");
        int deliveryDistance = 95;
        int deliveryTime = (deliveryDistance - 20) / 40;
        int deliveryTime1 = deliveryTime + 2;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка - сутки");
        }
        if (deliveryDistance > 20) {
            System.out.println("На доставку потребуется " + deliveryTime1 + " дней");
        }
        //Задание 3.5
        System.out.println("Задание 3.5");
        int monthNumber = 15;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }
    }
}






