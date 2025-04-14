package io.oferto.poc_mapstruct_lombok.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class User {
    private long id;
    private String name;
    private String username;
    private String password;
    private boolean active;
}
