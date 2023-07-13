package Players.hero.pool.Players.hero.pool;

import Players.hero.pool.Players.hero.pool.services.PlayersHeroPoolServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class PlayersHeroPoolApplication {
	private static final Scanner src = new Scanner(System.in);
	private static PlayersHeroPoolServiceImpl playersHeroPoolService;

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(PlayersHeroPoolApplication.class, args);
		playersHeroPoolService = context.getBean(PlayersHeroPoolServiceImpl.class);
		while (true) {
			System.out.println("You want to get a list of:\n" +
					"1.Players  2.Heroes 3.Abilities ");
			int temp = src.nextInt();
			switch (temp) {
				case 1:
					getPlayers();
					break;
				case 2:
					getHeroes();
					break;
				case 3:
					getAbilities();
					break;

			}
		}
	}
	public static void getPlayers() {
		System.out.println("You want to get :\n" +
				"1.All players 2.Player by name 3.Player by nickname 4.Pool of player heroes by name");
		int temp = src.nextInt();
		switch (temp) {
			case 1:
				playersHeroPoolService.getAllPlayers();
				break;
			case 2:
				src.nextLine();
				String tempS=src.nextLine();
				playersHeroPoolService.getPlayerByName(tempS);
				break;
			case 3:
				src.nextLine();
				tempS=src.nextLine();
				playersHeroPoolService.getPlayerByNickname(tempS);
				break;
			case 4:
				src.nextLine();
				tempS=src.nextLine();
				playersHeroPoolService.getPlayersHeroPoolByName(tempS);
				break;

		}
	}
	public static void getHeroes() {
		System.out.println("You want to get :\n" +
				"1.All heroes 2.Heroes by name 3.Players of this hero by name 4.The abilities of this hero by name");
		int temp = src.nextInt();
		switch (temp) {
			case 1:
				playersHeroPoolService.getAllHeroes();
				break;
			case 2:
				src.nextLine();
				String tempS=src.nextLine();
				playersHeroPoolService.getHeroByName(tempS);
				break;
			case 3:
				src.nextLine();
				tempS=src.nextLine();
				playersHeroPoolService.getHeroPlayersByName(tempS);
				break;
			case 4:
				src.nextLine();
				tempS=src.nextLine();
				playersHeroPoolService.getHeroAbilitiesByName(tempS);
				break;

		}
	}
	public static void getAbilities() {
		System.out.println("You want to get :\n" +
				"1.All abilities");
		int temp = src.nextInt();
		switch (temp) {
			case 1:
				playersHeroPoolService.getAllHeroes();
				break;
			case 2:
				src.nextLine();
				String tempS=src.nextLine();
				playersHeroPoolService.getHeroByName(tempS);
				break;
			case 3:
				src.nextLine();
				tempS=src.nextLine();
				playersHeroPoolService.getHeroPlayersByName(tempS);
				break;
			case 4:
				src.nextLine();
				tempS=src.nextLine();
				playersHeroPoolService.getHeroAbilitiesByName(tempS);
				break;

		}
	}


}
