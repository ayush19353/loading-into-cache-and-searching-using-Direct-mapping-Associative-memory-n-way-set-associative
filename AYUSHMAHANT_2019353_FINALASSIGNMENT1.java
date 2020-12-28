import java.io.IOException;
import java.util.*;

class AYUSHMAHANT_2019353_FINALASSIGNMENT1 { 
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

int numblocks=(int)((int)(Math.pow(2, N))/B); //number of blocks
int cl=numblocks;
System.out.println("Enter the number of operations you want to perform");
int op=sc.nextInt();
System.out.println("Enter w for writing and r for reading along with the physical address and the data in case of write");
String arr[]=new String[numblocks];//cache ke tag array
String arr1[]=new String[(int) (Math.pow(2, 16))];//main memory
String bloom[][]=new String[numblocks][B];
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
int decimal=Integer.parseInt(blockoffstring,2);//finding out the divisions in the physical address
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

}
if(sd==0)
{System.out.println("Cache miss");int lol=0;
for(int h=0;h<arr1.length;h++)
{if(arr1[h].equals("bbc"))
    {
arr1[h]=str+numb;
lol=h;
break;
    }
}


for(int u=0;u<arr.length;u++)
{
if(arr[u].equals("abc"))
{arr[u]=arr1[lol].substring(0,tagsize);
bloom[u][decimal]=arr1[lol].substring((N));//adding the tag to tag array
arr1[lol]="bbc";
//System.out.println(bloom[u][decimal]);
break;
}}




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
    System.out.println(bloom[q][decimal]);
    break;
    
       } }
   //  System.out.println(tagsize);
   //  System.out.println(tag);

        if(sd==0)
{System.out.println("Cache miss");int lol=-1;

for(int h=0;h<arr1.length;h++)
{if(!arr1[h].equals("bbc"))
{
    if(arr1[h].substring(0,tagsize).equals(tag))
    {
        String temp=arr[0];//replacement
arr[0]=arr1[h].substring(0,tagsize);String temp1=bloom[0][0];
bloom[0][0]=arr1[h].substring((N));
System.out.println("Replaced value of tag from the main memory   "+bloom[0][0]);
String zz="";
for(int gg=0;gg<lengg;gg++)
{zz=zz+"0";}
arr1[h]=temp+zz+temp1;
lol=h;
break;
    }
}}
if(lol==-1)
{System.out.println("0");}//not found address


       }


}

}
System.out.println("Displaying the cache memory");
System.out.println("tag array             "+"block array   ");
for(int i=0;i<arr.length;i++)
{System.out.print(arr[i]+"                      ");
for(int j=0;j<B;j++)
{
System.out.print( bloom[i][j]+"    ");

}
System.out.println();
System.out.println("____________________________________________________________________-");

}

}


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



String arr[]=new String[cl];
String blockk[][]=new String[cl][b];

//String arr[]=new String[cl];//cache ke tag array
String arr1[]=new String[(int) (Math.pow(2, 16))];//main memory
//String bloom[][]=new String[cl][b];
for(int qw=0;qw<cl;qw++){

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
if(arr[Integer.parseInt(z1,2)].equals(ppp))
{

System.out.println("Cache hit");
blockk[Integer.parseInt(z1,2)][decimal]=num;//replacemetn
System.out.println("The replacement takes placed and the replaced value is  "+ blockk[Integer.parseInt(z1,2)][decimal]);
sd=1;


}

if(sd==0)
{System.out.println("Cache miss");int lol=0;




arr[Integer.parseInt(z1,2)]=ppp;

blockk[Integer.parseInt(z1,2)][decimal]=num;
//System.out.println(bloom[u][decimal]);

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

if(arr[Integer.parseInt(z1,2)].equals(ppp) && blockk[Integer.parseInt(z1,2)][decimal]!=null)
{
//System.out.println("fddkdhdkg");
System.out.println("Cache hit");
System.out.println(blockk[Integer.parseInt(z1,2)][decimal]);//replacemetn
sd=1;



}
if(sd==0)
{System.out.println("Cache miss");

{System.out.println("0");}

       }





}}

