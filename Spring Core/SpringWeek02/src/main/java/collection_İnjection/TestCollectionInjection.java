package collection_İnjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollectionInjection {

    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("file:src/main/resources/applicationContextCollection.xml");
        CollectionInjection collectionInjection=context.getBean("collectionBean",CollectionInjection.class);

        System.out.println(collectionInjection);


    }
}
