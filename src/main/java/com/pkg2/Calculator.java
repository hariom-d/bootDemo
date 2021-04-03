package com.pkg2;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("calc")
@Data
public class Calculator {
    @Autowired
    Add add;
}
