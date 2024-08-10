package let.me.reproduce.annotation.processor.netbeans.reproducer;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface CustomerMapper {
    @Mapping(source = "name", target = "name")
    Customer toCustomer(Person person);
}
