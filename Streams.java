import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

class Streams {
   public static void main(String[] args) {


      List<String> list = Arrays.asList("Banana","Apple","Banana","Mango");
      long occurences =  list.stream().filter(word->word.equals("Banana")).count();

      // int [] arr = {4, 6, 3, 5, 756, 73, 245, 67, 44};

      // int result =Arrays.stream(arr).filter(i->i%2==1).sum();
      // // int sum2 = arr.stream ()
      // //                   .map(i->i*2)
      // //                   .mapToInt(i -> i)
      // //                   .sum();

     System.out.println(occurences);
     System.out.println(1+2+3+"hi"+5+6);

   //  int size = 10_000;
   //  List<Integer> nums = new ArrayList<>(size);

   //      Random ran = new Random();

   //      for (int i=1;i<size;i++)
   //          nums.add(ran.nextInt (100)) ;
    

   //  long startSeq = System. currentTimeMillis();

   //  int sum2 = nums.stream ()
   //                      .map(i->i*2)
   //                      .mapToInt(i -> i)
   //                      .sum();
   //   long endSeq = System. currentTimeMillis();
   //      long startPara = System. currentTimeMillis();
   //    int sum3 = nums.parallelStream()
   //                                  .map(i -> i*2)
   //                                  .mapToInt(i -> i)
   //                                  .sum();
   //      Long endPara = System.currentTimeMillis();
   //      System. out .println(sum2 + " " + sum3);
   //      System. out .println("Seq: " + (endSeq - startSeq));
   //      System. out .println("Para: " + (endPara - startPara));       
   }    
    
    
}
