/** Author: Saanvi Nayak
* Purpose: Each instance of this class represents one node in the threat tree.
* Each node has a name and possibly some children threat nodes below it.
*/
import java. util.ArrayList;

public class ThreatNode {
private String threatName;
private ArrayList<ThreatNode> children;

public ThreatNode(String threatName) {
// storing the threat name and creating list for children
this.threatName = threatName;
this.children = new ArrayList<>();
}

public void addChild(ThreatNode node){
// adds a child threat below this node
children.add(node);
}

public String getThreatName(){
return threatName;
}

public ArrayList<ThreatNode> getChildren(){
return children;
}

}