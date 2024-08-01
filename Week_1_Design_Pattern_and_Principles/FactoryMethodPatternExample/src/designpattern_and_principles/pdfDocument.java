package designpattern_and_principles;

public class pdfDocument implements DocumentFactory{

    @Override
    public void createDocument() {
        System.out.println("pdf Doc. is Created.");
    }
    
}