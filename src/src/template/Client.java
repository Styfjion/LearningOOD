package template;

import template.model.PM;
import template.model.impl.APIProject;
import template.model.impl.HRProject;

public class Client {
    public static void main(String[] args) {
        PM pm = new HRProject();
        pm.kickoff();

        pm = new APIProject();
        pm.kickoff();
    }
}
