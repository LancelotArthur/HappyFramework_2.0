package application;

import scene.Scene;

public class Director {
    private static Director director = new Director();


    private Director() {
    }


    public static Director getInstance() {
        return director;
    }


    //场景切换函数，根据传入的信息和信息发送者进行判断后，对场景切换
    public void setCurrentScene(String message, Scene scene) {

    }
}