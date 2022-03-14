package responsibility.factory;

import responsibility.model.Approver;
import responsibility.model.impl.CFO;
import responsibility.model.impl.Manager;
import responsibility.model.impl.Staff;

import java.util.Arrays;

public class ApproverFactory {
    final private String[] approvers;

    public ApproverFactory(String[] approvers) {
        this.approvers = Arrays.copyOf(approvers, approvers.length);
    }

    public Approver creat() {
        Approver flightJohn = new Staff(approvers[0]);
        flightJohn.setNextApprover(new Manager(approvers[1])).setNextApprover(new CFO(approvers[2]));
        return flightJohn;
    }
}
