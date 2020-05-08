package chapter06_Class01;

public class Movie {
  String title= "";
  String director= "";
  float score=0f;
    Movie(String title,String director, float score){
    	  this .title=title;
    	  this.director=director;
    	  this.score=score;
  
    }
    Movie(String title, float score){
    	this(title,null,score);
    }
    public static void main(String[] args) {
    Movie avengers= new Movie("어벤져스","안소니루소",4.8f);
    Movie proro= new Movie("뽀로로대탐험","김현호",3.5f);
    Movie kimchiman= new Movie("김치맨",1.1f);
    System.out.println("제목은"+avengers.title);
    System.out.println("감독은"+avengers.director);
    System.out.println("점수는"+avengers.score);
    System.out.println("제목은"+proro.title);
    System.out.println("감독은"+proro.director);
    System.out.println("점수는"+proro.score);
    System.out.println("제목은"+kimchiman.title);
    System.out.println("감독은"+kimchiman.director);
    System.out.println("점수는"+kimchiman.score);
    
    }
}