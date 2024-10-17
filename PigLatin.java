public class PigLatin {
  public static String pigIt(String str) {
    String[] sentence = str.split(" ");
    String finalSentence="";

    for(int i=0;i<sentence.length;i++){
      char inicial=sentence[i].charAt(0);
      boolean puntuacion=inicial=='!'||inicial=='?'||inicial=='.'?true:false;
      for(int j=1; j<sentence[i].length(); j++)
        finalSentence+=sentence[i].charAt(j);
      finalSentence+=""+inicial;
      finalSentence+=puntuacion?"":i==sentence.length-1?"ay":"ay ";
    }

    System.out.println(finalSentence);
    return finalSentence;
  }
}
