package pb_exam_2;

import java.util.Scanner;

public class e_movie_ratings 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int filmAmount=Integer.parseInt(scanner.nextLine());
		
		double filmRatingTotal=0;
		double max=Double.MIN_VALUE;
		double min=Double.MAX_VALUE;
		
		String bestRatedFilm="";
		double bestRatedFilmRating=0;
		String worstRatedFilm="";
		double worstRatedFilmRating=0;
		
		int filmCounter=0;
		for(filmCounter=0; filmCounter<filmAmount; filmCounter++)
		{
			String filmName=scanner.nextLine();
			double filmRating=Double.parseDouble(scanner.nextLine());
			if(filmRating>max)
			{
				bestRatedFilm=filmName;
				bestRatedFilmRating=filmRating;
				max=bestRatedFilmRating;
			}
			else if(filmRating<min)
			{
				worstRatedFilm=filmName;
				worstRatedFilmRating=filmRating;
				min=worstRatedFilmRating;
			}
			filmRatingTotal+=filmRating;
		}
		System.out.printf("%s is with highest rating: %.1f"+"\n", bestRatedFilm, bestRatedFilmRating);
		System.out.printf("%s is with lowest rating: %.1f"+"\n", worstRatedFilm, worstRatedFilmRating);
		System.out.printf("Average rating: %.1f", (filmRatingTotal/filmCounter));
	}
}
