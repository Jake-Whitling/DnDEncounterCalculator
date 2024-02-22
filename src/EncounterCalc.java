import java.util.Scanner;
public class EncounterCalc {
    /**
     * A DM tool: An encounter calculator to generate the quantity of XP required to generate a challenge
     * for a party of adventureres. 
     */
    private int[] numOfCharacters; //Quantity of characters in party

    /**
     * Create an encounter caluclator object
     * @param quant The quantity of characters int the party
     */
    public EncounterCalc(int quant){
        numOfCharacters = new int [quant];
    }

    /**
     * Set the levels to the list of number of characters requiring the user to input the level of each member
     */
    public void setCharLevels(){
        int charNum = 1;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numOfCharacters.length; i++) {
            System.out.println("What is character " + charNum + "'s level: ");
            numOfCharacters[i] = input.nextInt();
            charNum++;
        }

        input.close();
    }

    /**
     * Print a list of each character and their level
     */
    public void printNumOfCharacters(){
        int i = 0;
        while (i < numOfCharacters.length){
            i++;
            System.out.println("Character " + i + " is level " + numOfCharacters[i-1]);
        }
    }
}
