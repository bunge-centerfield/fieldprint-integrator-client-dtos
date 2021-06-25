package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
@NoArgsConstructor
@AllArgsConstructor
public class Pair<U, V> {
    U first;
    V second;
    public static <U, V> Pair<U, V> of(U u, V v) {
        return new Pair<>(u, v);
    }
}