//System.out.println(arr[0]);
//System.out.println(arr[1]);
System.out.println("Displaying the cache memory");
System.out.println("tag array                "+"block array   ");
for(int i=0;i<arr.length;i++)
{System.out.print(arr[i]+"                      ");
for(int j=0;j<b;j++)
{
System.out.print( blockk[i][j]+"    ");

}
System.out.println();

System.out.println("_____________________________________________________________");
}



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
System.out.println(sets);
    System.out.println("Enter the number of operations you want to perform");
    int op=sc.nextInt();
    System.out.println("Enter w for writing and r for reading along with the physical address and the data in case of write");
    String arr[]=new String[numblocks];//cache ke tag array
    String arr1[]=new String[(int) (Math.pow(2, 16))];//main memory
    String bloom[][]=new String[numblocks][B];
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
    for(int q=((dec+1)*kway) -kway;q<((dec+1)*kway);q++)
    {
       if(tag.equals(arr[q]))
       {System.out.println("Cache hit");
    sd=1;
    bloom[q][decimal]=numb;
    System.out.println("Replaced value in the tag  "+ numb);
    break;
    
       } 
    
    }
    if(sd==0)
    {System.out.println("Cache miss");int lol=0;
    for(int h=0;h<arr1.length;h++)
    {if(arr1[h].equals("bbc"))
        {
    arr1[h]=str+numb;
    //System.out.println(arr1[h]);
    lol=h;
    break;
        }
    }
    
    
    for(int u=((dec+1)*kway) -kway;u<((dec+1)*kway);u++)
    {//System.out.println(dec);
       // System.out.println(u);
       // System.out.println(arr[u]);
    if(arr[u].equals("abc"))
    {arr[u]=arr1[lol].substring(0,tagsize);
       // System.out.println(arr[u]);
    bloom[u][decimal]=arr1[lol].substring((N));
   // System.out.println(bloom[u][decimal]);
    //System.out.println(bloom[u][decimal]);
    break;
    }}
    
    
    
    
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
        String setr=stt.substring(tagsize,(N-blockoffset));//index of  set
        int dec=Integer.parseInt(setr,2);
        String blockoffstring=stt.substring(N-blockoffset);
        int lengg=blockoffstring.length();
        int decimal=Integer.parseInt(blockoffstring,2);
        int sd=0;
        //for(int q=0;q<arr.length;q++)
        //{
         // System.out.println(arr[q]);}}
        
         for(int q=((dec+1)*kway) -kway;q<((dec+1)*kway);q++)
        {
           if(tag.equals(arr[q]) && bloom[q][decimal]!=null)
           {System.out.println("Cache hit");
        sd=1;
        System.out.println(bloom[q][decimal]);
        break;
        
           } }
       //  System.out.println(tagsize);
       //  System.out.println(tag);
    
            if(sd==0)
    {System.out.println("Cache miss");int lol=-1;
    
    for(int h=0;h<arr1.length;h++)
    {if(!arr1[h].equals("bbc"))
    {
        if(arr1[h].substring(0,tagsize).equals(tag))
        {
            String temp=arr[((dec+1)*kway) -kway];//replacement
    arr[((dec+1)*kway) -kway]=arr1[h].substring(0,tagsize);String temp1=bloom[((dec+1)*kway) -kway][0];
    bloom[0][0]=arr1[h].substring((N-tagsize));
    System.out.println(bloom[0][0]);
    String zz="";
    for(int gg=0;gg<lengg;gg++)
    {zz=zz+"0";}
    arr1[h]=temp+zz+temp1;
    lol=h;
    break;
        }
    }}
    if(lol==-1)
    {System.out.println("0");}
    
           }
    
    
    }


}System.out.println("Displaying the cache memory");
System.out.println("tag array                "+"block array   ");
for(int i=0;i<arr.length;i++)
{System.out.print(arr[i]+"                      ");
for(int j=0;j<B;j++)
{
System.out.print( bloom[i][j]+"    ");

}
System.out.println();

System.out.println("_____________________________________________________________");
}
}

}}


















