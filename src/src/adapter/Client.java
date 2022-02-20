package adapter;

import adapter.model.*;

public class Client {
    public static void main(String[] args) {
        DualPin dualPinDevice = new TV(); //两插电视机
        TriplePin triplePinDevice = new Adapter(dualPinDevice); //适配器接驳两端
        triplePinDevice.electrify(1, 0, -1);

        TriplePin tvAdapter = new TVAdapter(); //电视机专属三插适配器
        tvAdapter.electrify(1, 0, -1);
    }
}
