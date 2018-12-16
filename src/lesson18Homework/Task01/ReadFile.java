package lesson18Homework.Task01;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ReadFile {
    private File file;
   private Map<String, Integer> mapWords;

    public ReadFile(File file, Map<String, Integer> mapWords) {
        this.file = file;
        this.mapWords = mapWords;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public Map<String, Integer> getMapWords() {
        return mapWords;
    }

    public void setMapWords(Map<String, Integer> mapWords) {
        this.mapWords = mapWords;
    }

    public synchronized List<String> getListWords() throws IOException {
        List<String> lines = Files.readAllLines(file.toPath());
        List<String> words = new ArrayList<>();
        for (String line : lines){
            String[] wordSplit = line.toLowerCase().replaceAll("\\p{Punct}", " ").
                    trim().split("\\s");
            for(String s: wordSplit){
                if(s.length()>0){
                    words.add(s.trim());
                }
            }
        }
        return words;
    }


}
