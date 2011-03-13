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
    /* @access private
     * @type static & final
     * @String
     * @name SLASH
     * @value "/"
     */
    private static final String SLASH = "/";

    /* @access protected
     * @type dynamic
     * @String
     * @name nodeName
     * @intent to store the name of node 'Folder or file'
     */
    protected String nodeName = "";

    /* @access private
     * @type dynamic
     * @StringBuffer
     * @name path
     * @intent to store the full path of the node
     */
    private StringBuffer path = new StringBuffer();

    /* @access protected
     * @type dynamic
     * @Set<Root>
     * @name childFolder
     * @intent to store the child node into current node
     */
    protected Set<Root> childFolder  = new HashSet<Root>();

    /* @access protected
     * @type dynamic
     * @Root
     * @name successor
     * @intent to set the parent of current node
     */
    protected Root successor = null;

    /*
     * @method
     * @name setSuccessor
     * @access public
     * @param Root successor
     * @return void
     * @intent to set the successor 'parent'
     */
    public void setSuccessor(Root successor){
        this.successor = successor;
    }/* Ending of setSuccessor method **/

    /*
     * @method
     * @name doChain
     * @access private
     * @param Root next
     * @return void
     * @intent to get every parent in the tree
         * untill get into the root of the tree
         * to build the full path of the node.
     */
    private void doChain(Root next){

        /* if next is null that means it's in the root of tree **/
        if(next != null){
           
            /*@access internal
            * @type dynamic
            * @String
            * @name addPath
            * @intent to start building the full path by giving
             * the the current node
            */
            String addPath = next.getNodeName() + Root.SLASH;

            /* call insert method inside StringBuffer path */
            path.insert(0, addPath);
            /* call doChain inside current node iteration by iteration*/
            this.doChain(next.getSuccessor());
        }// endinf of if stmt.
        
    }// end of doChain

     /*
     * @method
     * @name getFullPath
     * @access public
     * @param void
     * @return String
     * @intent to retrieve the full path of the given node
     */
    public String getFullPath(){
        String currentPath = this.getNodeName();
        this.doChain(this.successor);
        
        return (path.append(currentPath)).toString();
    }// Ending of getFullPath method
    
    public abstract String getNodeName();
    public abstract Root getSuccessor();
    public abstract boolean IsFolder();
    public abstract Set<Root> returnNodesAsSet();
    
}/** Ending of Root*/