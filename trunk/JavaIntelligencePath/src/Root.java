/*
 * @author Ihsan Al-Hamoud
 * @web www.al-hamoud.com
 * @Project JIA "Java Intelligence Path" Framework
 * @version 1.0
 *
 *
 * @pattern Composite & Chain of Responsibility
 * @class superclass Root
 * @type abstract
 * @access public
 *
 * @intent
 * Compose objects into tree structures to represent part-whole hierarchies
 * The composite pattern implements Transparently instead of Safety,
 * to implement the Chain of Responsibility pattern
 * by instantiating an instance of Root that presents a successor in CoR
 * inside the Root class itself 
 */


import java.util.HashSet;
import java.util.Set;

public abstract class Root
{
    private static final String SLASH = "/";
    
    protected String nodeName = "";

    private StringBuffer path = new StringBuffer();

    protected Set<Root> childFolder  = new HashSet<Root>();

    protected Root successor = null;

    public void setSuccessor(Root successor){
        this.successor = successor;
    }

    private void doChain(Root next){
        
        if(next != null){
            String addPath = next.getNodeName() + Root.SLASH;
            path.insert(0, addPath);
            this.doChain(next.getSuccessor());
        }// endinf of if stmt.
        
    }// end of doChain 
    public String getFullPath(){
        String mpath = this.getNodeName();
        this.doChain(this.successor);
        
        return (path.append(mpath)).toString();
    }
    public abstract String getNodeName();
    public abstract Root getSuccessor();
    public abstract boolean IsFolder();
    public abstract Set<Root> returnNodesAsSet();
    
}/** Ending of Root*/