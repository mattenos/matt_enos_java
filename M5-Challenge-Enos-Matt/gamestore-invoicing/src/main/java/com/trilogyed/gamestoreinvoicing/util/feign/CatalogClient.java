package com.trilogyed.gamestoreinvoicing.util.feign;

import com.trilogyed.gamestoreinvoicing.model.Console;
import com.trilogyed.gamestoreinvoicing.model.Game;
import com.trilogyed.gamestoreinvoicing.model.TShirt;
import com.trilogyed.gamestoreinvoicing.viewModel.GameViewModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

//Check catalog address in service registry
@FeignClient(name = "gamestore-catalog")
public interface CatalogClient {

    //make request with Id in path variable
    @GetMapping("/console/{id}")
    public Console findConsoleById(@PathVariable("id") long consoleId);

    @GetMapping("/game/{id}")
    public Game findGameById(@PathVariable("id") long consoleId);

    @GetMapping("/tshirt/{id}")
    public TShirt findTShirtById(@PathVariable("id") long consoleId);
}
