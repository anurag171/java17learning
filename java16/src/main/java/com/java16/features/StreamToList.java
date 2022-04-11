package com.java16.features;

import java.awt.SystemTray;
import java.util.List;
import java.util.stream.Stream;

public final class StreamToList {

  /**
   * Returns an immutable list instead of modifiable.
   * @param stream
   * @return
   */
  public static List streamToList(Stream<String> stream){
     return stream.map(String::toUpperCase).toList();
  }

  public static void multiMapDemo(Stream<String> stream) {
      stream.mapMulti((str,mapper)->{
        if(str.length()>=5){
          mapper.accept(str.toUpperCase());
        }
      }).forEachOrdered(System.out::println);
  }
}
