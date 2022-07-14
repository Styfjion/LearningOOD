package visitor.visitor;

import visitor.model.impl.Candy;
import visitor.model.impl.Fruit;
import visitor.model.impl.Wine;

public interface Visitor {
    void visit(Candy candy);

    void visit(Wine wine);

    void visit(Fruit fruit);
}
