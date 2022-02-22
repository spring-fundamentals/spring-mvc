package com.springfundamentals.mvc.controller;

import java.time.LocalDate;

public class GreetingDto {

  private final String greeting;
  private final String name;
  private final LocalDate greetingDate;

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
