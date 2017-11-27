package kata1.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Kata1 {

    public static void main(String[] n)throws FileNotFoundException,IOException{
        String p="C:/Users/NESTOR/Documents/NetbeansProjects/Kata1/persons.txt";
        BufferedReader br = new BufferedReader (new FileReader(new File(p)));
        
        List<Person> personas = new ArrayList<>();
    
        String line;
        while ((line = br.readLine()) != null) {
            personas.add(new Person(line.split(":")[0],
                    new Date(
                        Integer.parseInt(line.split(":")[1].split("-")[2]),
                        Integer.parseInt(line.split(":")[1].split("-")[1]),
                        Integer.parseInt(line.split(":")[1].split("-")[0]))));
            System.out.println(personas);
        }
    }
}