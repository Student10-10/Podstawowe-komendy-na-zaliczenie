// 1. SZKIELET PROGRAMU (Zawsze taki sam).
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }
}
----------------------------------------------------------------------
  // 2. SCANNER – WCZYTYWANIE Z KLAWIATURY.
  Scanner sc = new Scanner(System.in);

  // Wczytywanie.
int x = sc.nextInt();        // liczba całkowita
double d = sc.nextDouble(); // liczba z przecinkiem
String s = sc.nextLine();   // tekst
char c = sc.next().charAt(0); // jeden znak
----------------------------------------------------------------------
  // 3. ZMIENNE (najczęstsze).
  int a = 0;
  double b = 0.0;
  boolean flag = false;
  char znak = 'a';
-------------------------------------------------------------------------
  // 4. TABLICE (NAJWAŻNIEJSZE).
  //Tablica liczb całkowitych:
  int[] tab = new int[5];
// Tablica znaków:
char[] tab = new char[5];
// Tablica z tekstu:
char[] tab = tekst.toCharArray();
// Długość tablicy:
tab.length
----------------------------------------------------------------------------
  // 5. WCZYTYWANIE TABLICY.
  for (int i = 0; i < tab.length; i++) {
      tab[i] = sc.nextInt();
  }
-----------------------------------------------------------------------------
  // 6. Pętle.
  // FOR:
  for (int i = 0; i < 5; i++) {
  }
// WHILE:
while (x != 5) {
    x = sc.nextInt();
}
-----------------------------------------------------------------------------
  // 7. Warunki IF.
  if (x > 0) {
  }

  if (x % 2 == 0) {
  }

  if (x % 5 == 0) {
  }

  if (a > b && a > c) {
  }
-----------------------------------------------------------------------------
  // 8. Operacje matematyczne: 
  suma = suma + x;
  iloczyn = iloczyn * x;
// Reszta z dzielenia:
x % 2   // parzysta / nieparzysta
x % 5   // podzielna przez 5
-----------------------------------------------------------------------------
  // 9. Min/Max.
  int max = tab[0];
  int min = tab[0];

  for (int i = 1; i < tab.length; i++) {
      if (tab[i] > max) max = tab[i];
      if (tab[i] < min) min = tab[i];
  }
-----------------------------------------------------------------------------
  // 10. STRINGI (tekst).
  // dlugosc:
  tekst.length()
// Palindrom:
  String odwrocony = "";

  for (int i = tekst.length() - 1; i >= 0; i--) {
      odwrocony = odwrocony + tekst.charAt(i);
  }

  if (tekst.equals(odwrocony)) {
  }
- -----------------------------------------------------------------------------
  // 11. Wypisywanie.
  System.out.println("Tekst");
  System.out.print("Tekst");
  System.out.println("Wynik = " + wynik);
---------------------------------------------------------------------------
  // 12. Losowanie liczb.
  int x = (int)(Math.random() * 6) + 1;
----------------------------------------------------------------------------
  // 13. Macierze.
  int[][] tab = new int[3][3];
- -----------------------------------------------------------------------------
  // 14. Funckje
  static int suma(int a, int b) {
      return a + b;
  }
-----------------------------------------------------------------------------------------
  ----------------------------------------------------------------------------------------
  ----------------------------------------------------------------------------------------
  ZMIENNA – CO TO JEST?

  Zmienna to:
  👉 pudełko, do którego wkładasz jakąś wartość.

  🟦 int x = 5;

  Rozbijamy:

  int → JAKI TYP pudełka

  x → NAZWA pudełka

  = → „włóż do”

  5 → wartość

  📌 Po ludzku:

  „Tworzę pudełko na liczbę całkowitą i wkładam tam 5”

  🟦 double d = 3.14;

  double → liczba z przecinkiem

  d → nazwa (dowolna!)

  3.14 → wartość

  📌 Po ludzku:

  „Tworzę pudełko na liczbę z przecinkiem”

  🟦 String s = "arek";

  String → TEKST

  "arek" → napis (zawsze w " ")

  📌 Po ludzku:

  „Tworzę pudełko na tekst”

  🟦 char c = 'a';

  char → JEDEN ZNAK

  'a' → litera (zawsze ' ', NIE " ")

  📌 Przykłady:

  'a'
  '5'
  '!'

  🟦 boolean flag = false;

  boolean → tylko true / false

  flag → nazwa

  false → wartość

  📌 Po ludzku:

  „Tworzę przełącznik TAK / NIE”

  🔵 DLACZEGO TE LITERKI SĄ RÓŻNE?
  int x

  x to tylko nazwa

  mogłoby być:

  int liczba;
  int a;
  int wiek;

  double d

  d bo krótkie

  też mogłoby być:

  double srednia;

  String s

  s jak „string”

  ale:

  String imie;


  jest OK

  char c

  c jak „character”

  ale:

  char znak;


  📌 Nazwa nie ma znaczenia, liczy się TYP (int, double, itd.)

  🔴 A TERAZ TE LINIE:
  int a = 0;
  double b = 0.0;
  boolean flag = false;
  char znak = 'a';

  Co one robią?

  👉 przygotowują zmienne, żeby potem coś z nimi robić

  📌 Przykład:

  int suma = 0;


  ➡️ zaczynamy liczyć od zera

  🔥 NAJWAŻNIEJSZE DO ZAPAMIĘTANIA
  Typ	Co trzyma	Przykład
  int	liczby całkowite	1, 5, -3
  double	liczby z przecinkiem	3.14
  String	tekst	"arek"
  char	jeden znak	'a'
  boolean	prawda/fałsz	true / false
     ----------------------------------------------------------------------------------------
    // Ostanie zadanie zaliczeniowe:

    Zadanie 30. Wyszukiwanie wspólnych elementów dwóch tablic znakowych

    Opis zadania:
    Napisz program w języku Java, który:

    1. Wczyta od użytkownika dwie tablice znaków (np. dwa oddzielne ciągi znaków).
    2. Znajdzie i wypisze znaki, które występują w obu tablicach.

        Wspólne znaki nie powinny się powtarzać w wyniku.
    3. Wyświetli komunikat w formacie:

        „Wspólne znaki: a, e, k"
        Jeśli nie ma wspólnych znaków: „Brak wspólnych znaków."



    Po zakończeniu konieczne jest odesłanie linka do repozytorium z kodem jak odpowiedź na ten mail.
    ----------------------------------------------------------------------------------------
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            char[] t1 = scanner.nextLine().toCharArray();
            char[] t2 = scanner.nextLine().toCharArray();

            boolean znaleziono = false;

            for (int i = 0; i < t1.length; i++) {
                for (int j = 0; j < t2.length; j++) {

                    if (t1[i] == t2[j]) {

                        boolean juzByl = false;
                        for (int k = 0; k < i; k++) {
                            if (t1[k] == t1[i]) {
                                juzByl = true;
                            }
                        }

                        if (!juzByl) {
                            System.out.print(t1[i] + " ");
                            znaleziono = true;
                        }
                    }
                }
            }

            if (!znaleziono) {
                System.out.println("Brak wspólnych znaków.");
            }

            scanner.close();
        }
    }



  
  
