package java8;
/**
 * @author zhouhaibao
 * @date 2020/12/15 15:02
 */
public class TestLam {

    public static void main(String args[]) {
        int num = 1;
        Converter s = (param) -> String.valueOf(param + num);
        String convert = s.convert(2);// 输出结果为 3
        System.out.println(convert);
    }

    public interface Converter {
        String convert(int i);
    }
}
