package inheritance;

public class Rectangle extends Square {

    int lungime;

    int latime;

        Rectangle(int lungime, int latime ) {
            super(lungime);
            this.latime = latime;
        }
}
