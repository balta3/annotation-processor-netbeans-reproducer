package let.me.reproduce.annotation.processor.netbeans.reproducer;

import org.mapstruct.factory.Mappers;

public class Main {

    public static void main(String[] args) {
        var p = PersonBuilder.builder().name("John Doe").build();
        var mapper = Mappers.getMapper(CustomerMapper.class);
        var c = mapper.toCustomer(p);
        System.out.println(c);
    }
}
