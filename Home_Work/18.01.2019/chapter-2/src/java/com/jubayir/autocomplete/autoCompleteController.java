
package com.jubayir.autocomplete;

import java.util.ArrayList;
import java.util.List;

public class autoCompleteController {
    public List<String> complete(String input){
    
        List<String> result = new ArrayList<>();
        
        for (int i = 0; i <10; i++){
        result.add(input + i);
        }
        return result;
    }
    
}
