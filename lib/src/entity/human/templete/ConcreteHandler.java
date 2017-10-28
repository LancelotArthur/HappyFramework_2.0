package entity.human.templete;

import entity.human.AbstractHandler;

public class ConcreteHandler extends AbstractHandler {
    //处理困难等级
    private int level;

    public ConcreteHandler(String name, boolean sex) {
        super(name, sex);
        level = 1;
    }
    public ConcreteHandler(String name, boolean sex, double age) {
        super(name, sex, age);
        level = 1;
    }
    public ConcreteHandler(String name, boolean sex, double age, int level)
    {
        super(name,sex,age);
        this.level = level;
    }
    public void handleRequest(int degree){
        //判断是否有后继的责任对象，有就转发请求，没有则处理请求.
        if(this.level>=degree)
        {
            print(this.name+"处理请求");
        }
        else
        {
            if(getSuccessor() != null)
            {
                print("交给别人");
                getSuccessor().handleRequest(degree);
            }else
            {
                print("无法处理");
            }
        }

    }
}
