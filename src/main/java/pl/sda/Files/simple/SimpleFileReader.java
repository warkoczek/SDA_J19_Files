package pl.sda.Files.simple;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//usun public i tylko klasy z pakietu maja dostep
 class SimpleFileReader {

     void readFile(String filePath){
         try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))){
             String line;
             while((line = bufferedReader.readLine()) != null){
                 System.out.println(line);
             }
         } catch (FileNotFoundException e) {
             e.printStackTrace();
         } catch (IOException e) {
             e.printStackTrace();
         }
     }
}
