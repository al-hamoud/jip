/*
 * @author Ihsan Al-Hamoud
 * @Web www.al-hamoud.com
 * @version 1.0
 */
public class Main
{

    public static void main(String[] args)
    {
        //Initialize three composite folders

        PageFile index = new PageFile("index.php");

        
        /** / */
        CompositeFolder root = new CompositeFolder();

        /**  /en/ */
        CompositeFolder en = new CompositeFolder("en-US");
        en.setSuccessor(root);

        /** /ar */
        CompositeFolder ar = new CompositeFolder("ar");
        ar.setSuccessor(root);

        CompositeFolder fr  = new CompositeFolder("en");
        fr.setSuccessor(root);
        //Composes the folders

        /** /en/home/ */
        CompositeFolder homeEN = new CompositeFolder("HOME");
        homeEN.setSuccessor(en);

        homeEN.add(index);
        index.setSuccessor(homeEN);

        /** /en/courses/ */
        CompositeFolder coursesEN = new CompositeFolder("Courses");
        coursesEN.setSuccessor(en);
        
        coursesEN.add(new PageFile("index.html"));

         /** /ar/home/ */
        CompositeFolder homeAR = new CompositeFolder("Home");
        homeAR.setSuccessor(ar);

         /** /ar/courses/ */
        CompositeFolder coursesAR = new CompositeFolder("Courses");
        coursesAR.setSuccessor(ar);

                /* Adding en folder into Root **/
        root.add(en);

        /* Adding ar folder into Root **/
        if (root.add(ar)){
            System.out.println("it's done");
        }else{
            System.out.println("unfortunately");
        }

        /* Adding home folder into en folder **/
        en.add(homeEN);

        /* Adding courses folder into en folder **/
        en.add(coursesEN);

        /* Adding home folder into ar folder **/
        ar.add(homeAR);

        /* Adding courses folder into ar folder **/
        ar.add(coursesAR);

        System.out.println(homeEN.getFullPath());

  }// end of main method
    
}/// end of class

   