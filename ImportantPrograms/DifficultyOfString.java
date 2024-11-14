package ImportantPrograms;

public class DifficultyOfString {
  public static boolean isHardWord(String word){
    word=word.toLowerCase();
    String check="aeiou";
    int vCount=0;
    int cCount=0;
    for(int i=0;i<word.length();i++){
       char ch = word.charAt(i);
       if(check.contains(Character.toString(ch))) vCount++;
       else cCount++;
    }
    if(cCount > vCount) return true;
    else{
        for(int i=0;i<=word.length()-3;i++){
           String x=Character.toString(word.charAt(i));
           String y=Character.toString(word.charAt(i+1));
           String z=Character.toString(word.charAt(i+2));
           if(check.contains(x) && check.contains(y) && check.contains(z)) return true;
        }
    }
    return false;
  }
  public static int countDifficulty(String str){
     int hardWord=0;
     int softWord=0;
     String words[] = str.trim().split(" ");
     for(String word:words){
        if(isHardWord(word)) hardWord++;
        else softWord++;
     }
    //  System.out.println(hardWord+" "+softWord);
     return (5*hardWord)-(2*softWord);
  }
  public static void main(String[] args) {
      String str="Hello , I am Aditya";
      String str2="qlewldoaa life ace by fantasy";
      System.out.println(str+"->"+countDifficulty(str));
      System.out.println(str2+"->"+countDifficulty(str2));
  }
}
