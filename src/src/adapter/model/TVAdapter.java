package adapter.model;

public class TVAdapter extends TV implements TriplePin{
    @Override
    public void electrify(int l, int n, int e) {
        super.electrify(l, n);
    }
}
