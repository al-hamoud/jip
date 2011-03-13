
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
    public boolean add(Root folder)
    {
        if(childFolder.contains(folder)){
            return false;
            //throw new UnsupportedOperationException("Not supported yet.");
        } else{
            childFolder.add(folder);
            return true;
        }
        
        
    } /* Ending of add method **/
    //Removes the root from the composition.
    public boolean remove(Root folder)
    {
          if(childFolder.contains(folder)){
            return false;
            //throw new UnsupportedOperationException("Not supported yet.");
        } else{
            childFolder.remove(folder);
            return true;
        }

    } /* Ending of remove method **/
    public Set returnNodesAsSet()
    {
        return this.childFolder;
    }/* Ending of returnNodesAsSet **/

    public boolean IsFolder() {
        return true;
    }

    @Override
    public Root getSuccessor() {
        
        return this.successor;
    }

} /** Ending of class CompositeFolder */