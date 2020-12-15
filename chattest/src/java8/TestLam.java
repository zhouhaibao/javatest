package java8;

import cn.hutool.core.io.LineHandler;
import com.google.common.cache.Weigher;

import java.time.Year;
import java.util.function.DoubleToIntFunction;
import java.util.function.IntBinaryOperator;

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
