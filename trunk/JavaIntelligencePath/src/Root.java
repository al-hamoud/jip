
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class Root
{
    protected String nodeName = "";

    protected String path = "";

    protected Map<String, Root> childFolder  = new HashMap<String, Root>();

    protected Root successor = null;

    public void setSuccessor(Root successor){
        this.successor = successor;
    }

    private void doChain(String path, Root next){
        
        if(next == null){
            this.path = path;
        }// endinf of if stmt.

        else{
            path += next.getNodeName();
            this.doChain(path, next.getSuccessor());
        }// end of else stmt.
        
    }// end of doChain 
    public String getFullPath(){
        String mpath = this.getNodeName();
        this.doChain(mpath, this.successor);
        
        return this.path;
    }

    public abstract Map<String, Root> returnNodesAsMap();
    public abstract String getNodeName();
    public abstract Root getSuccessor();
    public abstract boolean IsFolder();
    public abstract Set<Root> returnNodesAsSet();
    
}/** Ending of Root*/