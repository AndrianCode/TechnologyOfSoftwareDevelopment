
public class Main {

    public static void main(String[] args) {
        Arguments str = new Arguments(args);
        System.out.println("Значения длин строк \n" + str.toString());
        System.out.println("Cтроки в порядке возрастания их длин: " + str.sort(args));
        Creator creator = new Creator("Чумак");
        System.out.println("Разработчик: "+ creator.getSurname());
        System.out.println("Дата получения задания: " + creator.getTask());
        System.out.println("Дата сдачи задания: " + creator.doneTask());
    }
}
