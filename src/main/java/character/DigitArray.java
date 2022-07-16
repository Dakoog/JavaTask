package character;
/*Napisz program, który utworzy dziesięcioelementową tablicę znaków i wypełni ją cyframi od 0 do 9 */
public class DigitArray {
    public static void main(String[] args) {

            char[] digits = new char[10];

            for(int i = 0; i < 10; ++i){
                digits[i] = (char)(i+48);
                }
        System.out.print("Digits: ");
            System.out.print(digits);
        }
    }