class Movies {

    String title;
    String genre; 
    String filmRating;
    String language;
    int year;
    String country;
    String director;
    String subtitle;
    String ost;
  
  public Movies(String title, String genre, String filmRating, 
  String language, int year,String country, String director, 
  String subtitle, String ost ) {
  
    this.title = title;
    this.genre = genre;
    this.filmRating = filmRating;
    this.language = language;
    this.year = year;
    this.country = country;
    this.director = director;
    this.subtitle = subtitle;
    this.ost = ost;
  }
  
  public void display() {
    System.out.println("The movie's title is " + title); 

    System.out.println("The movie's genre is " + genre);

    System.out.println("The age category for this movie is " + filmRating);

    System.out.println("The language used by the movie is " + language);

    System.out.println("The year the movie released is " + year); 

    System.out.println("The movie's origin country is " + country);

    
    System.out.println("The movie's director is " + director);
    
    System.out.println(" ");

    
  }
  
  public void play() {
    System.out.println("Subtitle ON: " + subtitle);
    System.out.println("Original Soundtrack ON: " + ost);
    System.out.println(" ");
  }
  
  public String getTitle() {
    return title;
  }
  
  public String getGenre() {
    return genre;
  }
  
  public String getfilmRating() {
    return filmRating;
  }

  public String getLanguage() {
    return language;
  }
  
  public int getYear() {
    return year;
  }
  
  public String getCountry() {
    return country;
  }
  
  public String getDirector() {
    return director;
  }
  
}
