package pl.sda.Files.simple;

 class App {

    public static void main(String args[]){
         SimpleFileReader reader = new SimpleFileReader();
         reader.readFile("C:\\Users\\andre\\IdeaProjects\\SDA_J19_Files\\src\\main\\resources\\simple.txt");
        System.out.println(reader
        );
        SimpleFileWriter writer = new SimpleFileWriter();
        writer.write("Moja zawartość","C:\\Users\\andre\\IdeaProjects\\SDA_J19_Files\\src\\main\\resources\\test.txt");
     }
}
