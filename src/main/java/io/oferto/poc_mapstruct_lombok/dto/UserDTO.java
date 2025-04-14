package io.oferto.poc_mapstruct_lombok.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class UserDTO {
    private long id;
    private String name;
    private String username;
    private boolean active;
}
