package scene.template;

import application.Director;
import scene.Scene;

public class SceneB extends Scene {
    public SceneB(String name, Director mediator){
        super(name, mediator);
    }
    @Override
    public void action() {

    }

    @Override
    public void init() {
        print("SceneB启动啦");
    }

    public void end(){
        print("SceneB停止啦");
    }
    public void change(String message){
        mediator.change(message,this);
    }
}
