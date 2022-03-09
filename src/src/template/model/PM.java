package template.model;

public abstract class PM {
    public abstract String analyze(); //需求分析

    public abstract String design(String project); //软件设计

    public abstract String develop(String project); //软件开发

    public abstract boolean test(String project); //软件测试

    public abstract void release(String project); //软件发布

    public final void kickoff() {
        String requirement = analyze();
        String designCode = design(requirement);
        do {
            designCode = develop(designCode);
        } while (!test(designCode));

        release(designCode);
    }
}
