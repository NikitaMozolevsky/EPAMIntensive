package com.example.epamintensivetask.request_response;

import com.example.epamintensivetask.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonRequest {

    private String firstName;
    private String lastName;
    private String patronymic;
    private String email;
    private Role role;
}

