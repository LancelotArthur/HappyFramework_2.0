package scene.template;

import application.Director;
import scene.Scene;

public class SceneC extends Scene {
    public SceneC(String name, Director mediator){
        super(name, mediator);
    }
    @Override
    public void action() {

    }

    @Override
    public void init() {
        print("SceneC启动啦");
    }

    public void end(){
        print("SceneC停止啦");
    }
    public void change(String message){
        mediator.change(message,this);
    }
}
