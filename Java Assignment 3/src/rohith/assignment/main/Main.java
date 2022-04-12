package rohith.assignment.main;

import rohith.assignment.data.DefaultInitializationAssignment;
import rohith.assignment.singleton.singleTon;
public class Main {
    DefaultInitializationAssignment obj1 = new DefaultInitializationAssignment();
    obj1.printVariable();
    singleTon obj=new singleTon();
    singleTon returnedObj=obj.initialize("rohith",obj);
    returnedObj.printString();
}
