/** Client */
public class Main
{

    public static void main(String[] args)
    {
        //Initialize three composite folders

        PageFile index = new PageFile("index.php");

        
        /** / */
        CompositeFolder root = new CompositeFolder("/");

        /**  /en/ */
        CompositeFolder en = new CompositeFolder("en");
        en.setSuccessor(root);

        /** /ar */
        CompositeFolder ar = new CompositeFolder("ar");
        ar.setSuccessor(root);

        CompositeFolder fr  = new CompositeFolder("en");
        fr.setSuccessor(root);
        //Composes the folders

        /** /en/home/ */
        CompositeFolder homeEN = new CompositeFolder("Home");
        homeEN.setSuccessor(en);

        homeEN.add("index", index);
        index.setSuccessor(homeEN);

        /** /en/courses/ */
        CompositeFolder coursesEN = new CompositeFolder("Courses");
        coursesEN.setSuccessor(en);
        
        coursesEN.add("index", new PageFile("index.html"));

         /** /ar/home/ */
        CompositeFolder homeAR = new CompositeFolder("Home");
        homeAR.setSuccessor(ar);

         /** /ar/courses/ */
        CompositeFolder coursesAR = new CompositeFolder("Courses");
        coursesAR.setSuccessor(ar);

                /* Adding en folder into Root **/
        root.add("en-us", en);

        /* Adding ar folder into Root **/
        if (root.add("ar-eg", ar)){
            System.out.println("it's done");
        }else{
            System.out.println("unfortunately");
        }

        /* Adding home folder into en folder **/
        en.add("Home", homeEN);

        /* Adding courses folder into en folder **/
        en.add("Courses", coursesEN);

        /* Adding home folder into ar folder **/
        ar.add("Home", homeAR);

        /* Adding courses folder into ar folder **/
        ar.add("Courses", coursesAR);

        homeEN.add("default", new PageFile("default.jsp"));

        System.out.println("" + index.getFullPath());

  }// end of main method
    
}/// end of class

   