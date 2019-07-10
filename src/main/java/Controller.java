import Hero.Amazon;
import Hero.Warrior;
import Hero.Wizard;
import Place.Places;

import java.util.Scanner;

public class Controller {

    public static void startGame() {

        Scanner input = new Scanner(System.in);

        Amazon amazon = new Amazon();
        Warrior warrior = new Warrior();
        Wizard wizard = new Wizard();
        int numberOfHero;
        int numberOfPlaces;

        do {
            System.out.println("Witaj w grze. Wybierz swojego bohatera wybierając numer: \n" +
                    "1.Amazonka" + amazon.toString() + ", broń = łuk \n" +
                    "2.Wojownik" + warrior.toString() + ", broń = miecz \n" +
                    "3.Czarodziej" + wizard.toString() + ", broń = magiczna laska");
            System.out.print("Podaj numer:");
            numberOfHero = input.nextInt();

            switch (numberOfHero) {
                case 1:
                    System.out.println("Wybrałes Amazonkę");
                    // int numberOfPlaces;
                    do {
                        System.out.println("Wybierz krainę do której chcesz powędrować: \n" +
                                "1.Cmentarz \n" +
                                "2.Ciemny Las \n" +
                                "3.Lochy \n" +
                                "4.Zakończ działanie programu");
                        numberOfPlaces = input.nextInt();
                        switch (numberOfPlaces) {
                            case 1:
                                amazon.travel(Places.CEMENTARY);
                                break;
                            case 2:
                                amazon.travel(Places.DARK_FOREST);
                                break;
                            case 3:
                                amazon.travel(Places.DUNGEON);
                                break;
                            default:
                                System.out.println("Wybrałeś złą liczbę. Wybierz jeszcze raz");
                        }
                    } while (!(numberOfPlaces == 4));
                    System.out.println("Zakończyłeś program.");
                    break;

                case 2:

                    System.out.println("Wybrałeś Wojownika");
                    do {
                        System.out.println("Wybierz krainę do której chcesz powędrować: \n" +
                                "1.Cmentarz \n" +
                                "2.Ciemny Las \n" +
                                "3.Lochy \n" +
                                "4.Zakończ działanie programu");
                        numberOfPlaces = input.nextInt();
                        switch (numberOfPlaces) {
                            case 1:
                                amazon.travel(Places.CEMENTARY);
                                break;
                            case 2:
                                amazon.travel(Places.DARK_FOREST);
                                break;
                            case 3:
                                amazon.travel(Places.DUNGEON);
                                break;
                            default:
                                System.out.println("Wybrałeś złą liczbę. Wybierz jeszcze raz");
                        }
                    } while (!(numberOfPlaces == 4));
                    System.out.println("Zakończyłeś program.");
                    break;

                case 3:
                    System.out.println("Wybrałeś Czarodzieja");

                    do {
                        System.out.println("Wybierz krainę do której chcesz powędrować: \n" +
                                "1.Cmentarz \n" +
                                "2.Ciemny Las \n" +
                                "3.Lochy \n" +
                                "4.Zakończ działanie programu");
                        numberOfPlaces = input.nextInt();
                        switch (numberOfPlaces) {
                            case 1:
                                amazon.travel(Places.CEMENTARY);
                                break;
                            case 2:
                                amazon.travel(Places.DARK_FOREST);
                                break;
                            case 3:
                                amazon.travel(Places.DUNGEON);
                                break;
                            default:
                                System.out.println("Wybrałeś złą liczbę. Wybierz jeszcze raz");
                        }
                    } while (!(numberOfPlaces == 4));
                    System.out.println("Zakończyłeś program.");
                    break;
                default:
                    System.out.println("Wybrałeś złą liczbę. Wybierz jeszcze raz");
            }
        } while (!(numberOfHero == 1 || numberOfHero == 2 || numberOfHero == 3));



    }


}


