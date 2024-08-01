package designpattern_and_principles;

public class wordDocument implements DocumentFactory{

    @Override
    public void createDocument() {
        System.out.println("word Doc. is Created");
    }
    
}
