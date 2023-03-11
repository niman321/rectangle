package Class28;

import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args) {
        LinkedList<String> subjects = new LinkedList<>();
        subjects.add("SDLC");
        subjects.add("manual Testing");
        subjects.add("jira");
        subjects.add("git");
        subjects.add("java");

        LinkedList<String> futureSubjects = new LinkedList<>();
        futureSubjects.add("selenium");
        futureSubjects.add("testing");
        futureSubjects.add("cucumber");
        futureSubjects.add("sql");
        futureSubjects.add("APIs");
        futureSubjects.add("jenkins");

        LinkedList allSubjects=new LinkedList();
        allSubjects.addAll(subjects);
        allSubjects.addAll(futureSubjects);
       // System.out.println(allSubjects);
       // allSubjects.removeAll(allSubjects);
       // System.out.println(allSubjects);



        LinkedList<String> subjectsILike=new LinkedList<>();
        subjectsILike.add("java");
        subjectsILike.add("SDLC");
        subjectsILike.add("SQL");
        allSubjects.removeAll(subjectsILike);
        System.out.println(allSubjects);
        System.out.println(subjectsILike);



    }
}
