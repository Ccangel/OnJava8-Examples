// files/PartsOfPaths.java
// (c)2016 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://mindviewinc.com/Books/OnJava/ for more book information.
import java.nio.file.*;

public class PartsOfPaths {
  public static void main(String[] args) {
    System.out.println(System.getProperty("os.name"));
    Path p =
      Paths.get("PartsOfPaths.java").toAbsolutePath();
    for(int i = 0; i < p.getNameCount(); i++)
      System.out.println(p.getName(i));
    Path sub = p.subpath(3, p.getNameCount() - 2);
    System.out.println(sub);
    System.out.println("ends with '.java': " +
      p.endsWith(".java"));
    for(Path pp : p) {
      System.out.print(pp + ": ");
      System.out.print(p.startsWith(pp) + " : ");
      System.out.println(p.endsWith(pp));
    }
    System.out.println("Starts with " + p.getRoot() +
      " " + p.startsWith(p.getRoot()));
  }
}
/* Output:
Windows 10
Users
Bruce
Documents
Git
on-java
ExtractedExamples
files
PartsOfPaths.java
Git\on-java\ExtractedExamples
ends with '.java': false
Users: false : false
Bruce: false : false
Documents: false : false
Git: false : false
on-java: false : false
ExtractedExamples: false : false
files: false : false
PartsOfPaths.java: false : true
Starts with C:\ true
*/