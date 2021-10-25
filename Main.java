/*
1.Nivel avansat_ (nota 7 || 8):
    Scrieți un program care să găsească dacă o expresie matematică este corectă 
    din punctul de vedere al parantezelor din ea (`hint` - folosiți stack pentru a stoca paranteze).
    Citiți expresia din fișierul atașat la acest laborator(`one_expression.txt` ) 
    și imprimați rezultatul dacă parantezele sunt puse corect în această expresie.
2.Nivel avansat_ (notă 9 || 10):
    Faceți același lucru pentru un fișier cu 3 expresii în el și imprimați în consolă informații 
    despre toate acestea dacă parantezele din el sunt corectate.
*/
import java.io.File;
import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) throws Exception
    {
        File file1 = new File("D:\\POO\\Lab\\Lab_4_Java\\one_expression.txt");
        Scanner sc1 = new Scanner(file1);
        System.out.println("File Expression:");
        while (sc1.hasNextLine()) 
        {
            String input = sc1.nextLine();
            String inputWithoutSpaces = input.replaceAll("\\s+","");
            System.out.println(input);
            if(ParenthesisValidation.checkParenthesis((inputWithoutSpaces))){System.out.println("Expression is: TRUE!");}
            else{System.out.println("Expression is: FALSE!");}
        }
        sc1.close();
        File file2 = new File("D:\\POO\\Lab\\Lab_4_Java\\three_expressions.txt");
        Scanner sc2 = new Scanner(file2);
        System.out.println("File Expression:");
        while (sc2.hasNextLine()) 
        {
            String input = sc2.nextLine();
            String inputWithoutSpaces = input.replaceAll("\\s+","");
            System.out.println(input);
            if(ParenthesisValidation.checkParenthesis((inputWithoutSpaces))){System.out.println("Expression is: TRUE!");}
            else{System.out.println("Expression is: FALSE!");}
        }
        sc2.close();

    }
}