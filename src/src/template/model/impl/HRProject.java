package template.model.impl;

import template.model.PM;

import java.util.Random;

public class HRProject extends PM {
    final private Random random = new Random();

    @Override
    public String analyze() {
        System.out.println("分析师：需求分析......");
        return "人力资源系统管理需求";
    }

    @Override
    public String design(String project) {
        System.out.println("架构师：架构设计......");
        return "设计（" + project + "）";
    }

    @Override
    public String develop(String project) {
        if (project.contains("bug")) {
            System.out.println("开发：修复bug......");
            project = project.replace("bug", "");
            project = "修复（" + project + "）";
            if (random.nextBoolean()) {
                project += "bug";
            }
            return project;
        }

        System.out.println("开发：写代码......");
        if (random.nextBoolean()) {
            project += "bug";
        }
        return "开发（" + project + "）";
    }

    @Override
    public boolean test(String project) {
        if (project.contains("bug")) {
            System.out.println("测试：发现bug......");
            return false;
        }
        System.out.println("测试：用例通过......");
        return true;
    }

    @Override
    public void release(String project) {
        System.out.println("管理员：上线发布......");
        System.out.println("=================最终产品==================");
        System.out.println(project);
        System.out.println("==========================================");
    }
}
