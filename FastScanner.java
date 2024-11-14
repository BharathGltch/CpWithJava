import java.io.*;
import java.util.*;

class Main{
static class FastScanner{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st=new StringTokenizer("");
    PrintStream  ps=new PrintStream(System.out);
    
   String next(){
    while(!st.hasMoreTokens())
        try{
           st=new StringTokenizer(br.readLine());
        }catch(IOException e){

        }
        
        return st.nextToken();
   }

   int nextInt(){
    return Integer.parseInt(next());
   }

   long nextLong(){
    return Long.parseLong(next());
   }

   double nextDouble(){
    return Double.parseDouble(next());
   }

   String nextLine(){
    String str="";
    try{
        str=br.readLine();
    }catch(IOException ex){
        ex.printStackTrace();
    }
    return str;
}

}

    public static void main(String args[]){
        FastScanner fs=new FastScanner();
        int noOfTestCases=fs.nextInt();
        for(int i=0;i<noOfTestCases;i++){
            String input=fs.nextLine();
            StringTokenizer stToken=new StringTokenizer(input);
            int l=0,r=0,modI=0,k=0;
            while(stToken.hasMoreTokens()){
                l=Integer.parseInt(stToken.nextToken());
                r=Integer.parseInt(stToken.nextToken());
                modI=Integer.parseInt(stToken.nextToken());
                k=Integer.parseInt(stToken.nextToken());
            }
            int twoModI=1;
            twoModI=twoModI<<modI;
            int kModtwoModI=k%twoModI;
            
            int xOrResult=0;;
            boolean firstValNotFound=true;
            for(int iteration=l;iteration<=r;iteration++){
                    if(iteration!=kModtwoModI){
                        if(firstValNotFound){
                            xOrResult=iteration;
                        }else{
                            xOrResult=xOrResult^iteration;
                        }
                    }
            }
            fs.ps.println(xOrResult);
        }


    }
}