package Task10.LambdasandStreams;

import java.util.stream.IntStream;
public class App 
{
    public static void main( String[] args )
    {
       int avgelement = IntStream.range(1,11)
    		           .sum();
       System.out.println(avgelement/10);
       
    }
}
