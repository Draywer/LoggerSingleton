#### Домашнее задание к занятию 1.1: Порождающие шаблоны. Builder, Singleton, Factory Method, Abstract Factory, Prototype
#### Задача «Логгер»

```text
"C:\Program Files\JetBrains\IntelliJ IDEA 2019.2\jbr\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2019.2\lib\idea_rt.jar=50024:C:\Program Files\JetBrains\IntelliJ IDEA 2019.2\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\User\IdeaProjects\LoggerSingleton\target\classes;C:\Users\User\.m2\repository\org\apache\httpcomponents\httpclient\4.5.12\httpclient-4.5.12.jar;C:\Users\User\.m2\repository\org\apache\httpcomponents\httpcore\4.4.13\httpcore-4.4.13.jar;C:\Users\User\.m2\repository\commons-logging\commons-logging\1.2\commons-logging-1.2.jar;C:\Users\User\.m2\repository\commons-codec\commons-codec\1.11\commons-codec-1.11.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\core\jackson-databind\2.12.1\jackson-databind-2.12.1.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\core\jackson-annotations\2.12.1\jackson-annotations-2.12.1.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\core\jackson-core\2.12.1\jackson-core-2.12.1.jar;C:\Users\User\.m2\repository\org\hamcrest\hamcrest-all\1.3\hamcrest-all-1.3.jar ru.idcore.Main
[07.02.2021 03:19:09 1] Запускаем программу
[07.02.2021 03:19:09 2] Просим пользователя ввести входные данные для списка
Введите размер списка: 15
[07.02.2021 03:19:16 3] Размер списка: 15
Введите верхнюю границу для значений: 25
[07.02.2021 03:19:23 4] Верхняя граница для значений: 25
[07.02.2021 03:19:23 5] Создаем и заполняем список
[07.02.2021 03:19:23 6] Список случайных значений: 24 24 16 23 9 13 11 12 12 18 3 21 0 10 4 
[07.02.2021 03:19:23 7] Просим пользователя ввести входные данные для фильтрации
Введите порог для фильтра: 15
[07.02.2021 03:19:35 8] Порог для фильтра: 15
[07.02.2021 03:19:35 9] Элемент 24 проходит
[07.02.2021 03:19:35 10] Элемент 24 проходит
[07.02.2021 03:19:35 11] Элемент 16 проходит
[07.02.2021 03:19:35 12] Элемент 23 проходит
[07.02.2021 03:19:35 13] Элемент 9 не проходит
[07.02.2021 03:19:35 14] Элемент 13 не проходит
[07.02.2021 03:19:35 15] Элемент 11 не проходит
[07.02.2021 03:19:35 16] Элемент 12 не проходит
[07.02.2021 03:19:35 17] Элемент 12 не проходит
[07.02.2021 03:19:35 18] Элемент 18 проходит
[07.02.2021 03:19:35 19] Элемент 3 не проходит
[07.02.2021 03:19:35 20] Элемент 21 проходит
[07.02.2021 03:19:35 21] Элемент 0 не проходит
[07.02.2021 03:19:35 22] Элемент 10 не проходит
[07.02.2021 03:19:35 23] Элемент 4 не проходит
[07.02.2021 03:19:35 24] Прошло фильтр 6 элемента из 15
[07.02.2021 03:19:35 25] Выводим результат на экран
[07.02.2021 03:19:35 26] Отфильтрованный список: 24 24 16 23 18 21 
[07.02.2021 03:19:35 27] Завершаем программу

Process finished with exit code 0
```