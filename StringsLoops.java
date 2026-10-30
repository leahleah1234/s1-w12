public class StringsLoops{
    public StringsLoops(){
  
    }
    //string destroy loop
    //string stays intact 
    public int length(String s){
      int count = 0;
      while(!s.equals("")) {
        s = s.substring(1);
        count++; 
      }
      return count;
    }
    //"leah", 3 --> "leahleahleah"
    //concatenation means join --> "+"
    public String copy(String s, int num){
      String x = s;
      while(num != 1) {
        s = x + s;
        num--;
      }
      return s;
    }
    //s1 = "sean" s2 = "frog" ==> sferaong
    public String interweaving(String s1, String s2){
      int count = 0;
      String newWord = "";
      while(count < s1.length()+ s2.length()) {
        newWord = s1.substring(count, count+1) + s2.substring(count, count+1);
        count++; 
        
      }
      return newWord;
    }
  
  
  }