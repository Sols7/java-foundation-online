package ru.itsjava.oop;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Animals {
    private final String nameView;
    private boolean isHomey;
    private boolean isPredator;

//    public Animals(String nameView){
//        this.nameView = nameView;
//    }
//
//    public Animals(String nameView, boolean isHomey, boolean isPredator){
//        this.nameView = nameView;
//        this.isHomey = isHomey;
//        this.isPredator = isPredator;
//    }
//
//    public String toString(){
//        return "{nameView:" + nameView + " isHomey:" + isHomey + " isPredator:" + isPredator + "}";
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;                                 // если ссылвемся на один и тот же объект, то возвращаем true
//        if (o == null || getClass() != o.getClass()) return false;  // если объект не является экземпляром данного класса или null аозвращаем false
//
//        Animals animals = (Animals) o;                              // приводим тип данных объекта к данному классу
//
//        if (isHomey != animals.isHomey) return false;               // если животное не домашнее аозвращаем false
//        if (isPredator != animals.isPredator) return false;         // если не хищник аозвращаем false
//        return nameView.equals(animals.nameView);                   // сравниваем название видов
//    }
//
//    @Override
//    public int hashCode() {
//        return nameView.hashCode();                                 // возвращаем хешкод названия видов
//    }
}
