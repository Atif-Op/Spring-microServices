package foreach;

interface Message {
        String value(String m,String n);
    }

    public class ForEach {

        public static void main(String[] args) {

            Message m = (m1,n) -> "hello" + m1+n;
            System.out.println(m.value("world","world1"));
        }
    }



