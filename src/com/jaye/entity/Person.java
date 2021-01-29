package com.jaye.entity;

/**
 * @author shkstart
 * @create 2021-01-29-22:58
 */
public class Person {

    public String name;
    private float height;
    private int age;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
        System.out.print(name);
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        if(height < 0){
            System.out.println("身高不能小于0");
        }else{
            this.height = height;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0){
            System.out.println("年龄不能小于0");
        }else{
            this.age = age;
        }
    }

    public void eat(){
        System.out.println("会吃饭");
    }

    public void run(){
        System.out.println("会跑步");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", age=" + age +
                '}';
    }
}
