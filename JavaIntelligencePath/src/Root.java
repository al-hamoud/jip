
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class Root
{
    protected String nodeName = "";

    protected StringBuffer path = new StringBuffer();

    protected Map<String, Root> childFolder  = new HashMap<String, Root>();

    protected Root successor = null;

    public void setSuccessor(Root successor){
        this.successor = successor;
    }

    private void doChain(Root next){
        
        if(next != null){
            String addPath = next.getNodeName() + "/";
            path.insert(0, addPath);

            this.doChain(next.getSuccessor());
        }// endinf of if stmt.
        
    }// end of doChain 
    public String getFullPath(){
        String mpath = this.getNodeName();
        this.doChain(this.successor);
        
        return (path.append(mpath)).toString();
    }

    public abstract Map<String, Root> returnNodesAsMap();
    public abstract String getNodeName();
    public abstract Root getSuccessor();
    public abstract boolean IsFolder();
    public abstract Set<Root> returnNodesAsSet();
    
}/** Ending of Root*/