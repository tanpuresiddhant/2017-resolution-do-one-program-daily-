public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        HelloWorld hw = new HelloWorld();
        hw.sieveOfSundaram(20);
     }
     
     public void sieveOfSundaram(int n){
         int newN = (n-2)/2;
         boolean[] result = new boolean[newN+1];
         
         for(int i =1;i<=newN;i++){
             for(int j =1;i+j+2*i*j<=newN;j++){
                 result[i+j+2*i*j] = true; 
             }
         }
         
         if(n>2) System.out.println(2);
         
         for(int i=1;i<=newN;i++){
             if(result[i]==false) System.out.println(2*i + 1);
         }
     }
}
