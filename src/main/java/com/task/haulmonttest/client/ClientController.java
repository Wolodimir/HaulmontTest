package com.task.haulmonttest.client;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@Controller
@RequestMapping("")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping()
    public String clientListPage(Model model){
        Client client = new Client(UUID.randomUUID(),"Vova","8800", "Pochta", "98234");
        clientService.save(client);

        model.addAttribute("clients", clientService.getAll());
        return "client_list";
    }

    //TODO Make a link to this page
    @GetMapping("/addClient")
    public String addClientPage(){
        //TODO Make a template
        return "";
    }

    @PostMapping("/addClient")
    public String addClient(){
        return "redirect:/clients";
    }
}
