import java.util.*;

class TrainInfo{
	int trainNum;
	String tName;
	String source;
	String dest;
	int distance;
	TrainInfo(int trainNum, String tName, String source, String dest, int distance){
		this.trainNum = trainNum;
		this.tName = tName;
		this.source = source;
		this.dest = dest;
		this.distance = distance;
	}
}
public class TrainMenuProg{
void printlist(ArrayList<TrainInfo> list){
Iterator itr = list.iterator();
while(itr.hasNext()){
TrainInfo t = (TrainInfo)itr.next();
System.out.println(t.trainNum + " .... " + t.tName + " .... " + t.source + " .... " +
t.dest + " .... " + t.distance);
}
}
public static Comparator<TrainInfo> trainNumComparator = new
Comparator<TrainInfo>(){
public int compare(TrainInfo t1, TrainInfo t2){
int trainNum1 = t1.trainNum;
int trainNum2 = t2.trainNum;
return trainNum1 - trainNum2;
}
};
public static Comparator<TrainInfo> tNameComparator = new
Comparator<TrainInfo>(){
public int compare(TrainInfo n1, TrainInfo n2){
String tName1 = n1.tName.toUpperCase();
String tName2 = n2.tName.toUpperCase();
return tName1.compareTo(tName2);
}
};
public static Comparator<TrainInfo> SourceComparator = new
Comparator<TrainInfo>(){
public int compare(TrainInfo s1, TrainInfo s2){
String source1 = s1.source.toUpperCase();
String source2 = s2.source.toUpperCase();
return source1.compareTo(source2);
}
};
public static Comparator<TrainInfo> DistanceComparator = new
Comparator<TrainInfo>(){
public int compare(TrainInfo d1, TrainInfo d2){
int distance1 = d1.distance;
int distance2 = d2.distance;
return distance1 - distance2;
}
};
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
ArrayList<TrainInfo> list = new ArrayList<TrainInfo>();
TrainMenuProg tobj = new TrainMenuProg();
tobj.printlist(list);
int a=1;
while(a!=0){
System.out.println("\n Welcome!! Please select one to continue....\n\n1. Add new Train as train number,name,source,destination and distance.");
System.out.println("2. Display train information");
System.out.println("3. Sort train details according to Train number");
System.out.println("4. Sort train details according to Train name");
System.out.println("5. Sort train details according to source");
System.out.println("6. Sort train details according to distance");
System.out.println("0. Exit");
a = sc.nextInt();
switch(a){
case 1:
System.out.println("\nAdd details...\n");
System.out.print("Enter Train number : ");
int trainNum = sc.nextInt();
System.out.print("Enter Train Name : ");
String tName = sc.nextLine();
tName = sc.nextLine();
System.out.print("Enter source : ");
String source = sc.nextLine();
System.out.print("Enter Desitnation : ");
String dest = sc.nextLine();
System.out.print("Enter total distance : ");
int distance = sc.nextInt();
TrainInfo entry = new TrainInfo(trainNum, tName, source,
dest, distance);
list.add(entry);
System.out.println("\n Train Details added.");
break;
case 2:
tobj.printlist(list);
break;
case 3:
Collections.sort(list,TrainMenuProg.trainNumComparator);
System.out.println("The train details sorted according to Train number");
break;
case 4:
Collections.sort(list, TrainMenuProg.tNameComparator);
System.out.println("The train details sorted according to Train name");
break;
case 5:
Collections.sort(list, TrainMenuProg.SourceComparator);
System.out.println("The train details sorted according to source");
break;
case 6:
Collections.sort(list, TrainMenuProg.DistanceComparator);
System.out.println("The train details sorted according to distance");
break;
case 0:
System.out.println("\nExit.");
break;
default:
System.out.println("Invalid input, please choose a number from 0 to 6");
break;
}
}
}
}