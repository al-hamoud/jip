/*
 * @author Ihsan Al-Hamoud
 * @Web www.al-hamoud.com
 * @version 1.0
 *
 * Adding Iteration pattern
 * coming very soon
 */
public class Main
{

    public static void main(String[] args)
    {
        //Initialize three composite folders

        PageFile index = new PageFile("index.jsp");

        
        /** / */
        CompositeFolder root = new CompositeFolder("MyApp");

        /**  /en/ */
        CompositeFolder en = new CompositeFolder("en");
        root.add(en);

        /** /ar */
        CompositeFolder ar = new CompositeFolder("ar");
        root.add(ar);

        CompositeFolder fr  = new CompositeFolder("fr");
        root.add(fr);

        /** /en/home/ */
        CompositeFolder homeEN = new CompositeFolder("HOME");

                /* Adding home folder into en folder **/
        en.add(homeEN);
        homeEN.add(index);

        /** /en/courses/ */
        CompositeFolder coursesEN = new CompositeFolder("Courses");
        
        coursesEN.add(new PageFile("index.html"));

         /** /ar/home/ */
        CompositeFolder homeAR = new CompositeFolder("Home");

         /** /ar/courses/ */
        CompositeFolder coursesAR = new CompositeFolder("Courses");

        /* Adding courses folder into en folder **/
        en.add(coursesEN);

        /* Adding home folder into ar folder **/
        ar.add(homeAR);

        /* Adding courses folder into ar folder **/
        ar.add(coursesAR);

        System.out.println(index.getFullPath());

  }// end of main method
    
}/// end of class

   