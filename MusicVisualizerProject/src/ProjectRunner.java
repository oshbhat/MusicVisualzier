import java.io.FileNotFoundException;

//Here is where everything is set up to start the program
//Will have a CsvReader object along with a GuiWindow object
//here is a snippet of it
public class ProjectRunner {
    public static void main(String[] args) throws FileNotFoundException {
        String m = "SongList2018.csv";
        String s = "MusicSurveyData2018.csv";

        if (args.length == 2) {

            m = args[1];
            s = args[0];
        }

}
}
