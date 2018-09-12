class ArrayaddRan {

public static void main(String []hi ) 
{
ArrayaddRan  d= new ArrayaddRan();
 double[] arr1={1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8};
 double[] arr2={1.9,2.9,3.9,4.9};
 double[] res= d.merge(arr1,arr2);
for(double temo: res)
System.out.print(" "+ temo);
}

double[] merge(double[] arr3, double[] arr4){
double a[];
if(arr3.length==arr4.length){
a=new double[arr3.length+arr4.length];
for(int i=0;i<2*(arr3.length);i++)
{
a[(2*i)]=arr3[i];
a[(2*i+1)]=arr4[i];
}
}

else if(arr3.length>arr4.length){
a= new double[(arr3.length+arr4.length)];
int i,j;
for(i=0;i<(arr4.length);i++)
{
a[(2*i)]=arr3[i];
a[(2*i+1)]=arr4[i];
}
for(j=i;j<2*(arr4.length);i++)
{

a[]=arr4[i];
}
int q=arr3.length-arr4.length;
for ( int k=i; k<(q+i); k++)
{
a[k]=arr3[k-arr4.length];
}
}
else
{
a=new double[0];
}
return a;
}
}