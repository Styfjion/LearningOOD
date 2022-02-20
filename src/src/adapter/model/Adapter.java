package adapter.model;

public class Adapter implements TriplePin{

    final private DualPin dualPinDevice;

    public Adapter(DualPin dualPinDevice) {
        this.dualPinDevice = dualPinDevice;
    }

    @Override
    public void electrify(int l, int n, int e) {
        dualPinDevice.electrify(l, n);
    }
}
