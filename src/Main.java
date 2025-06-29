
public class Main {
    public static void main(String[] args) {
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        // дз 1

        int clientDeviceYear = 2015;
        if ((clientDeviceYear < 2015) && (clientOS == 0)) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // 2 дз

        int year = 1600;
        int startYear = 1584;
        if (((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) && (year >= startYear)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        // 3 задача

        int deliveryDistance = 95;
        int day = 0;
        if (deliveryDistance < 20) {
            day = 1;
            System.out.println("Потребуется дней " + day);
        } else if ((deliveryDistance >= 20) && (deliveryDistance < 60)) {
            day = 2;
            System.out.println("Потребуется дней " + day);
        } else if ((deliveryDistance >= 60) && (deliveryDistance < 100)) {
            day = 3;
            System.out.println("Потребуется дней " + day);
        } else {
            System.out.println("Доставки нет");
        }
        // 4 задача

        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь принадлежит к сезону Зима");
                break;
            case 2:
                System.out.println("Февраль принадлежит к сезону Зима");
                break;
            case 3:
                System.out.println("Март принадлежит к сезону Весна");
                break;
            case 4:
                System.out.println("Апрель принадлежит к сезону Весна");
                break;
            case 5:
                System.out.println("Май принадлежит к сезону Весна");
                break;
            case 6:
                System.out.println("Июнь принадлежит к сезону Лето");
                break;
            case 7:
                System.out.println("Июль принадлежит к сезону Лето");
                break;
            case 8:
                System.out.println("Август принадлежит к сезону Лето");
                break;
            case 9:
                System.out.println("Сентябрь принадлежит к сезону Осень");
                break;
            case 10:
                System.out.println("Октябрь принадлежит к сезону Осень");
                break;
            case 11:
                System.out.println("Ноябрь принадлежит к сезону Осень");
                break;
            case 12:
                System.out.println("Декабрь принадлежит к сезону Зима");
                break;
            default:
                break;
        }
    }
}
