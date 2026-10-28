public class NumbersLoops {
  public NumbersLoops() {
    int index = 0;
    while (index < 11) {
      System.out.println(index);
      index++;
    }

    System.err.println("What is index now: " + index);

    int index2 = 0;
    for (; index2 < 11; index2++) {
      System.out.println(index2);
    }
    System.out.println("What is index2 now: " + index2);
  }

  public int digitSum(int num) {
    int sum = 0;
    while (num > 0) {
      sum = sum + num;
      num = num - 1;
    }

    return sum;
  }

  public int reverseNum(int num) {
    // 123 mod 10 ==> 3
    // 123 / 10 ==> 2
    // 12 mod 10 ==> 2
    // 12 / 10 = 1 
    // 1 mod 10 ==> 1 
    // 1 / 10 ==> 0
    // How are you going 3 ... 32 ... 321 
    int newNum = 0;

    while(num > 0) {
      newNum = (num % 10) + (newNum * 10);
     num /= 10; 

      }

    return newNum;
  }

  // EX:
  // Start 100, Finish 125
  // returns 3 (101, 111, 121)
  public int palindromeCount(int start, int finish) {
    int count = 0;
    for(; start <= finish; start++) {
      if(start == reverseNum(start)) {
        count++;
      }
    }
    return count; 
  }

}
