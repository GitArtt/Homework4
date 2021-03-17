package ru.geekbrains.homework4;

public class Homework4 {

    public static void main(String[] args) {
        Employee employee = new Employee("Мельников Сергей Андреевич", "Специалист технической поддержки",
                "melnik233@gmail.com", "+79254831515", 70000, 26);
        employee.info();

        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Иванов Николай", "Менеджер", "kolyan20@inbox.ru", "+79912234565", 40000, 20);
        empArray[1] = new Employee("Сергеев Павел", "Системный администратор", "spavel78@mail.ru", "+79260011112", 120000, 43);
        empArray[2] = new Employee("Солодов Григорий", "Безработный", "grishanya16@yandex.ru", "+79231854623", 0, 16);
        empArray[3] = new Employee("Раченкова Юлия", "Администратор магазина", "beautyjulia1@mail.ru", "+79251438353", 65000, 27);
        empArray[4] = new Employee("Власова Дарья", "Директор по качеству", "darya_vlasova@mail.ru", "+79852541314", 100000, 42);

        for (int i = 0; i < empArray.length; i++) {
            if (empArray[i].age > 40) {
                empArray[i].info();
            }
        }
    }

}
