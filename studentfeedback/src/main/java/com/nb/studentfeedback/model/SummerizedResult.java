package com.nb.studentfeedback.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SummerizedResult {
    private String result;
    private String name;
    private int rating;

}
