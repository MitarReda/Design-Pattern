package org.example;

import comp.File;
import comp.Folder;

public class Main {
    public static void main(String[] args) {
        Folder root= new Folder("Root");
        root.AddChilds(new File("pom.xml"));
        Folder src=(Folder) root.AddChilds(new Folder("src"));
        Folder main=(Folder) src.AddChilds(new Folder("main"));
        main.AddChilds(new File("test.java"));
        main.AddChilds(new File("Person.java"));
        Folder java= (Folder) main.AddChilds(new Folder("java"));
        java.AddChilds(new File("File.java"));


        root.print();
    }
}