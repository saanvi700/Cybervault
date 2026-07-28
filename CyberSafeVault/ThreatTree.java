/**
Author: Saanvi Nayak
Purpose: Displays the threat tree by printing the nodes and recursively
traversing its children.
*/

public class ThreatTree {


public static void displayThreats(ThreatNode node) {

// printing the current threat name
System.out.println(node.getThreatName());

// iterating through each child and displaying them as well
for(ThreatNode child : node.getChildren()){
displayThreats(child);
}
}
}