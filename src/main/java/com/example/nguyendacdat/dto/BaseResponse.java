package com.example.nguyendacdat.dto;

public class BaseResponse<T> {
    public int status = 1;
    public String message = "success";
    public T data;
}
