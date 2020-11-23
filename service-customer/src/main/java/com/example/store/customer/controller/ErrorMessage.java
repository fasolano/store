package com.example.store.customer.controller;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Builder
@Getter
@Setter
public class ErrorMessage {
    private String code;
    private List<Map<String,String>> messages;
}
