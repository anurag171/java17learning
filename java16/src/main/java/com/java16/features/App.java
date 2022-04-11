package com.java16.features;

import java.time.LocalDateTime;
import java.util.Currency;
import java.util.stream.Stream;

public class App {

  public static void main(String[] args) {
        StreamToList.streamToList(Stream.of("Berlin","Vienna","Amsterdam","Munich"));
        StreamToList.multiMapDemo(Stream.of("Java", "Valhalla", "Panama", "Loom", "Amber"));
        FxRecordDemo fxRecordDemo = new FxRecordDemo(100,
                            new CurrencyPair(Currency.getInstance("USD"),Currency.getInstance("INR")),
                              100d,
            LocalDateTime.now(),3600);

    System.out.println(fxRecordDemo.toString());

    System.out.println(PatternMatchingSwitch.formatterPatternSwitch(78.2f));
    System.out.println(PatternMatchingSwitch.formatterPatternSwitch("78.2"));
    System.out.println(PatternMatchingSwitch.formatterPatternSwitch(78));
    System.out.println(PatternMatchingSwitch.formatterPatternSwitch(78.2d));
  }
}
