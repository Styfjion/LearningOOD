package abstract_factory.factory;

import abstract_factory.product.HighClassUnit;
import abstract_factory.product.LowClassUnit;
import abstract_factory.product.MidClassUnit;

public interface AbstractFactory {
    /**
     * 初级兵种制造标准
     *
     * @return 初级兵种
     */
    LowClassUnit creatLowClass();

    /**
     * 中级兵种制造标准
     *
     * @return 中级兵种制造标准
     */
    MidClassUnit creatMidClass();

    /**
     * 高级兵种制造标准
     *
     * @return 高级兵种
     */
    HighClassUnit creatHighClass();
}
