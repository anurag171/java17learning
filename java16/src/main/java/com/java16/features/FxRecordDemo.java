package com.java16.features;

import java.time.LocalDateTime;

public record FxRecordDemo(int units,
                          CurrencyPair pair,
                          double price,
                          LocalDateTime sentAt,
                          int ttl) {

}
