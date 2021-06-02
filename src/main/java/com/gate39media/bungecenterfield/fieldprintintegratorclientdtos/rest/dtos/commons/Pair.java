package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.commons;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pair<U, V> {
    U first;
    V second;
    static <U, V> Pair<U, V> of(U u, V v) {
        return new Pair<>(u, v);
    }
}
