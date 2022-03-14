package responsibility;

import responsibility.factory.ApproverFactory;
import responsibility.model.Approver;

public class Client {
    public static void main(String[] args) {
        String[] approvers = {"张飞", "关羽", "刘备"};
        ApproverFactory approverFactory = new ApproverFactory(approvers);
        Approver approver = approverFactory.creat();

        approver.approve(1000);
        approver.approve(4000);
        approver.approve(9000);
        approver.approve(88000);
    }
}
