package com.example.springmultipledbconnection2.model.user;

import com.example.springmultipledbconnection2.dto.UserOrders;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(schema = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
@NamedNativeQueries({
        @NamedNativeQuery(
                name = "User.findOrderByUserId",
                query = "select \n" +
                        "u.id , u.age , u.email , u.name ,\n" +
                        "u.status , p.name as product_name, p.price \n" +
                        "from user_service.`user` u \n" +
                        "inner join user_service.orders o\n" +
                        "on u.id = o.userId \n" +
                        "inner join product_service.product p \n" +
                        "on o.productId = p.id \n" +
                        "where u.id = ?1",
                resultSetMapping = "orderByUserId"
        )
})
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "orderByUserId",
                classes = @ConstructorResult(
                        targetClass = UserOrders.class,
                        columns = {
                                @ColumnResult(name = "id", type = Integer.class),
                                @ColumnResult(name = "age", type = Integer.class),
                                @ColumnResult(name = "email", type = String.class),
                                @ColumnResult(name = "name", type = String.class),
                                @ColumnResult(name = "status", type = Integer.class),
                                @ColumnResult(name = "product_name", type = String.class),
                                @ColumnResult(name = "price", type = Double.class)
                        }
                )
        )
})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private int age;

    @Column
    private String email;

    @Column
    private Integer status;
}
