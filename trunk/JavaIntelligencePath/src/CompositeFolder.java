
import java.util.Map;
import java.util.Set;

class CompositeFolder extends Root
{
    public CompositeFolder(String nodeName)
    {
        this.nodeName = nodeName;
    }

    public CompositeFolder(){
    }
    
    @Override
    public String getNodeName()
    {
        return this.nodeName;
    }
    //Adds the root to the composition.
    public boolean add(String nodeName, Root folder)
    {
        if(childFolder.containsKey(nodeName)){
            return false;
            //throw new UnsupportedOperationException("Not supported yet.");
        } else{
            childFolder.put(nodeName, folder);
            return true;
        }
        
        
    } /* Ending of add method **/
    //Removes the root from the composition.
    public boolean remove(String nodeName)
    {
          if(childFolder.containsKey(nodeName)){
            return false;
            //throw new UnsupportedOperationException("Not supported yet.");
        } else{
            childFolder.remove(nodeName);
            return true;
        }

    } /* Ending of remove method **/
    public Set returnNodesAsSet()
    {
        return this.childFolder.entrySet();
    }/* Ending of returnNodesAsSet **/

    public boolean IsFolder() {
        return true;
    }

    @Override
    public Root getSuccessor() {
        
        return this.successor;
    }

    @Override
    public Map<String, Root> returnNodesAsMap() {
        return this.childFolder;
    }

} /** Ending of class CompositeFolder */