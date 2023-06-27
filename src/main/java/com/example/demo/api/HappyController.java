package com.example.demo.api;

import com.example.demo.model.MxxModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/happy")
public class HappyController {
    @Autowired
    MxxModel model;

    @GetMapping(value = "/mxx")
    public MxxModel mxx() {
        return model;
    }

    @PostMapping(value = "/mxx")
    public MxxModel setMxx(@RequestBody MxxModel mxx) {
        model.setValue(mxx.getValue());
        return mxx;
    }
}