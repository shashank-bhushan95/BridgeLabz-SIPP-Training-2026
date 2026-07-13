package Java_TwoPointers_SlidingWindow;
import java.util.*;
public class TripletsLoadBalancing{
public static void main(String[] args){
int[] a={100,200,300,400,500};
int target=900;
Arrays.sort(a);
for(int i=0;i<a.length-2;i++){
int l=i+1,r=a.length-1;
while(l<r){
int s=a[i]+a[l]+a[r];
if(s==target){System.out.println(a[i]+" "+a[l]+" "+a[r]);l++;r--;}
else if(s<target)l++;else r--;
}}
}
}