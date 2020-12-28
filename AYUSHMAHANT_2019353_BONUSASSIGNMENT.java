import java.io.IOException;
import java.util.*;


class AYUSHMAHANT_2019353_BONUSASSIGNMENT { 
    public static void main(String[] args) throws IOException
    {
Scanner sc=new Scanner(System.in);

System.out.println("Enter A for associative, D for direct mapping and S for set associative ");
char ch=sc.next().charAt(0);
if(ch=='A')
{

System.out.println("Enter the block size in Bytes");
int B=sc.nextInt();
System.out.println("Enter the memory size(no. of bits)");
int N=sc.nextInt();
System.out.println("Enter the  cache size or the number of cache lines");
int numblocks=sc.nextInt();
//int numblocks=(int)((int)(Math.pow(2, N))/B); //number of blocks
int cl=numblocks;
System.out.println("Enter the number of operations you want to perform");
int op=sc.nextInt();
System.out.println("Enter w for writing and r for reading along with the physical address and the data in case of write");
String arr[]=new String[numblocks/2];//level 1 of cache
String arr1[]=new String[numblocks];//level 2 of cache
String bloom[][]=new String[numblocks/2][B];
String bloon1[][]=new String[numblocks][B];
for(int q=0;q<arr.length;q++)
{arr[q]="abc";}
for(int q=0;q<arr1.length;q++)
{arr1[q]="bbc";}
for(int i=0;i<op;i++)
{
char stp=sc.next().charAt(0);
if(stp=='w')
{
String str=sc.next();
String numb=sc.next();
int blockoffset=0;
for(int j=1;j<33;j++)
{
    if((int)Math.pow(2, j)==B)
    {blockoffset=j;
    break;}
    
}

int tagsize=N-blockoffset;
String tag=str.substring(0,tagsize);
String blockoffstring=str.substring(tagsize);
int decimal=Integer.parseInt(blockoffstring,2);
//System.out.println(decimal);
int sd=0;
for(int q=0;q<arr.length;q++)
{
   if(tag.equals(arr[q]))
   {System.out.println("Cache hit");
sd=1;
bloom[q][decimal]=numb;
System.out.println("Replace value in the tag  "+ tag+ "    "+ bloom[q][decimal]  );
break;

   } 

}int sq=0;
if(sd==0)
{
for(int h=0;h<arr1.length;h++)
{if(arr1[h].equals(tag))
    {System.out.println("Cache hit");
  sq=1;
    bloon1[h][decimal]=numb;
    System.out.println("Replace value in the tag  "+ tag+ "    "+ bloon1[h][decimal]  );
    break;
}

}}
int aq=0; 
if(sq==0)
{
for(int gg=0;gg<arr.length;gg++)
{
    if(arr[gg].equals("abc"))
    {System.out.println("cache miss");
        aq=1;
        arr[gg]=tag;
        bloom[gg][decimal]=numb;
        break;
    }
}



}
if(aq==0)

{for(int gg=0;gg<arr1.length;gg++)
    {
        if(arr1[gg].equals("bbc"))
        {System.out.println("Cache miss");
            arr1[gg]=tag;
            bloon1[gg][decimal]=numb;
            break;
        }
    }

}}

else if(stp=='r') //read

{
    String stt=sc.next();

    int blockoffset=0;
    for(int j=1;j<33;j++)
    {
        if((int)Math.pow(2, j)==B)
        {blockoffset=j;break;}
        
    }
    
    int tagsize=N-blockoffset;
    String tag=stt.substring(0,tagsize);
    String blockoffstring=stt.substring(tagsize);
    int lengg=blockoffstring.length();
    int decimal=Integer.parseInt(blockoffstring,2);
    int sd=0;
    //for(int q=0;q<arr.length;q++)
    //{
     // System.out.println(arr[q]);}}
    for(int q=0;q<arr.length;q++)
    {
       if(tag.equals(arr[q]) && bloom[q][decimal]!=null)
       {System.out.println("Cache hit");
    sd=1;
    System.out.println("Present in the level 1"+bloom[q][decimal]);
    break;
    
       } }
   //  System.out.println(tagsize);
   //  System.out.println(tag);
int gf=0;
if(sd==0)
{
    for(int q=0;q<arr1.length;q++)
    {
       if(tag.equals(arr1[q]) && bloon1[q][decimal]!=null)
       {System.out.println("Cache hit");
gf=1;
    System.out.println("Present in the level 2"+bloon1[q][decimal]);
    break;
    
       } }

}
if(gf==0)
{
    System.out.println("Cache miss");
}




}
}}


if(ch=='D')
{

System.out.println("enter the number of bits");
int n=sc.nextInt();
System.out.println("Enter the number of cache lines or the number of blocks");
int cl=sc.nextInt();
System.out.println("Enter the block size");
int b=sc.nextInt();
System.out.println("Enter the number of queries");
int qsa=sc.nextInt();
int blockset=0;

for(int j=1;j<33;j++)
{
    if((int)Math.pow(2, j)==b)
    {blockset=j;
    break;}
    

}
String xyz=Integer.toBinaryString(cl-1);
int xyleng=xyz.length();
int tager=((n-blockset)-xyleng);



String arr[]=new String[cl/2];
String arr1[]=new String[cl];
String blockk[][]=new String[cl/2][b];
String blockk1[][]=new String[cl][b];
//String arr[]=new String[cl];//cache ke tag array
//String arr1[]=new String[(int) (Math.pow(2, 16))];//main memory
//String bloom[][]=new String[cl][b];
for(int qw=0;qw<arr.length;qw++){

arr[qw]="abc";}

for(int qw=0;qw<arr1.length;qw++)
{arr1[qw]="bbc";}
for(int i=0;i<qsa;i++)
{
System.out.println("Enter w for writing in the cache and r for reading in the cache");
char cp=sc.next().charAt(0);




if(cp=='w')
{
String stp=sc.next();
String num=sc.next();




int tagsize=n-blockset;
String tag=stp.substring(0,tagsize);//tag+index
String blockoffstring=stp.substring(tagsize);//offset
int decimal=Integer.parseInt(blockoffstring,2);
//System.out.println(decimal);
int sd=0;

//11001 jo ki hai tag toh 001 ana chahiye inside ddd
String ppp=tag.substring(0,tager);// tag
String z1=tag.substring(tager);//index
//System.out.println(ppp);
//System.out.println(z1);
//System.out.println(arr[Integer.parseInt(z1,2)]);
if(Integer.parseInt(z1,2)<(cl/2)){
if(arr[Integer.parseInt(z1,2)].equals(ppp))
{


System.out.println("Cache hit");
blockk[Integer.parseInt(z1,2)][decimal]=num;//replacemetn
System.out.println("The replacement takes placed and the replaced value is  "+ blockk[Integer.parseInt(z1,2)][decimal]);
sd=1;


}}
else

{
    if(arr1[Integer.parseInt(z1,2)].equals(ppp))
{


System.out.println("Cache hit");
blockk1[Integer.parseInt(z1,2)][decimal]=num;//replacemetn
System.out.println("The replacement takes placed and the replaced value is  "+ blockk1[Integer.parseInt(z1,2)][decimal]);
sd=1;


}
}
if(sd==0)
{
    System.out.println("Cache miss");

if(Integer.parseInt(z1,2)<(cl/2))
{    arr[Integer.parseInt(z1,2)]=ppp;

    blockk[Integer.parseInt(z1,2)][decimal]=num;
    arr1[Integer.parseInt(z1,2)]=ppp;
    blockk1[Integer.parseInt(z1,2)][decimal]=num;}
    else
    {
        arr[0]=ppp;
blockk[0][decimal]=num;
arr1[Integer.parseInt(z1,2)]=ppp;
    blockk1[Integer.parseInt(z1,2)][decimal]=num;
    }

}



}


if(cp=='r')

{

String stt=sc.next();

int tagsize=n-blockset;
String tag=stt.substring(0,tagsize);//tag+index
String blockoffstring=stt.substring(tagsize);//offset
int lengg=blockoffstring.length();
int decimal=Integer.parseInt(blockoffstring,2);
//System.out.println(decimal);
int sd=0;

String ppp=tag.substring(0,tager);// tag
String z1=tag.substring(tager);//index
//System.out.println(ppp);
//System.out.println(z1);
//System.out.println(arr[Integer.parseInt(z1,2)]);
if(Integer.parseInt(z1,2)<(cl/2))
{
if(arr[Integer.parseInt(z1,2)].equals(ppp) && blockk[Integer.parseInt(z1,2)][decimal]!=null)
{
//System.out.println("fddkdhdkg");
System.out.println("Cache hit");
System.out.println(blockk[Integer.parseInt(z1,2)][decimal]);//replacemetn
sd=1;
System.out.println("Present in level1");

}

}
else
{
    if(arr1[Integer.parseInt(z1,2)].equals(ppp) && blockk1[Integer.parseInt(z1,2)][decimal]!=null)
{
//System.out.println("fddkdhdkg");
System.out.println("Cache hit");
System.out.println(blockk1[Integer.parseInt(z1,2)][decimal]);//replacemetn
sd=1;
System.out.println("Present in level2");
}
}


if(sd==0)
{System.out.println("Cache miss");

{System.out.println("0");}

       }





}}



}



if(ch=='S')
{

    System.out.println("Enter the block size in Bytes");
    int B=sc.nextInt();
    System.out.println("Enter the memory size(no. of bytes)");
    int N=sc.nextInt();
    System.out.println("enter the kth way ");
    int kway=sc.nextInt();int numblocks;
    System.out.println("Enter the number of clashlines");
    //int numblocks=(int)((int)(Math.pow(2, N))/B); //number of blocks
    numblocks=sc.nextInt();
    int cl=numblocks;
    int sets=cl/kway;
//System.out.println(sets);
    System.out.println("Enter the number of operations you want to perform");
    int op=sc.nextInt();
    System.out.println("Enter w for writing and r for reading along with the physical address and the data in case of write");
    String arr[]=new String[numblocks/2];//cache ke tag array
    String arr1[]=new String[numblocks];//main memory
    String bloom[][]=new String[numblocks/2][B];
    String bloom1[][]=new String[numblocks][B];

    
    for(int q=0;q<arr.length;q++)
    {arr[q]="abc";}
    for(int q=0;q<arr1.length;q++)
    {arr1[q]="bbc";}
    for(int i=0;i<op;i++)
    {
    char stp=sc.next().charAt(0);
    if(stp=='w')
    {
    String str=sc.next();
    String numb=sc.next();
    int blockoffset=0;
    int setter=0;
    for(int j=1;j<33;j++)
    {
        if((int)Math.pow(2, j)==B)
        {blockoffset=j;
        break;}
        
    }  for(int j=1;j<33;j++)
    {
        if((int)Math.pow(2, j)==sets)
        {setter=j;
        break;}
        
    }
//System.out.println(sets);
    int tagsize=N-blockoffset-setter;
    String setr=str.substring(tagsize,(N-blockoffset));//index of  set
    int dec=Integer.parseInt(setr,2);//decimal of the set number
    String tag=str.substring(0,tagsize);
    String blockoffstring=str.substring(N-blockoffset);
    int decimal=Integer.parseInt(blockoffstring,2);
    //System.out.println(decimal);
    int sd=0;
    if((dec+1)<=(sets/2))
    {
    for(int q=((dec+1)*kway) -kway;q<((dec+1)*kway);q++)
    {
       if(tag.equals(arr[q]))
       {System.out.println("Cache hit");
    sd=1;
    bloom[q][decimal]=numb;
    System.out.println("Replaced value in the tag  "+ numb);
    break;
    
       } 
    
    }}
   else
    {
    for(int q=((dec+1)*kway) -kway;q<((dec+1)*kway);q++)
    {
       if(tag.equals(arr1[q]))
       {System.out.println("Cache hit");
    sd=1;
    bloom1[q][decimal]=numb;
    System.out.println("Replaced value in the tag  "+ numb);
    break;
    
       } 
    
    }}
    if(sd==0)
    {System.out.println("Cache miss");
   
    if((dec+1)<=(sets/2))
{    
    for(int u=((dec+1)*kway) -kway;u<((dec+1)*kway);u++)
    {//System.out.println(dec);
       // System.out.println(u);
       // System.out.println(arr[u]);
    if(arr[u].equals("abc"))
    {arr[u]=tag;
       // System.out.println(arr[u]);
    bloom[u][decimal]=numb;
   // System.out.println(bloom[u][decimal]);
    //System.out.println(bloom[u][decimal]);
    break;
    }}}
    else
    {
        for(int u=((dec+1)*kway) -kway;u<((dec+1)*kway);u++)
        {//System.out.println(dec);
           // System.out.println(u);
           // System.out.println(arr[u]);
        if(arr1[u].equals("bbc"))
        {arr1[u]=tag;
           // System.out.println(arr[u]);
        bloom1[u][decimal]=numb;
       // System.out.println(bloom[u][decimal]);
        //System.out.println(bloom[u][decimal]);
        break;
        }}}  
    }}
    
    
    
    

    
    else if(stp=='r') //read
    
    {int setter=0;
        String stt=sc.next();
    
        int blockoffset=0;
        for(int j=1;j<33;j++)
        {
            if((int)Math.pow(2, j)==B)
            {blockoffset=j;break;}
            
        }for(int j=1;j<33;j++)
        {
            if((int)Math.pow(2, j)==sets)
            {setter=j;
            break;}
            
        }
    
        
        int tagsize=N-blockoffset-setter;
        String tag=stt.substring(0,tagsize);
     //   System.out.println(tagsize);
       // System.out.println(N-blockoffset);
        String setr=stt.substring(tagsize,(N-blockoffset));//index of  set
       // System.out.println("setr");
        int dec=Integer.parseInt(setr,2);
        String blockoffstring=stt.substring(N-blockoffset);
        int lengg=blockoffstring.length();
        int decimal=Integer.parseInt(blockoffstring,2);
        int sd=0;
        //for(int q=0;q<arr.length;q++)
        //{
  
    if((dec+1)<=(sets/2))
    {
         for(int q=((dec+1)*kway) -kway;q<((dec+1)*kway);q++)
        {
           if(tag.equals(arr[q]) && bloom[q][decimal]!=null)
           {System.out.println("Cache hit");
        sd=1;
        System.out.println("Present in level 1");
        System.out.println(bloom[q][decimal]);
        break;
        
           } }}
           else

           {
            for(int q=((dec+1)*kway) -kway;q<((dec+1)*kway);q++)
            {//System.out.println(arr1[q]);
               // System.out.println(bloom1[q][decimal]);
               if(tag.equals(arr1[q]) && bloom1[q][decimal]!=null)
               {System.out.println("Cache hit");
            sd=1;
            System.out.println("Present in level 2");
            System.out.println(bloom1[q][decimal]);
            break;
            
               } }
           }
       //  System.out.println(tagsize);
       //  System.out.println(tag);
    
    if(sd==0)
    {System.out.println("Cache miss");}
    
    
           }
    
        }}
}}


















