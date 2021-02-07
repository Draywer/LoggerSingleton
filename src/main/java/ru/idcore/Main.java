package ru.idcore;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);
        int listSize;
        int listMaxValue;
        int limit;
        String input = null;


        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        try {
            System.out.print("Введите размер списка: ");
            input = scanner.nextLine();
            listSize = Integer.parseInt(input);
            logger.log("Размер списка: " + listSize);
            if (listSize <= 0) {
                throw new IllegalStateException("Ошибка! Размер списка <= 0");
            }
        } catch (NumberFormatException e) {
            logger.log(e.toString());
            throw new NumberFormatException("Размер списка: " + input);
        }

        try {
            System.out.print("Введите верхнюю границу для значений: ");
            input = scanner.nextLine();
            listMaxValue = Integer.parseInt(input);
            logger.log("Верхняя граница для значений: " + listMaxValue);
        } catch (NumberFormatException e) {
            logger.log(e.toString());
            throw new NumberFormatException("Верхняя граница для значений: " + input);
        }

        logger.log("Создаем и заполняем список");
        List<Integer> list = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < listSize; i++) {
            int newRandom = new Random().nextInt(listMaxValue);
            stringBuilder.append(newRandom).append(" ");
            list.add(newRandom);
        }
        logger.log("Список случайных значений: " + stringBuilder);

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        try {
            System.out.print("Введите порог для фильтра: ");
            input = scanner.nextLine();
            limit = Integer.parseInt(input);
            logger.log("Порог для фильтра: " + limit);
        } catch (NumberFormatException e) {
            logger.log(e.toString());
            throw new NumberFormatException("Порог для фильтра: " + input);
        }
        Filter filter = new Filter(limit);
        List<Integer> filteredList = filter.filterOut(list);
        StringBuilder stringBuilderFilter = new StringBuilder();
        for (int i : filteredList
        ) {
            stringBuilderFilter.append(i).append(" ");
        }

        logger.log("Выводим результат на экран");
        logger.log("Отфильтрованный список: " + stringBuilderFilter);
        logger.log("Завершаем программу");
    }
}
