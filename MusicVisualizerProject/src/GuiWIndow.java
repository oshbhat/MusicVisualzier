import java.io.FileNotFoundException;

//THis is where I draw everything to represent students music preference
//There are glyphs, and a glyph is amount of peopple who responded for x question / total survey responses
//there is a glyph for each of the three main categoires, (major, hobby and region) with their subcategories
//THese glyphs are drawn from a black pole in the middle of the screen , the left side is the heard side
//the right hand is the liked side

//here is the snippet
public class GuiWIndow {


    private boolean title;
    private boolean artist;
    private boolean year;
    private boolean genre;
   // private Window window;


    //BUTTON OBJECT WAS GIVEN BY INSTRUCTOR'S LIBRARY

    /*
    private Button sortTitle;
    private Button sortArtist;
    private Button sortGenre;
    private Button sortYear;

    private Button repMajor;
    private Button repRegion;
    private Button repHobby;

    private Button prev;
    private Button next;
    private Button quit;
*/
    // legend
    //private Shape pole;
    //private TextShape heardLeft;
    //private TextShape likedRight;

    // 9 black center poles

    //private Shape leftPole1;
    //private Shape middlePole1;
    //private Shape rightPole1;

    //private Shape leftPole2;
    //private Shape middlePole2;
    //private Shape rightPole2;

   // private Shape leftPole3;
    //private Shape middlePole3;
    //private Shape rightPole3;

    // hobby legend shapes

    //private Shape hobbyText;
    //private Shape hobbyReading;
    //private Shape hobbySports;
    //private Shape hobbyMusic;
    //private Shape hobbyArt;

    // major legend shapes

   // private Shape majorText;
   // private Shape majorCompSci;
    //private Shape majorOtherEng;
   // private Shape majorMathCmda;
    //private Shape majorOther;

    // region legend shapes

   // private Shape regionText;
    //private Shape regionNorthEast;
   // private Shape regionSouthEast;
   // private Shape regionRestUS;
   // private Shape regionOutsideUS;

    // boolean
    private boolean hobbyCategory;
    private boolean regionCategory;
    private boolean majorCategory;

    // sortedClass object that allows me to call the sort methods

    // counter that will help with the next and prev buttons
    private int pageCounter;



    //There will also be a legend in the bottom right hand corner which will be color coded for each subcategory
    //for each of the three main categories



    public void GUIVisualizerWindow(
        LinkedList<Song> soList,
        LinkedList<Student> stuList,
        String music,
        String song)
        throws FileNotFoundException {

        title = true;
        artist = false;
        year = false;
        genre = false;

        majorCategory = false;
        hobbyCategory = true;
        regionCategory = false;
        pageCounter = 1;

        /*
        prev = new Button("<- Prev");
        prev.onClick(this, "clickedPrev");
        prev.disable();

        next = new Button("Next ->");
        next.onClick(this, "clickedNext");

        quit = new Button("Quit");
        quit.onClick(this, "clickedQuit");

        sortArtist = new Button("Sort by Artist");
        sortArtist.onClick(this, "clickedSortArtist");

        sortTitle = new Button("Sort by Title");
        sortTitle.onClick(this, "clickedSortTitle");

        sortYear = new Button("Sort by Year");
        sortYear.onClick(this, "clickedSortYear");

        sortGenre = new Button("Sort by Genre");
        sortGenre.onClick(this, "clickedSortGenre");

        repMajor = new Button("Represent by Major");
        repMajor.onClick(this, "clickedRepMajor");

        repHobby = new Button("Represent by Hobby");
        repHobby.onClick(this, "clickedRepHobby");

        repRegion = new Button("Represent by Region");
        repRegion.onClick(this, "clickedRepRegion");

        window.addButton(repHobby, WindowSide.SOUTH);
        window.addButton(repMajor, WindowSide.SOUTH);
        window.addButton(repRegion, WindowSide.SOUTH);
        window.addButton(quit, WindowSide.SOUTH);

        window.addButton(prev, WindowSide.NORTH);
        window.addButton(sortTitle, WindowSide.NORTH);
        window.addButton(sortArtist, WindowSide.NORTH);
        window.addButton(sortGenre, WindowSide.NORTH);
        window.addButton(sortYear, WindowSide.NORTH);
        window.addButton(next, WindowSide.NORTH);
        */
    }


}
