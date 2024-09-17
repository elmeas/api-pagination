// src/main/java/com/example/repository/UserRepository.java
package com.elmeas.interview.repo;

import com.elmeas.interview.model.UserDTO;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;
import java.util.List;

import static org.jooq.impl.DSL.*;

@Repository
public class UserRepository {

    private final DSLContext dsl;

    public UserRepository(DSLContext dsl) {
        this.dsl = dsl;
    }

    public List<UserDTO> findAllUsers() {
        return dsl.select(field("id"), field("name"), field("age"))
                  .from(table("users"))
                  .fetch()
                  .map(record -> new UserDTO(
                      record.get("id", Long.class),
                      record.get("name", String.class),
                      record.get("age", Integer.class)
                  ));
    }
}
