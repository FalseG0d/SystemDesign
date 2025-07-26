package Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements Directory {
    String name;
    List<Directory> sub;

    public Folder(String name) {
        this.name = name;
        sub = new ArrayList<Directory>();
    }

    public void add(Directory dir) {
        sub.add(dir);
    }

    @Override
    public void ls(int level) {
        for(int i=0;i<level;i++) System.out.print("-");
        System.out.println(name);

        for(Directory dir: sub) dir.ls(level + 1);
    }
}
