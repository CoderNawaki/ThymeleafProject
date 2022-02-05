
package com.lama.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

public class TodoItem {
    
    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    private String title;

    private boolean completed;
}
