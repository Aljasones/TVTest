package ru.itpark;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        System.out.println(tv.getCurrentVolume());
        tv.setCurrentChannel(50);
        System.out.println(tv.getCurrentChannel());
        tv.setCurrentChannel(60);
        System.out.println(tv.getCurrentChannel());
        tv.setCurrentChannel(2000);
        System.out.println(tv.getCurrentChannel());

        int value = 10;
        int newValue = value++;

}}
