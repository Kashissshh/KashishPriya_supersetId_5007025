package designpattern_and_principles;

public class excelDocument implements DocumentFactory{

    @Override
    public void createDocument() {
        System.out.println("Excel Doc. is Created.");
    }
    
}
