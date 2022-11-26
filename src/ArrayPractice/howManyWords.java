package ArrayPractice;

import java.util.Arrays;

public class howManyWords {

    public static void main(String[] args) {

        String str= "As he crossed toward the pharmacy at the corner he involuntarily turned his head because of a"
                + "burst of light that had ricocheted from his temple, and saw, with that quick smile with which we"
                + "greet a rainbow or a rose, a blindingly white parallelogram of sky being unloaded from the van�a"
                + "dresser with mirrors across which, as across a cinema screen, passed a flawlessly clear reflection of"
                + "boughs sliding and swaying not arboreally, but with a human vacillation, produced by the nature of"
                + "those who were carrying this sky, these boughs, this gliding fa�ade.";

        String[] myWord = str.split(" ");
        System.out.println(myWord.length);

        for(String word: myWord) {
            System.out.println(word);
        }

        String info1 = "This info is used for creation password : xxxCD132Gxxx . Please do not share with anyone";
        String info2 = "This info is used for creation password : xxx00ABC!xxx . Please do not share with anyone";


        String[] infoArray1 = info1.split("password :");
        String[] infoArray2 = info2.split("password :");

        System.out.println(Arrays.toString(infoArray1));


        String pass1 = infoArray1[1].split(". Please")[0];

        System.out.println(Arrays.toString(infoArray1[1].split(". Please")));


        String pass2 = infoArray2[1].split(". Please")[0];

        pass1 = pass1.substring(4, 10);
        pass2 = pass2.substring(4, 10);


        System.out.println(pass1.trim() + pass2.trim());
    }
}
