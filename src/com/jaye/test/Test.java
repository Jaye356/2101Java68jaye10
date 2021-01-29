package com.jaye.test;

import com.jaye.entity.Apple;
import com.jaye.entity.Person;

/**
 * @author shkstart
 * @create 2021-01-29-22:23
 */
public class Test {

    public static void main(String[] args) {

        Person person = new Person("小明");

        person.setHeight(-250f);
        person.setAge(25);

        System.out.println(person.toString());
        person.eat();
        person.run();

        System.out.println("--------------------");

        Apple apple = new Apple("OnePlus");

        apple.setSize(5.6f);
        apple.setIson("嘻嘻");

        System.out.println(apple.toString());
        apple.call();
        apple.onNet();

    }

}
