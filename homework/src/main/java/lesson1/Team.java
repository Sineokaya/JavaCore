package lesson1;
//создаю интерфейс, так как по заданию наследование от одного общего класса запрещено
public interface Team {
    void run(); //сколько бежит член команды
    void jump(); //сколько прыгает член команды
    int getRunTreadmill(); //сколько надо пробежать
    int getJumpWall();//сколько надо прыгать
}
