import java.io.*;


class Problem_03_CountCharTypes {

     public static void main(String[] args) throws IOException {

         String vowelsSymbols = "aeiou";
         String punctuationSymbols = "!.,?";

         Integer consonantsCount = 0;
         Integer vowelsCount = 0;
         Integer symbolsCount = 0;

         FileInputStream inputStream = new FileInputStream
         (new File("resources\\words.txt"));

         FileWriter writer = new FileWriter
         (new File("resources\\count-chars.txt"));

         int symbol;
         while((symbol = inputStream.read())!=-1){

             char c = (char)symbol;
             if(vowelsSymbols.contains(c+"")){
                 vowelsCount++;
             }else if(punctuationSymbols.contains(c+"")){
                 symbolsCount++;
             }else if(Character.isLetter(c)){
                 consonantsCount++;
             }
         }

         writer.write(String.format("Vowels: %d%n", vowelsCount));
         writer.write(String.format("Consonants: %d%n", consonantsCount));
         writer.write(String.format("Punctuation: %d%n", symbolsCount));

         inputStream.close();
         writer.close();
     }
 }
