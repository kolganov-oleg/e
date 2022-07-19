public class Main {
    public static void main(String[] args) {


// Задание 1

//        int clientOs = 3;
 //       if (clientOs == 0) {

 //           System.out.println("Скачайте версию для iOS по ссылке");
 //       }
 //       else if (clientOs == 1) {
 //           System.out.println("Скачайте версию для Android по ссылке");

 //       }
  //      else {
 //           System.out.println("Неправильная OS");
 //       }

// Задание 2

        int clientDeviceYear = 2014;
        int clientOs = 1;
        if (clientOs == 0 && clientDeviceYear >= 2015){
            System.out.println("Скачайте версию для iOS по ссылке");
        } else if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Скачайте версию для Android по ссылке");
        } else if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Ваша система не поддерживается");
        }


 // Задание 3

        int year = 2024;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
            System.out.println("Это високосный год");
        } else {System.out.println("Это не високосный год");}


// Задание 4

        int deliveryDistance = 105;
        if (deliveryDistance <= 20){
            System.out.println("Доставка займет 1 день");
        } else if (deliveryDistance <= 60) {
            System.out.println("Доставка займет 2 дня");
        } else if (deliveryDistance < 100) {
            System.out.println("Доставка займет 3 дня");
        }else {
            System.out.println("Доставки нет");
        }

 // Задание 5

        int monthNumber = 13;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Сейчас зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сейчас весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сейчас лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сейчас осень");
                break;
            default:
                System.out.println("Неправильно указан месяц");
        }

    }

}