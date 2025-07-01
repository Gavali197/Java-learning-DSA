public class StringArray {
    public static void main(String[] args) {
        String Name = new String("Hemant is good devloper");
        String About = new  String(" It is good knowledge of java");
        String Hemant = Name + About;
        System.out.println(Hemant); // this is concate process join two string 
        System.out.println(Hemant.length()); //lenth 
        System.out.println(Hemant.charAt(5)); // find char using index for charAt
        System.out.println(Hemant.replace('t','n')); //replaceing process
        System.out.println(Hemant.substring(16,32)); //use for subSTring
    }
}
 