/*
 * Copyright 2015 Joseph Skarulis *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.jskarulis.dealsentry;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class HomeController {

    private CountryRepository countryRepository;

    @Autowired
    public HomeController(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }
    
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello(){
        return "Hello";
    }

    /*
    @RequestMapping(value = "/countries/{countrycode}", method = RequestMethod.GET)
    public Country findOne(@PathVariable String countryCode) {
        return countryRepository.findOne(countryCode);
    }
*/
    
    @RequestMapping(value = "/countries", method = RequestMethod.GET)
    public List<Country> findAll() {
        final List<Country> countryList = new ArrayList<>();
        final Iterable<Country> countries = countryRepository.findAll();
        countries.forEach(new Consumer<Country>() {
            @Override
            public void accept(Country country) {
            	countryList.add(country);
            }
        });
        return countryList;
    }

}
