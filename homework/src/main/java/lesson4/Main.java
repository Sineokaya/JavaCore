package lesson4;
//Задание 4 Синеокая Марина
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    //Задание 1
    public static void main(String[] args) {
        //создаем массив слов
        String[] words = {
                "Один", "Два", "Три",
                "Четыре", "Четыре", "Пять",
                "Четыре", "Шесть", "Семь",
                "Семь", "Восемь", "Восемь",
                "Девять", "Десять"
        };
        System.out.println("Задание 1:");
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(words));
        HashMap<String, Integer> hm = new HashMap<>();
        System.out.println("Результат: ");
        //перебираем массив слов
        Integer count;
        String word;
        for (int i = 0; i < words.length ; i++){
            word=words[i];
            //нет совпадений
            count = hm.get(word);
            if (count == null) {
                hm.put(word, 1);
            } else{
                //добавляем кол-во совпадений слов
                hm.put(word, count + 1);
            }
        }
        System.out.println(hm);

        //Задание 2
        System.out.println();
        System.out.println("Задание 2:");
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("ФИО1", "+7 921 791 51 52");
        phoneBook.add("ФИО2", "+7 921 336 33 32");
        phoneBook.add("ФИО2", "+7 921 345 33 34");
        phoneBook.add("ФИО3", "+7 921 456 45 45");
        phoneBook.print();
        System.out.println("Результат:");
        //печатаем номера по ФИО
        System.out.println(" ФИО1: " + phoneBook.get("ФИО1"));
        System.out.println(" ФИО2: " + phoneBook.get("ФИО2"));
        System.out.println(" ФИО3: " + phoneBook.get("ФИО3"));
    }

}