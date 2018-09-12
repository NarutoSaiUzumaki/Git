class ArrayaddNew {
public static void main(String []arr ) {
ArrayaddNew  c= new ArrayaddNew();
int[] a={1,2,3,4,6,5};
int[] b={2,3,4};
int [] z=c.add(a,b);
System.out.println("start main");
System.out.println(" ");
for(int temo:z){
System.out.print(" "+ temo);
}
}

int[] add(int[] a, int[] b)
{

int [] d= new int[2];
if(a.length>b.length){
  d= new int[a.length];
int j,k;
j=k=0;
System.out.print("result array : ");
for ( j=0; j<=(b.length-1); j++)
{
d[j]=(a[j]+b[j] );
System.out.print(" "+d[j]);
}

for ( k=j; k<=(a.length-1); k++)
{
d[k]=a[k];
System.out.print(" "+d[k] );
}

System.out.println();
System.out.println(" end method");
/*System.out.println(" ");
for(int t:d)
System.out.println(t);**/
}
return d;
}
}

