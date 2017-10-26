package scene.template;

import application.Director;
import scene.Scene;

public class SceneA extends Scene {
    public SceneA(String name, Director mediator){
        super(name, mediator);
    }
    @Override
    public void action() {

    }

    @Override
    public void init() {
        print("sceneA启动啦");
    }

    public void end(){
        print("sceneA停止啦");
    }
    public void change(String message){
        mediator.change(message,this);
    }
}
