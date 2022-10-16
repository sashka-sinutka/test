class Movie {
    String title;
    String genre;
    int rating;
    void playIt(){
        System.out.println("Проигрывание фильма");
    }
}
class MovieTestDrive{
    public static void main(String[] args){
        Movie one = new Movie();
        one.title = "Как Прогореть на акциях";
        one.genre = "Трагедия";
        one.rating = -2;

        Movie two = new Movie();
        two.title = "Потерянные в офисе";
        two.genre = "Комедия";
        two.rating = 5;
        two.playIt();

        Movie three = new Movie();
        three.title = "Байт-Клуб";
        three.genre = "Трагдия, но в целом веселая";
        three.rating = 127;

    }
}
