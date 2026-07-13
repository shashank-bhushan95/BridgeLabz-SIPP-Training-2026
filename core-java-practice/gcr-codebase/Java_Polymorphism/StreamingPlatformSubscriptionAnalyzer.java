package Java_Polymorphism;

class Subscription{String subscriberName,subscriptionId;Subscription(String n,String i){subscriberName=n;subscriptionId=i;}double calculateMonthlyCharge(){return 0;}}
class BasicPlan extends Subscription{BasicPlan(String n,String i){super(n,i);}double calculateMonthlyCharge(){return 199;}}
class PremiumPlan extends Subscription{PremiumPlan(String n,String i){super(n,i);}double calculateMonthlyCharge(){return 499;}}
class FamilyPlan extends Subscription{FamilyPlan(String n,String i){super(n,i);}double calculateMonthlyCharge(){return 799;}}
public class StreamingPlatformSubscriptionAnalyzer{
public static void main(String[] args){
Subscription[] s={new BasicPlan("Alice","1"),new PremiumPlan("Bob","2"),new FamilyPlan("Amy","3")};
double total=0,max=0;Subscription e=null;
for(Subscription x:s){total+=x.calculateMonthlyCharge();if(x.calculateMonthlyCharge()>max){max=x.calculateMonthlyCharge();e=x;}}
System.out.println(total);for(Subscription x:s)if(x.subscriptionId.equals("2"))System.out.println(x.subscriberName);for(Subscription x:s)if(x.subscriberName.startsWith("A"))System.out.println(x.subscriberName);System.out.println(e.subscriberName);
}
}