package lesson2;
//неверные данные
public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(String message) {
        super("В массив заведены некорректные данные "+message);
    }
}