import java.util.Scanner;
class amstrongnumber{
public static void main(String [] args){
System.out.println("enter number:");
Scanner a = new Scanner(System.in);
int num = a.nextInt();
int copy=num;
int numcopy=num;
int sum=0;
int count=0;
while(num>0){
int rem=num%10;
count++;
num=num/10;
}
while(copy>0){
  int rem=copy%10;
int product=1;
for(int i=1;i<=count;i++){
  product=product*rem;
 }
    copy=copy/10;
   sum=sum+product;
   
}
 if(numcopy==sum){
  System.out.println("amstrong");
}else{
  System.out.println("not a amstrong");
 }
}
}


