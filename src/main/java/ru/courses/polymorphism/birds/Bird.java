package ru.courses.polymorphism.birds;

import java.util.ArrayList;
import java.util.List;

class Bird {
    public void sing() {
        System.out.println("Bird is singing");
    }
}

class Sparrow extends Bird {
    @Override
    public void sing() {
        System.out.println("Sparrow is singing");
    }
}

class Cuckoo extends Bird {
    @Override
    public void sing() {
        System.out.println("Cuckoo is singing");
    }
}

class Parrot extends Bird {
    @Override
    public void sing() {
        System.out.println("Parrot is singing");
    }
}

class BirdDemo {
    public static void main(String[] args) {
        List<Bird> birds = new ArrayList<>();

        // Создание нескольких воробьев, кукушек и попугаев
        for (int i = 0; i < 3; i++) {
            birds.add(new Sparrow());
        }
        for (int i = 0; i < 2; i++) {
            birds.add(new Cuckoo());
        }
        for (int i = 0; i < 4; i++) {
            birds.add(new Parrot());
        }

        // Вызов метода пения у каждой птицы
        for (Bird bird : birds) {
            bird.sing();
        }
    }
}

// Класс Птица - корень иерархии
/*class Bird {
    // Умение петь
    public void sing() {
        System.out.println("Чырык");
    }
}

// Подвид птицы - Воробей
class Sparrow extends Bird {
    // Переопределение метода пения
    @Override
    public void sing() {
        System.out.println("Чырык");
    }
}

// Подвид птицы - Кукушка
class Cuckoo extends Bird {
    // Переопределение метода пения
    @Override
    public void sing() {
        Random random = new Random();
        int count = random.nextInt(10) + 1;
        for (int i = 0; i < count; i++) {
            System.out.println("Ку-ку");
        }
    }
}

// Подвид птицы - Попугай
class Parrot extends Bird {
    private String text;

    // Конструктор, в котором передается текст для исполнения
    public Parrot(String text) {
        this.text = text;
    }

    // Переопределение метода пения
    @Override
    public void sing() {
        Random random = new Random();
        int length = random.nextInt(text.length()) + 1;
        String substring = text.substring(0, length);
        System.out.println(substring);
    }
}*/