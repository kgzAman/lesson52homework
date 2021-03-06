package kz.attractorschool.moviereviewrr.model;

import kz.attractorschool.moviereviewrr.util.Generator;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Data
@Document(collection="users")
@CompoundIndex(def = "{'email': 1,'name':1}")
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@AllArgsConstructor
public class User {

    public static User random() {
        return builder()
                .email(Generator.makeEmail())
                .name(Generator.makeName())
                .build();
    }

    @Id
    @Builder.Default
    private String id = UUID.randomUUID().toString();

    @Indexed
    private String email;
    private String name;
}
