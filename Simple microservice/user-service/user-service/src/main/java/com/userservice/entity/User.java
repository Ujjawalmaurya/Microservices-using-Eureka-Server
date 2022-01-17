package com.userservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class User{
    @NonNull
    private Long userId;
    @NonNull
    private String userName;
    private List<Contact> contacts=new ArrayList<>();
}
