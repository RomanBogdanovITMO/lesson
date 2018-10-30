package lesson6Homework.task02;

public class FileVide {
    public void operation(String chois){
        if(chois.equals("File.Xml")){
            XmlHandler  xmlHandler =  new XmlHandler("File.Xml");
            xmlHandler.read();
            xmlHandler.write();
        }else if(chois.equals("File.Txt")){
           TxtHandler txtHandler =  new TxtHandler("File.Txt");
           txtHandler.read();
           txtHandler.write();
        }else {
            System.out.println("erro");
        }
    }
}
