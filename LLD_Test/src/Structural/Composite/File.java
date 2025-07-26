package Structural.Composite;

public class File implements Directory {
    String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void ls(int level) {
        for(int i=0;i<level;i++) System.out.print("-");
        System.out.println(name);
    }
}
