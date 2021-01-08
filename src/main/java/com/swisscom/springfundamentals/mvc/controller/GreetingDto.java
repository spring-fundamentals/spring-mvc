package com.swisscom.springfundamentals.mvc.controller;

import java.time.LocalDate;

public class GreetingDto {

  private String greeting;
  private String name;
  private LocalDate greetingDate;

  public GreetingDto(String greeting, String name) {
    this.greeting = greeting;
    this.name = name;
    this.greetingDate = LocalDate.now();
  }

  public String getGreeting() {
    return greeting;
  }

  public String getName() {
    return name;
  }

  public LocalDate getGreetingDate() {
    return greetingDate;
  }
}
