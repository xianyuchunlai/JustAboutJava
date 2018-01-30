import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author:chunLai
 * @Date: Created in 14:01 2018/1/12
 * @Ver.No:
 * @Description:
 * @param:
 * @ModifiedBy:
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        XStream xStream=new XStream ( new DomDriver () );

        User user = new User ( "liSi", "123" );
        User user1 = new User ( "zhangSan", "123" );
        User user2 = new User ( "wangWu", "123" );
        List<User> users = new ArrayList<> ();
        users.add ( user );
        users.add ( user1 );
        users.add ( user2 );
        Person person = new Person ( users );
//    xStream.toXML ( person,new FileOutputStream ( "src/person.xml" ) );

        Person o = (Person) xStream.fromXML ( new FileInputStream ( "src/person.xml" ) );
        List<User> users1=o.getUsers ();
        System.out.println (o);

    }
}
