package pb_mock_exam;

import java.util.Scanner;

public class a_series_runtime 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String seriesName=scanner.nextLine();
		int seriesSeasons=Integer.parseInt(scanner.nextLine());
		int seriesEpisodes=Integer.parseInt(scanner.nextLine());
		double episodeRuntimeWithoutAds=Double.parseDouble(scanner.nextLine());
		
		double episodeRuntimeWithAds=episodeRuntimeWithoutAds*1.2;
		double episodeSpecialRuntime=seriesSeasons*10;
		double episodeRuntimeTotal=(seriesSeasons*seriesEpisodes*episodeRuntimeWithAds)+episodeSpecialRuntime;
		
		System.out.printf("Total time needed to watch the %s series is %.0f minutes.", seriesName, Math.floor(episodeRuntimeTotal));
	}
}
