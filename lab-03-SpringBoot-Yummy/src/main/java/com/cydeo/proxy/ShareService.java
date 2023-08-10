package com.cydeo.proxy;

import com.cydeo.model.Recipe;
import org.springframework.stereotype.Component;

public interface ShareService {
    void share(Recipe recipe);
}
