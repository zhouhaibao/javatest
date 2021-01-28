package desiginer.zhuangshizhe;

/**
 * @author zhouhaibao
 * @date 2021/1/28 15:56
 */
public abstract class Decorator extends Coffee{

    protected Coffee mCoffee;

    /**
     * 通过组合的方式把Coffee对象传递进来
     * @param coffee
     */
    public Decorator(Coffee coffee){
        mCoffee=coffee;
    }

}
