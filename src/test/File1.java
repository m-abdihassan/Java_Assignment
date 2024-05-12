package test;

import java.io.File;

public class File1 {
    public void abuurFolder(){
        try {
            File f=new File("JAMHUURIYA");
            System.out.println(f.mkdir()?"waa la abuuray folder":"lama abuurin");
        }catch (Exception ex){
            System.err.println(ex.getMessage());
        }

    }

public  void  show(){
    try {
        File f=new File("F:\\JavaProjects\\CA2113Project");
        File[]files=f.listFiles();
        for (File fil:files){
            if(fil.isFile())
                System.out.println("File name: "+fil.getName());
            else if(fil.isDirectory())
                System.out.println("Folder name: "+fil.getName());
        }

    }catch (Exception ex){
        System.err.println(ex.getMessage());
    }
}
    public File1(){
//        abuurFolder();
        show();
    }
}
