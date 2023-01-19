package optional;

public class Optional {


    public static void main(String[] args) {


      String name=null;
        java.util.Optional<String> optional=java.util.Optional.ofNullable(name);
       // System.out.println(optional.orElse("no element found"));




    }
}
