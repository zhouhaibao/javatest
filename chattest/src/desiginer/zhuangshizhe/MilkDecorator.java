package desiginer.zhuangshizhe;

/**
 * @author zhouhaibao
 * @date 2021/1/28 15:57
 */
public class MilkDecorator extends Decorator {

    /**
     * 通过组合的方式把Coffee对象传递进来
     *
     * @param coffee
     */
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getPrice() {
        return mCoffee.getPrice()+10;
    }

    @Override
    public String getName() {
        return "addMilk";
    }
}
