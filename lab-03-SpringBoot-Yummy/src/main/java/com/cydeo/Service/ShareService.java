package com.cydeo.Service;

import com.cydeo.model.Recipe;
import org.springframework.stereotype.Component;

public interface ShareService {
    void share(Recipe recipe);
}
