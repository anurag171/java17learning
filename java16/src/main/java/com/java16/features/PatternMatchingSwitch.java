package com.java16.features;

public class PatternMatchingSwitch {


  static String formatterPatternSwitch(Object o) {
    return switch (o) {
      case Integer i -> String.format("int %d", i);
      case Long l    -> String.format("long %d", l);
      case Double d  -> String.format("double %f", d);
      case String s  -> String.format("String %s", s);
      case Float f   -> String.format("float %f",f);
      default        -> o.toString();
    };
  }


}
