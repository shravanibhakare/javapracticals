 class Random{
 public static int p_count=0;
  public static int n_count=0;
  
   public static void main(String []args){
       
      int i=0;
      while(i<5){
       long startTime = System.nanoTime();
      
      System.out.println("Start Time: " + startTime);
      
      long[] array= genearte_array();
      count_prime(array);
      System.out.println(p_count);
      System.out.println(n_count);
      long endTime = System.nanoTime();
      System.out.println("End Time: " + endTime);
      long time_diff = endTime - startTime;
      System.out.println("time difference :" +time_diff);
       System.out.println("  ");
       System.out.println("  ");
       System.out.println("  ");
      i++;
      p_count=0;
      n_count=0;
    
  }
  }
  
       public static boolean isPrime(long num){
       for(int i=2;i<num/2;i++){
       		if(num%i!=0){
       		return true;
       		}
       		else{
       			return false;
       		}    
       		}  
      	return true;	
       
       }
      
      public static void count_prime(long[] arr){
     	 for(int i=0; i<arr.length; i++){
          if(isPrime(arr[i])){
          	p_count++;
          }
          else{
          	n_count++;
          }
    	}   
   
       }

      public static long[] genearte_array(){
      long[] arr=new long[1000000];
      for(int i=0;i<1000000;i++){
      arr[i]=randomnumbers();
      }
      return arr;	      
      }
       public static long randomnumbers(){
       long num=0;
       for(int k=0; k<7; k++){
        long digit = generaterandomdigit();
         
         num = num*10 + digit ;
         }
         return num;
         
        }
        
        
      public   static long generaterandomdigit(){
     	long digit = System.nanoTime() % 10;
         return digit;
       
    }
   
}

