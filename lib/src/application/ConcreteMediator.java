package application;

import scene.Scene;
import scene.template.SceneA;
import scene.template.SceneB;
import scene.template.SceneC;

public class ConcreteMediator extends Director {
    SceneA sceneA;
    SceneB sceneB;
    SceneC sceneC;
    public void setSceneA(SceneA sceneA){
        this.sceneA = sceneA;
    }
    public void setSceneB(SceneB sceneB){
        this.sceneB = sceneB;
    }
    public void setSceneC(SceneC sceneC){
        this.sceneC = sceneC;
    }

    public  void change(String content, Scene scene){
        if(scene==sceneA){
            if("B"==content||"b"==content){
                sceneB.init();
                sceneA.end();
            }
            if("C"==content||"c"==content){
                sceneC.init();
                sceneA.end();
            }
        }
        if(scene==sceneB){
            if("A"==content||"a"==content){
                sceneA.init();
                sceneB.end();
            }
            if("C"==content||"c"==content){
                sceneC.init();
                sceneB.end();
            }
        }
        if(scene==sceneC){
            if("A"==content||"a"==content){
                sceneA.init();
                sceneC.end();
            }
            if("B"==content||"b"==content){
                sceneB.init();
                sceneC.end();
            }
        }
    }
}
