package application;

import scene.Scene;

public abstract class Director {
    //场景切换函数，根据传入的信息和信息发送者进行判断后，对场景切换
    public abstract void change(String message, Scene scene);
}
