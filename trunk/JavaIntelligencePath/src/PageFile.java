/*
 * @author Ihsan Al-Hamoud
 * @Web www.al-hamoud.com
 * @version 1.0
 */
import java.util.Set;

class PageFile extends Root
{

    public PageFile(String name)
    {
        this.nodeName = name;
    } /* Ending of PageFile **/

    @Override
    public String getNodeName() {
        return this.nodeName;
    }

    public boolean IsFolder() {
        return false;
    }

    public Set returnNodesAsSet() {
        
        return this.childFolder;
    }
    
    @Override
    protected Root getSuccessor() {
        return this.successor;
    }

}/** Ending of class PageFile*/