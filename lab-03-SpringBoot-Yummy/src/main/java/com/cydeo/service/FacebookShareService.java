package com.cydeo.service;

import com.cydeo.model.Recipe;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("FACE")
public class FacebookShareService implements ShareService {

    @Override
    public void share(Recipe recipe) {
        System.out.println("Sharing on Facebook: " + recipe);
    }
}
